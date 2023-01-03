package com.qsp.statements.statics.controller;

import java.util.List;

import com.qsp.statements.statics.dto.Employ;
import com.qsp.statements.statics.service.EmployService;

public class EmployController {

	public static void main(String[] args) {
		
		Employ employ = new Employ();
		
		EmployService employService = new EmployService();
		
		boolean b = true;
		
		while(b) {
			switch (4) {
			case 1:{
				employ.setId(101);
				employ.setName("vishal");
				employ.setEmail("tejinder@gmail.com");
				employService.insertEmploy(employ);
			}break;
			
			case 2:{
				employ.setId(2001);
				employ.setName("shyam");
				employService.updateEmploy(employ);
			}break;
			case 3:{
				employ.setId(2001);
				
				employService.deleteEmploy(employ);

			}break;
            case 4:{
				
				List<Employ> employees =employService.displayEmploy();
				for(Employ employee2:employees) {
						System.out.println(employee2.getId());
						System.out.println(employee2.getName());
						System.out.println(employee2.getEmail());
						System.out.println(".....................................");
						
				}
			}break;
			default:
				break;
			}
			
			b=false;
		}
		
		
	}

}
