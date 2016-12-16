package com.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.mkyong.rest.HelloWorldService;

public class HelloWorldTest {

	HelloWorldService HWSObj = new HelloWorldService();
	@Test
	public void test1() {
		
		 assertEquals("Hello world", HWSObj.method1());
	}
	
	@Test
	public void test2() {
		
		 assertEquals(1, HWSObj.method2());
	}

}
