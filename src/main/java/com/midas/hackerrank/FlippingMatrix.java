package com.midas.hackerrank;

import java.util.List;

public class FlippingMatrix {

    public static int flippingMatrixHackerank(List<List<Integer>> matrix) {
        // Write your code here
        int maxSum = 0;
        int size = matrix.size();

        for(int i =0 ; i < matrix.size()/2; i++){
            System.out.println(matrix.get(i) +" at index "+i);
            for(int j = 0; j< matrix.get(0).size()/2; j++){


                System.out.println(matrix.get(i).get(j)+" at index "+i+" , "+j);
                maxSum += Math.max(matrix.get(i).get(j),Math.max(matrix.get(i).get(size-j-1),Math.max(matrix.get(size-i-1).get(j),matrix.get(size-i-1).get(size-j-1))));
                System.out.println("Total Sum "+maxSum);
            }
        }

        return maxSum;

    }
}
