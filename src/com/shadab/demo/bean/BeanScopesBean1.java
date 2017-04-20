/**
 * 
 */
package com.shadab.demo.bean;

/**
 * @author Shadab
 * 
 *
 */
public class BeanScopesBean1 {

	/**
	 * 
	 */
	public BeanScopesBean1() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
	
	public void initilizeMyBean(){
		System.out.println("initialized Bean 1");
	}
	public void destroyMyBean(){
		System.out.println("beandestroyed Bean 1");
	}

}

