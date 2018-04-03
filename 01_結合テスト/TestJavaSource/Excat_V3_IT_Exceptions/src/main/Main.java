package main;

import exceptions.E01.E0101;
import exceptions.E01.E0102;
import exceptions.E02.E0201;
import packages.p01.C01a;
import packages.p01.C01b;
import packages.p02.C02;
import packages.p03.C03;

public class Main {
	
	public static void main(String[] args){
		C01a c01a = new C01a();
		C01b c01b = new C01b();
		C02  c02  = new C02();
		C03  c03  = new C03();
		
		try {
			c01a.m01();
		} catch (E0101 e) {
			e.printStackTrace();
		}
		
		try {
			c01a.m02();
		} catch (E0102 e) {
			e.printStackTrace();
		}
		
		try {
			c01b.m01();
		} catch (E0101 e) {
			e.printStackTrace();
		}
		
		try {
			c01b.m02();
		} catch (E0101 e1) {
			e1.printStackTrace();
		}
		
		c02.m03();
		
		c02.m04();
		
		try {
			c03.m02();
		} catch (E0201 e) {
			e.printStackTrace();
		}
		
		try {
			c02.m05();
		} catch (E0201 e) {
			e.printStackTrace();
		}
		
	}
}
