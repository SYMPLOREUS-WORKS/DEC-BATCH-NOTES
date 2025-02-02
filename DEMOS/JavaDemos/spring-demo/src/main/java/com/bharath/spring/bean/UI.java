package com.bharath.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UI {
	public static void main(String[] args) {

		try {
			Class cl = Class.forName("com.bharath.spring.bean.BeanConfiguration");
			// Class cl2 = BeanConfiguration.class;
			// BeanConfiguration bc = new BeanConfiguration();
			// Class c = bc.getClass();
			ApplicationContext context = new AnnotationConfigApplicationContext(cl);
			Controller controller = context.getBean(Controller.class);
			Controller controller2 = (Controller) context.getBean("ctrl");

			// System.out.println(controller.hashCode() + " " + controller2.hashCode());

			// DummyClass dummy = context.getBean(DummyClass.class);

			// controller.controller();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
