package com.midas.hackerrank;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class ThreshholdIOTDevice {
    public static void main(String[] args) {

        int threshold = 45;
        long time = 1427723278405L;
        String status = "STOPPED";
        long total_pages = 1;
        String dateSr = "04-2019";

        SimpleDateFormat sdf = new SimpleDateFormat();


        List<String> list = new ArrayList<>();

        URL url = null;
        try {
            url = new URL("https://jsonmock.hackerrank.com/api/iot_devices/search?status="+status+"&page=1");
            HttpURLConnection conn = (HttpURLConnection)
                    url.openConnection();

            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type","application/json");
            conn.setRequestProperty("Accept","application/json");

            conn.disconnect();


            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) { //success
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JSONParser parser = new JSONParser();
                JSONObject json = (JSONObject) parser.parse(response.toString());
                total_pages = (long) json.get("total_pages");
                System.out.println("-------------------"+json.get("total_pages"));

            } else {
                System.out.println("GET request did not work.");
            }


            for(int i = 1; i<=total_pages; i++){

                URL uri = new URL("https://jsonmock.hackerrank.com/api/iot_devices/search?status="+status+"&page="+i);

                System.out.println("Page "+i);

                HttpURLConnection con = (HttpURLConnection)
                        uri.openConnection();

                con.setRequestMethod("GET");
                con.setRequestProperty("Content-Type","application/json");
                con.setRequestProperty("Accept","application/json");

                con.disconnect();


                if (con.getResponseCode() == HttpURLConnection.HTTP_OK) { //success
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    JSONParser parser = new JSONParser();
                    JSONObject json = (JSONObject) parser.parse(response.toString());
                    JSONArray array = (JSONArray) parser.parse(json.get("data").toString());

                    System.out.println(json.get("data").toString());

                    Iterator<JSONObject> it = array.iterator();
                    while (it.hasNext()) {

                        JSONObject data = it.next();
                        ArticleUsers.Comments comments = new ArticleUsers.Comments();

                        JSONObject operatingParams = (JSONObject) data.get("operatingParams");

                        if(operatingParams.get("rootThreshold")!= null && data.get("timestamp")!=null){

                            sdf = new SimpleDateFormat();
                            sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

                            Date date = new Date(time);

                            String dateFormat = date.getMonth() + "-"+date.getYear();

                            int compare = Double.compare(Double.valueOf((Double) operatingParams.get("rootThreshold")), Double.valueOf(threshold));

                            if(compare>0 && dateFormat.equals(dateFormat)){
                                list.add(data.get("timestamp").toString());
                            }



                        }

                    }

                } else {
                    System.out.println("GET request did not work.");
                }}
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("---------"+list.stream().count());
        list.stream().count();


    }
}
