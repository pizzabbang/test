package sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CircleMain {
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("app1.xml"); //Resource는 부모타입, 어느 파일에 bean을 작성했냐 
		BeanFactory factory = new XmlBeanFactory(resource); // bean이 만들어짐
		PointImpl point = (PointImpl)factory.getBean("point"); //point로 관리하는 bean을 갖고와라
		System.out.println(point.getXpos());
		System.out.println(point.getYpos());
		
		CircleImpl circle=(CircleImpl)factory.getBean("circle");
		circle.display();
		circle.getArea();
	}
}
