package com.arraypgms;

public class Insertionsort {
	public static void main(String[] args) {
		int a[]= {3,6,4,5,7,8,9,1,2};
for(int i=1;i<a.length;i++) {
	int key=a[i];
	int j=i-1;
	while(j>-1&&a[j]>key) {
		a[j+1]=a[j];
		j--;
	}
	a[j+1]=key;
}
	for(int n:a) {
		System.out.println(n);
	}
}
}
