package in.awesh.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
	Object obj=ac.getBean("eserv");
	System.out.println(obj);
	ac.close();
}
}
