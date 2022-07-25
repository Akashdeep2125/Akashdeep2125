package com.arraypgms;

public class DiagonalSum {

	public static void main(String[] args) {
		int sum=0;
		int[][] a= {{1,2,3,4,5},
				    {6,7,8,9,10},
				    {11,12,13,14,15},
				    {16,17,18,19,20},
				    {21,22,23,24,25}};
		for(int i=0;i<a.length;i++) {
			sum+=a[i][i];
			if(i!=a.length/2) {
				sum+=a[i][a.length-i-1];
			}
			}
	System.out.println(sum);
	}

}
