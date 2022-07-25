package com.arraypgms;

public class BubbleSort {
	public static void main(String[] args) {
	int a[]= {7,8,3,6,1,9,2,5}; 
	int temp;
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
				temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
    for(int n:a) {
    	System.out.println(n);
	}

}
	}
	

