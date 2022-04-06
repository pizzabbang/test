package sample4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		//CalcBeanImpl cal=new CalcBeanImpl(4);
		//cal.setSu1(30);
		//cal.calculate();
		
		//Resource resource = new ClassPathResource("app2.xml"); //Resource는 부모타입, 어느 파일에 bean을 작성했냐 
		//BeanFactory factory = new XmlBeanFactory(resource); // bean이 만들어짐
		
		//위의 두 줄을 한 줄로 대신 가능하다
		//AbstractApplicationContext factory = new GenericXmlApplicationContext("app2.xml"); 
		
		//이 문장도 두 줄 대신 가능하다
		ApplicationContext factory = new ClassPathXmlApplicationContext("app2.xml");
		
		//CalcBeanImpl cal = (CalcBeanImpl)factory.getBean("cal"); //cal로 관리하는 bean을 갖고와라
		CalcBeanImpl cal = factory.getBean("cal",CalcBeanImpl.class); //위의 문장을 이렇게 써도 된다ㅣ
		cal.calculate();
		
		//MessageBeanImpl message=new MessageBeanImpl("아이유");
		//message.setGreeting("안녕!");
		//message.sayHello();
		
		MessageBeanImpl message = (MessageBeanImpl)factory.getBean("message"); 
		message.sayHello();
	}

}
