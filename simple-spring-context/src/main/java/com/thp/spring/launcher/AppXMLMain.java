package com.thp.spring.launcher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thp.spring.simplecontext.Moussaillon;
import com.thp.spring.simplecontext.config.AppConfig;

public class AppXMLMain {

	public static void main(String[] args) {
		
	      AnnotationConfigApplicationContext context = 
	              new AnnotationConfigApplicationContext(AppConfig.class);

	      Moussaillon moussaillon = context.getBean(Moussaillon.class);
		// TODO Auto-generated method stub
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
//		Moussaillon moussaillon = context.getBean("moussaillon", Moussaillon.class);
		System.out.println(" result "+moussaillon.toString());

	}

}
