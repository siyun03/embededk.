package javabasic;

public class _04_java {
	
	public static void main(String[] args) {
		//4명 150점 이상
		String[][] strArr = {
			{"사과","90","80","70"},
			{"딸기","80","70","60"},
			{"수박","70","60","50"},
			{"홍시","60","50","40"}			
		};
		int[] scoreArr = {0,0,0,0};
		
		scoreArr[0] =1;
		scoreArr[1] =2;
		
		int strArrLength = strArr.length; //4
		int strArrLength0 = strArr[0].length; //4
		int scoreArrLength = scoreArr.length; //4
		
		for (int i = 0; i < strArrLength; i ++ ) {
			for (int j = 0; j <strArrLength0; j ++) {
				if(j>0) { 
					scoreArr[i] += Integer.parseInt(strArr[i][j]) ;
				}if (scoreArr[i]>= 150) {
					System.out.println(scoreArr[i]);
				}
			}
		}
		
		//scoreArr[i] 이 총점이 150점 이상인 경우만 출력
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
