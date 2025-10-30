package com.demo.test;
import java.util.Scanner;

import com.demo.service.Array2D;

public class Test2DArray {

	public static void main(String[] args) {
	
		
		int[][] arr= {{4,5,6},{3,4,5},{1,2,3}};
		int[][] arr1= {{1,5,6},{3,2,7},{10,20,30}};
	
		Scanner sc=new Scanner(System.in);
		
		Array2D.displayData(arr);
		Array2D.displayData(arr1);
		int choice=0;
		do {
		System.out.println("1. add all numbers\n2. add rowwise\n3.columnwise addition");
		System.out.println("4. find max of all numbers\n 5. maximum rowwise\n6. find maximum columnwise");
		System.out.println("7. add 2 arrays\n8. multiply array\n9. find transpose of array");
		System.out.println("10. check identity matrix\n11. rotate matrix rows\n 12. rotate matrix columns");
		System.out.println("13. convert to 1D array\n 14. exit\nchoice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			int ans=Array2D.addAllNumbers(arr);
			System.out.println("Addition : "+ans);
			break;
		case 2:
			int[] arradd=Array2D.addRowwise(arr);
			for(int i=0;i<arradd.length;i++) {
				System.out.println(arradd[i]);
			}
		
			break;
		case 3:
			 arradd=Array2D.columnwise(arr);
			for(int i=0;i<arradd.length;i++) {
				System.out.println(arradd[i]);
			}
			
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			int[][] addition=Array2D.add2Darrays(arr,arr1);
			Array2D.displayData(addition);
			break;
		case 8:
			int[][] multiply=Array2D.multiplyArray(arr,arr1);
			if(multiply!=null) {
				Array2D.displayData(multiply);
			}else {
				System.out.println("multiplication not possible");
			}
			break;
		case 9:
			int[][] temp=Array2D.findTranspose(arr);
			Array2D.displayData(temp);
			break;
		case 10:
			boolean status=Array2D.checkIdentity(arr);
			if(status)  
				System.out.println("It is identity matrix");
			else
				System.out.println("It is not identity matrix");
			break;
		case 11:
			System.out.println("Enter number of rotation");
			int n=sc.nextInt();
			int[][] newarr=Array2D.rotateRow(arr,n);
			Array2D.displayData(newarr);
			break;
		case 12:
			System.out.println("Enter number of rotation for column");
			n=sc.nextInt();
			newarr=Array2D.rotateColumn(arr,n);
			Array2D.displayData(newarr);
			break;
		case 13:
			int[] arr2=Array2D.convertTo1DArray(arr);
			for(int val:arr2) {
				System.out.print(val+",");
			}
			System.out.println();
			break;
		case 14:
			System.out.println("Thank you for visiting.....");
			break;
		default:
			System.out.println("choice is wrong");
			break;
		}
		}while(choice!=14);

	}

}
