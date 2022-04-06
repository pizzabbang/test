package sample5_유하나;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		
		
		PersonImpl person=new PersonImpl("아이유",20,170,"음악감상");
		StudentImpl student=new StudentImpl();
		student.setKor(80);
		student.setEng(70);
	
		MyInfo info=new MyInfo(person);
		info.setStu(student);
		info.PersonPrint();
		info.StudentPrint();
		
		
		
		Resource resource = new ClassPathResource("app4.xml");  
		BeanFactory factory = new XmlBeanFactory(resource);
		MyInfo info2 = factory.getBean("info",MyInfo.class);
		info2.PersonPrint();
		info2.StudentPrint();
		

	}

}
