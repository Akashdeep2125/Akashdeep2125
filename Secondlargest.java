package com.arraypgms;

public class Secondlargest {
	public static void main(String[] args) {
		int a[]= {7,4,7,5,3,1,8,6,2 };
        int s1=a[0];
        int s2=a[1];
        for(int i=2;i<a.length;i++) {
        	if(a[i]==s1) {
        		continue;
        	}
        	if(a[i]<s1) {
        		s2=s1;
        		s1=a[i];
        	}
        else if(s1==s2||a[i]<s2) {
        s2=a[i];	
        }
        }
	System.out.println(s2);
}
}
