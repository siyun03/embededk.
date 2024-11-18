package javabasic;

public class ExLoopStatement3 {
	public static void main(String[] args) {
		
		
		
		//1
				// i : 0  j : 0 
				// i : 1  j : 01
				// i : 2  j : 012
				// i : 3  j : 0123
				// i : 4  j : 01234
				for (int i=0; i<5; i++) {// 줄의 수 i
					for (int j=0; j<i+1; j++) {// 별의 수 j
						System.out.print("*");				
					}
					System.out.println(); //줄 바꿈
				}
		//2
				//1 =0 , j = 01234
				for (int i=0 ; i<5; i++) { //줄
					for (int j =6; i<j-1; j--) {//별
						System.out.print("*");
					}
					System.out.println();
				}
								
	   //3
				// i = 0 , j= 0 , k = 01234
				// i = 1 , j= 01 , k = 0123
				// i = 2 , j= 012 , k = 012
				// i = 3 , j= 0123 , k = 01
				// i = 4 , j= 01234 , k = 0
				
				for (int i=0; i<5; i++) {
					for (int j=0; j<i-1; j++) {
						System.out.print("o");
					}
				}
					for (int k=0; k <5 ; k++) {
						System.out.print("*");
					}
	
		
											
		//4
					for (int ii=0; ii<5; ii++){
						for (int j =1; j<1; j=j+2) {
						System.out.print("*");
						}
					}
					for (int kk=0; kk<1;kk++)
						for(int l=8; l>1; l++);
					
				
					
					
					
					
					
   }
}
