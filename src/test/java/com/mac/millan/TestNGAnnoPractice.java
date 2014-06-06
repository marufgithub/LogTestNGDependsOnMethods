package com.mac.millan;

//import java.util.logging.Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGAnnoPractice {
	private static Logger log = Logger.getLogger(TestNGAnnoPractice.class.getName());
	
	@BeforeClass
	public void beforeClass(){
//		System.out.println("I am from beforeClass method");
		DOMConfigurator.configure("log4j.xml");
		log.info("I am from beforeClass method");
	}
	
	@Test
	public void test1(){
//		System.out.println("I am from test1 method");
		log.info("I am from test1 method");
	}
	@Test(dependsOnMethods="test1")
	public void test2(){
//		System.out.println("I am from test2 method");
		log.info("I am from test2 method");
	}
	@Test(dependsOnMethods="test2")
	public void test3(){
//		System.out.println("I am from test3 method");
		log.info("I am from test3 method");
	}
	@AfterMethod
	public void afterMetod(){
//		System.out.println("I am from afterMetod method");
		log.info("I am from afterMetod method");
	}
	@AfterClass
	public void afterClass(){
//		System.out.println("I am from afterClass method");
		log.info("I am from afterClass method");
	}

}
