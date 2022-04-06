package sample5_유하나;

public class StudentImpl implements Student{
	private int kor;
	private int eng;
	
	//setter 통한 주입
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
}
