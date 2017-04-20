/**
 * 
 */
package com.shadab.demo.main;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shadab.demo.bean.MobileBean;

/**
 * @author Shadab
 *
 */
public class A_MySampleAppStarter {

	/**
	 * 
	 */
	public A_MySampleAppStarter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("gonna start App Here");
		ApplicationContext applicationContextObject = new ClassPathXmlApplicationContext("MyAppConfig.xml");
		MobileBean mobileBean = (MobileBean) applicationContextObject.getBean("mobile");
		System.out.println("mobile name is: " + mobileBean.getMobileCompany() + " " + mobileBean.getMobileModel());
		System.out.println("Mobile price : $" + mobileBean.getMobilePrice());

	}

}
