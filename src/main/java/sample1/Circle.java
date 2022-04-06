package sample1;

public class Circle {
	private double radius; //반지름
	private Point point;
	
	public Circle(double radius, Point point) { // 주입(Injection)
		super();
		this.radius = radius;
		this.point = point;
	}
	
	public void display() {
		System.out.println("원의 중심:"+point.getXpos()+","+point.getYpos());
	}
	
	public void getArea() {
		System.out.println("원의 면적:"+Math.pow(radius, 2)*Math.PI);
	}
}
