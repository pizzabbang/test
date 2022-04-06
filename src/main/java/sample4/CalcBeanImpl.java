package sample4;

public class CalcBeanImpl implements CalcBean{
	
	private int su1; // setter 통한 주입
	private int su2; // 생성자 통한 주입
	
	public CalcBeanImpl(int su2) {
		this.su2=su2;
	}
	
	public CalcBeanImpl() {
		
	}
	
	@Override
	public void calculate() {
		System.out.println("덧셈:"+(su1+su2));
		System.out.println("뺄셈:"+(su1-su2));
		System.out.println("곱셈:"+(su1*su2));
		System.out.println("나눗셈:"+(su1/su2));
	}

	public int getSu1() {
		return su1;
	}

	public void setSu1(int su1) {
		this.su1 = su1;
	}
	
	

}
