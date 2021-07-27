/**
 * 
 */
package com.project.start.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.start.service.TestService;

/**
 * @author kesha
 *
 */

@RestController
public class TestController {
	
	@Autowired
	TestService testService;
	
	
	@GetMapping("/manipulate")
	public Map<String, String> getManupulatedValues(@RequestParam String str){
		
		
		Map<String, String> resultMap = new HashMap<>();
		
		String manipulate = testService.manipulate(str);
		
		resultMap.put("result", manipulate);
		
		return resultMap;
		
	}

}
