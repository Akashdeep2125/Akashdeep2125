package com.pattern;

public class Spiral {

	public static void main(String[] args) {
		int n= 10;
		int [] [] A=new int[n][n]; 
		int i=1;
		int fR=0,fC=0,lR=n-1,lC=n-1;
		System.out.println("Spiral matrix: ");
		while(i<=(n*n)) {
		for(int j=fC;j<=lC;j++) 
			A[fR][j]=i++;
		for(int j=fR+1;j<=lR;j++) 
			A[j][lC]=i++;
		for(int j=lC-1;j>=fC;j--) 
			A[lR][j]=i++;
		for(int j=lR-1;j>=fR+1;j--) 
			A[j][fC]=i++;
		//pointers
		fR++;fC++;lR--;lC--;
		}
	for(i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(A[i][j]+"\t");
			System.out.print(""); 
		}
	System.out.println();
	}
	}

}
