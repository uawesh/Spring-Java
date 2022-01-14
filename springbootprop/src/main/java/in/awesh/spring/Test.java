package in.awesh.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	 public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		Object obj=ac.getBean("dbCon");
		System.out.println(obj);
				
	}
}
