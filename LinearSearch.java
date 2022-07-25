package com.arraypgms;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a={3,5,2,7,1,9,8,4};
		System.out.println(("The position of the element: ")+Search(a,5));
		System.out.println(("The position of the element: ")+Search(a,8));
	}
static int Search(int[] a,int s) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==s)
			return i;
	}
return -1;
}
}
