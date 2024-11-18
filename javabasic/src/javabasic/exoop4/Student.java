package javabasic.exoop4;

public class Student {
// score 이너클래스 생성
	
/*	
  	int math;
	int english;
	int korean;
	int total = (math+english+korean);
	int average = ((math+english+korean)/3);
	
	
	public Student(int math,int english,int korean,int score,int average) {
		this.math = math;
		this.english = english;
		this.korean = korean;
		this.total = total;
		this.average = average;
		
	}
*/	
	String name;
	Score score;
	
	public Student(String name,Score score) {
		this.name = name;
		this.score = score;
		
	}

	class Score{
		
		int kor;
		int eng;
		int math;
		int sum;
		float avg; // 평균
		
		public Score(int kor,int eng, int math, int sum, float avg) {
			super();
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.sum = sum;
			this.avg = avg;			
		}
		
		public int getSum() {
			return kor + eng + math;
		}
		
		public float getAvg() {
			return getSum()/3;
		}
		
	} // class score
	
} // class
