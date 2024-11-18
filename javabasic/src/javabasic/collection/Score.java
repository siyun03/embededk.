package javabasic.collection;

public class Score extends ScoreMain {
	// 3명의 이름과 국어,영어,수학 성적을 입력받아
	// ex) 홍길동은 국어 100점 영어 90점 수학 80점 총점 270점
	static int kor;
	static int eng;
	static int math;
	int total = (kor+eng+math);

	public Score(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}

//	public void Score (int kor) {
//		this.kor = kor;		
//	}
//	
//	public void Score1 (int eng) {
//		this.eng = eng;
//	}
//	
//	public void Score2 (int math) {
//		this.math = math;
//	}
//	
	
	
	@Override
	public String toString() {
		return  Student.name +"은(는) "
				+"국어점수 " + Score.kor
				+"영어점수 " + Score.eng
				+"수학점수 " + Score.math
				+"총합은 " + total ;
	}
}
	