package com.project.start;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.project.start.service.TestService;

public class ServiceImplTest {
	
	
	@Mock
	TestService testService;
	
	@Test
	public void manupalteTest() {
		
		String expected = "DCAB";
		
		assertEquals(expected, testService.manipulate("ABCD"));
		
		
	}
	

}
