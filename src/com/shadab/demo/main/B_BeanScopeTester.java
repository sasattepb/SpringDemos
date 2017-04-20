package com.shadab.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shadab.demo.bean.BeanScopesBean1;
import com.shadab.demo.bean.BeanScopesBean2;

public class B_BeanScopeTester {

	public static void main(String[] args) {

		// TODO Auto-generated constructor stub
		System.out.println("gonna start App Here");
		AbstractApplicationContext applicationContextObject = new ClassPathXmlApplicationContext("BeanScopes.xml");
		BeanScopesBean1 beanScopes1=(BeanScopesBean1)applicationContextObject.getBean("bean1");
		BeanScopesBean2 beanScopes2=(BeanScopesBean2)applicationContextObject.getBean("bean2");
		
		System.out.println(beanScopes1.getName());
		System.out.println(beanScopes2.getName());
		BeanScopesBean1 beanScopes11=(BeanScopesBean1)applicationContextObject.getBean("bean1");
		BeanScopesBean2 beanScopes22=(BeanScopesBean2)applicationContextObject.getBean("bean2");
		
		System.out.println(beanScopes11.getName());
		System.out.println(beanScopes22.getName());
		applicationContextObject.registerShutdownHook();
		
		

		
	
	}

}
