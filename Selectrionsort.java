package com.arraypgms;

public class Selectrionsort {
	public static void main(String[] args) {
	int a[]= {3,7,5,1,8,2,9,4};
	for(int i=0;i<a.length-1;i++) {
		int index=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[index]) {
				index=j;
			}
		}
	if(i!=index) {
		int temp=a[i];
		a[i]=a[index];
		a[index]=temp;
	}
	}
	for(int n:a) {
		System.out.println(n);
	}
	}
	}

