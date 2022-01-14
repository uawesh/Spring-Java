package in.awesh.sender;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
	ac.scan("in.awesh.sender");
	ac.refresh();
	Object ob=ac.getBean("emailSender");
	System.out.println(ob);
}
}
