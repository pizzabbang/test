package sample5_유하나;

public class MyInfo {
	private Person per;
	private Student stu;

	public MyInfo(Person per) {
		super();
		this.per = per;
	}

	public Person getPer() {
		return per;
	}

	public void setPer(Person per) {
		this.per = per;
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public void PersonPrint() {
		System.out.println("이름:"+per.getName());
		System.out.println("나이:"+per.getAge());
		System.out.println("키:"+per.getHeight());
		System.out.println("취미:"+per.getHobby());
	}
	
	public void StudentPrint() {
		System.out.println("국어:"+stu.getKor());
		System.out.println("영어:"+stu.getEng());
	}
}
