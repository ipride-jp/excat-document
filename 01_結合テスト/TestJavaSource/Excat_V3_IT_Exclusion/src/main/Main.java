package main;

import exceptions.E03.E0302;
import exceptions.E04.E040101;
import exceptions.E04.E040201;
import exceptions.E04.E0403;
import exceptions.E04.E0404;
import packages.p01.*;
import packages.p02.*;
import packages.p03.*;
import packages.p04.*;

public class Main {
	
	public static void main(String[] args){
		C01  c01  = new C01();
		C02  c02  = new C02();
		C03  c03  = new C03();
		C04a c04a = new C04a();
		C04b c04b = new C04b();
		C04c c04c = new C04c();
		C04d c04d = new C04d();
		
		c01.m03();
		
		c02.m03();
		
		try {
			c03.m03();
		} catch (E0302 e) {
			e.printStackTrace();
		}
		
		try {
			c04a.m03();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			c04b.m03();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			c04c.m03();
		} catch (E0403 e) {
			e.printStackTrace();
		}
		
		try {
			c04d.m03();
		} catch (E0404 e) {
			e.printStackTrace();
		}
	}
}
