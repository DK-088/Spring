package com.edu;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext a = new ClassPathXmlApplicationContext("SpringContext.xml");
		
		Product p = (Product) a.getBean("product");
		
		p.display();
		
		Product p1 = (Product) a.getBean("product1");
		
		p1.display();

	}

}
