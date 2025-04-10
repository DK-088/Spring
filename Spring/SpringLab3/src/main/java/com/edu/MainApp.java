package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext conext = new ClassPathXmlApplicationContext("SpringContext.xml");
		
		Product p = (Product) conext.getBean("product");
		
		p.display();

	}

}
