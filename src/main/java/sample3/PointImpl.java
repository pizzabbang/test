package sample3;

//DI: Dependency Injection 의존 주입

public class PointImpl implements Point{
	private double xpos; // x좌표
	private double ypos; // y좌표
	
	public PointImpl() {
		System.out.println("PointImpl() 생성자");
	}
	
	@Override
	public double getXpos() {
		return xpos;
	}

	@Override
	public void setXpos(double xpos) {
		this.xpos = xpos;
	}

	@Override
	public double getYpos() {
		return ypos;
	}

	@Override
	public void setYpos(double ypos) {
		this.ypos = ypos;
	}

}
