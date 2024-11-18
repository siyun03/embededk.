package javabasic;

import java.util.Iterator;
import java.util.Scanner;

public class ExLoopStatement4 {

	public static void main(String[] args) {
		//1  

		for (int i=0; i<5; i ++) {

			for (int j=0; j < i; j++) {

		System.out.print("*");

		}System.out.println("");

		}
		//2  

		for (int i = 5; i > 0; i--) {

		    for (int j = 0; j < i; j++) {

		        System.out.print("*");

		    } System.out.println("");

		}

		//3 

		for (int i = 5 ; i > 0; i--) {
	
				for (int j = 0; j < 5-i; j++) {
	
						System.out.print(" ");
						}
	
					for(int k=0; k < i; k++) { 
	
						System.out.print("*");
	
					}
					System.out.println(""); 

		}

		//4

		 for (int i = 1; i <= 5; i++) {

		            for (int j = 5 - i; j > 0;  j --) {

		            	  System.out.print(" ");; // 공백 출력

		            }  
		
			 for (int k = 1; k <= 2 * i -1; k++) {
	
			                System.out.print("*"); // 별 출력
			         
			            }   
			 System.out.println();          
		 }
		 
//		    *
//		   ***
//		  *****
//		   ***
//		     * j = 5 - 2*k
//			   k = (Math.abs(2-i));
		 
		 
		 
		 for (int i = 0; i < 5; i++) {
			 
			 for (int k = 0 ; k < (Math.abs(2-i)) ; k ++ ){
				 System.out.print("o");
			 }
			 for (int j =0 ; j < (-2*Math.abs(2-i)+5) ;j ++ ) {
					 System.out.print("*");
			}		
			System.out.println("");
		 } 			
		 
		 // 3ㅇㅣ상의 홀수 찍으면 마름모 
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("3 이상의 홀수를 입력하세요.");
		 int num1 = sc.nextInt();
		 
		 for (int i = 0; i < num1; i++) {
			 int mathk = Math.abs((num1/2)-i);
			 //int mathj = -2*mathk+num1;
			
			 for (int k = 0; k < mathk; k++) {
					System.out.print("o");	 		
			}
			 for (int j = 0; j <  -2*mathk+num1; j++) {
					System.out.print("*");
			}System.out.println("");
		}
		
		 
		 
		 
		 
		 
		 
		 
		 
		 

		}// main
	// Extra 실습)

}// class
