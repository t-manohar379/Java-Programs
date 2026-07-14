package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergingofTwoArraysZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the Size of an Array 1 : ");
		int size1 = sc.nextInt();
		int [] arr1 = new int [size1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("Enter the Size of Array 2 : ");
		int size2 = sc.nextInt();
		int [] arr2 = new int [size2];
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}
		
		int n = arr1.length+arr2.length;
		int [] arr3 =new int[n];
        int j=0;
        int k=0;
        if(arr1.length<arr2.length) {
        	for(int i=0;i<arr3.length;i++) {
        			if(j<arr1.length) {
        				arr3[i++]=arr1[j++];
        			}
        			if(k<arr2.length) {
        				arr3[i]=arr2[k++];
        		}
        	}
        }
        else {
		for(int i=0;i<arr3.length;i++) {
			if(j<arr1.length) {
				arr3[i]=arr1[j++];
			}
			if(k<arr2.length) {
				arr3[++i]=arr2[k++];
			}
		}
        }
		System.out.println(Arrays.toString(arr3));

	}

	}


