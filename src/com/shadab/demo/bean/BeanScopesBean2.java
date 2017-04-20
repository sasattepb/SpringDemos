/**
 * 
 */
package com.shadab.demo.bean;

/**
 * @author Shadab
 * 
 *
 */
public class BeanScopesBean2 {

	/**
	 * 
	 */
	public BeanScopesBean2() {
		// TODO Auto-generated constructor stub
	}
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void initilizeMyBean(){
		System.out.println("initialized Bean2");
	}
	public void destroyMyBean(){
		System.out.println("beandestroyed Bean2");
	}

}

