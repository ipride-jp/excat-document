package packages.p02;

import exceptions.E02.E0201;
import packages.p03.C03;

public class C02 {
	public void m01() throws E0201 {
		throw new E0201();
	}
	
	public void m02() throws E0201 {
		m01();
	}
	
	public void m03() {
		try {
			m02();
		} catch (E0201 e) {
			e.printStackTrace();
		}
	}
	
	public void m04() {
		m03();
	}
	
	public void m05() throws E0201 {
		C03 c03 = new C03();
		c03.m02();
	}
}
