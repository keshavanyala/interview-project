/**
 * 
 */
package com.project.start.serviceimpl;

import org.springframework.stereotype.Service;

import com.project.start.service.TestService;

/**
 * @author kesha
 *
 */
@Service
public class TestServiceImple implements TestService {

	@Override
	public String manipulate(String str) {
		
		String result = "";
		
		if(str.length()%2==0) {
			
			int subLength = str.length()/2;
			
			String substring1 = str.substring(0,subLength);
			String substring2 = str.substring(subLength,str.length());
			result = substring2.reverse()+substring1
			
		}else {
			
			int subLength = str.length()/2;
			
			String substring1 = str.substring(0,Math.round(subLength));
			String substring2 = str.substring(Math.round(subLength),str.length());
			
			result = substring2.reverse()+substring1;
			
		}
		
		return result;
	}

}
