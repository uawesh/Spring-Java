package com.awesh.collections.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awesh.collections.Product;

public class Master {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	Product pd=ac.getBean("prod",Product.class);
	System.out.println(pd);
	System.out.println(pd.getPdims().getClass().getName());
	System.out.println(pd.getColours().getClass().getName());

}
}
