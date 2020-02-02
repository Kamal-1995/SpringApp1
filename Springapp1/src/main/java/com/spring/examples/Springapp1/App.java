package com.spring.examples.Springapp1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
				
		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
	    Vehicle v = (Vehicle) factory.getBean("vehicle"); 
	    v.drive();
		Student stu = (Student) factory.getBean("Student");
		stu.showStudentName();
		
	}
}
