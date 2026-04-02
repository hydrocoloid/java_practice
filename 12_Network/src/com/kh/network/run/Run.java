package com.kh.network.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		
		try {
			InetAddress localHost = InetAddress.getLocalHost();
			
			System.out.println(localHost);
			System.out.println(localHost.getHostName());
			System.out.println(localHost.getHostAddress());
			System.out.println();
			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			System.out.println(googleHost);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
