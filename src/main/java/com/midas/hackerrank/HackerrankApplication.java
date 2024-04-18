package com.midas.hackerrank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootApplication
public class HackerrankApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackerrankApplication.class, args);

		FlippingMatrix flippingMatrix = new FlippingMatrix();
		FindZigZagSequence findZigZagSequence = new FindZigZagSequence();
		List<List<Integer>> matrix;
		matrix = List.of(List.of(112,142,83,119),List.of(56,125,56,49),List.of(15,78,101,43),List.of(62,98,114,108));

		//flippingMatrix.flippingMatrixHackerank(matrix);

		int [] a = {2,3,5,1,4};
		//findZigZagSequence.findZigZagSequence(a, a.length);

		int[] A = {1, 3, 6, 4, 1, 2};
		int[] B = {1, 2, 3};
//		int[] C = {−1, −3};
		solution(B);

	}

	public static int solution(int[] A) {
		// Implement your solution here

		A = IntStream.of(A).sorted().toArray();
		int MinValue = 0;


		for(int i = 1; i<A.length; i++){

			System.out.println("List"+A[i]);

			if(A[i]==A[i-1]+1){
			}
			else{
				MinValue = 	A[i]-1;
			}
		}

		if(MinValue==0){
			MinValue=A[A.length-1]+1;
		}

		if(A[A.length-1]<1){
			MinValue = 1;
		}

		System.out.println("Minimum Value::::::::::::: "+MinValue);
		return MinValue;

	}

}
