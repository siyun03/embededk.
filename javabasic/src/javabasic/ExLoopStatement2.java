package javabasic;

import java.util.Scanner;

public class ExLoopStatement2 {
	
	public static void main(String[] args) {
		
		Scanner sacnner = new Scanner(System.in) ;
		System.out.println("두 수를 입력하세요");

		int c = sacnner.nextInt();
		int d = sacnner.nextInt();
		 
		 if (c + d > 10){System.out.println("두 수의 합이 10 보다 큽니다.");}
		 else {System.out.println("두 수의 합이 10보다 크지 않습니다.");}
		 
		System.out.println(""); 
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("점수를 입력하세요.");
		 		 	 
		 int a = sacnner.nextInt();
		 
		 		if (a >=91 ) {System.out.println("A");}
		else if (a<=90 && a>=81) {System.out.println("B");}
		else if (a<=80 && a>=71) {System.out.println("C");}
		else if (a<=70 && a>=61) {System.out.println("D");}
		else {System.out.println("F");
		
		System.out.println("");
		
		
		Scanner sacnner1= new Scanner(System.in);
		System.out.println("구구단 입력하세요");
		
		int k = sacnner.nextInt();
		for (int gk=1; 0<gk && gk<10; gk++) {
			System.out.println(k+"x"+gk+"="+(k*gk));

		}
			
		
		
	/*
		for (int g=1;g<10;g++) {
			for(int g1=1;g1<10;g1++) {
				System.out.println(g + "x"+g1 +"=" +(g*g1));
			}

		}
		*/
		
		
		
	
			}// main
	}}//class
