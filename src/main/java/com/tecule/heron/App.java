package com.tecule.heron;

import com.tecule.heron.service.CustomerService;
import com.tecule.heron.service.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		try {
			CustomerService customerService = new CustomerServiceImpl();
			customerService.create("a", "1");
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
        System.out.println( "Hello World!" );
    }
}
