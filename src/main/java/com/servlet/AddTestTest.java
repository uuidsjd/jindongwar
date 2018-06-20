package com.servlet;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddTestTest {
	AddTest addtest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("这是setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("这是tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		addtest = new AddTest();
		System.out.println("这是setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("这是tearDown");
	}

	@Test
	public void testAdd() {
		System.out.println("这是测试方法");
		//fail("Not yet implemented");
		assertEquals(3, addtest.Add(1, 2));
	}

	public static void main(String[] args){
		
		BigDecimal price1 = new BigDecimal("10");
		BigDecimal price2 = new BigDecimal("5.12434");
		System.out.println(price2.divide(price1, 4, BigDecimal.ROUND_HALF_UP));
		System.out.println(price2.scale());
		
	}
}
