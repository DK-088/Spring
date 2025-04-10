package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

//		Student s = new Student();
//		s.Marks();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
//		Student s1 = (Student)
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springcontext.xml");
		Student s1=(Student) context.getBean("Student");
		s1.display();


	}

}
