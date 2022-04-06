package sample3;

public class CircleImpl implements Circle{
	private double radius; //반지름
	private Point point;
	
	/*
	 * public CircleImpl() {
	 * 
	 * }
	 */
	
	public CircleImpl(double radius, Point point) { // 주입(Injection)
		super();
		System.out.println("CircleImpl(double radius, Point point) 생성자");
		this.radius = radius;
		this.point = point;
	}
	@Override
	public void display() {
		System.out.println("원의 중심:"+point.getXpos()+","+point.getYpos());
		
	}

	@Override
	public void getArea() {
		System.out.println("원의 면적:"+Math.pow(radius, 2)*Math.PI);
	}

}
