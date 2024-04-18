package com.midas.hackerrank;

public class TowerBreakers {

    public static void main(String[] args) {
        int numOfTowers = 58097;
        int heightOfTowers = 459353;


        //P1 3,4,2,5,1

        //P2 3,4,2,5,1

        //P1 4-1,2,3
        //P2 1-no

        //P1 wins

        int winner = 0;


        if(numOfTowers==1 && numOfTowers%2==0){
            winner = 2;
        }else{
            winner = 1;
        }

        System.out.println("Player "+winner+" is the winner-------------------"+numOfTowers%2);

    }

}
