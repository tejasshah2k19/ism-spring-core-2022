package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.StudentBean;
import com.bean.UserBean;
import com.controller.SignupController;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

//		SignupController signup = new SignupController();

		// ioc container ->
		// spring container->

		// interface
		// 1 -> BeanFactory
		// 2 -> ApplicationContext

		// class
		// ClassPathXmlApplicationContext

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context);//started 

		SignupController s1 = context.getBean("signupController", SignupController.class);
		SignupController s2 = context.getBean("signupController", SignupController.class);
		SignupController s3 = context.getBean("signupController", SignupController.class);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		UserBean u = (UserBean) context.getBean("user");
		System.out.println(u.getFirstName());

		StudentBean sb = context.getBean("student", StudentBean.class);
		System.out.println(sb.getFirstName());
		
		context.getBean("emp");

		context.registerShutdownHook();

	}
}

//scope -> singleton , prototype, request,session,global-session
