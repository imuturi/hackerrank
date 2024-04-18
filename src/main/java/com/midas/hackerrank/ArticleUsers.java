package com.midas.hackerrank;



    import org.json.simple.JSONArray;
    import org.json.simple.JSONObject;
    import org.json.simple.parser.JSONParser;
    import org.json.simple.parser.ParseException;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.client.RestTemplate;
    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
    import java.net.MalformedURLException;
    import java.net.ProtocolException;
    import java.net.URL;
    import java.util.*;
    import java.util.stream.Collectors;

public class ArticleUsers {
    public static void main(String[] args) {

        int limit = 2;

        long total_pages = 1;
        ArrayList<Comments> titles = new ArrayList<>();

        URL url = null;
        try {
            url = new URL("https://jsonmock.hackerrank.com/api/articles?page=1");
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

                URL uri = new URL("https://jsonmock.hackerrank.com/api/articles?page="+i);

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
                        Comments comments = new Comments();


                        if(data.get("title")!= null && data.get("num_comments")!=null){

                            comments.setTitle(data.get("title").toString());
                            comments.setNumOfComments((long) data.get("num_comments"));

                            titles.add(comments);

                        }else if(data.get("story_title")!= null && data.get("num_comments")!=null){
                            comments.setTitle(data.get("story_title").toString());
                            comments.setNumOfComments((long) data.get("num_comments"));

                            titles.add(comments);
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


        titles.stream()
                .sorted(Comparator.comparing(t -> t.numOfComments, Comparator.reverseOrder())).limit(limit).map(t -> t.getNumOfComments()).forEach(System.out::println);

        List<String> list = titles.stream()
                .sorted(Comparator.comparing(t -> t.numOfComments, Comparator.reverseOrder())).limit(limit)
                .map(t -> t.getTitle()).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        list.stream().forEach(System.out::println);

    }

    public static class Comments{

        String title;
        long numOfComments;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public long getNumOfComments() {
            return numOfComments;
        }

        public void setNumOfComments(long numOfComments) {
            this.numOfComments = numOfComments;
        }
    }


}
