package packages.p03;

import exceptions.E02.E0201;
import packages.p02.C02;

public class C03 {
	public void m01() throws E0201 {
		C02 c02 = new C02();
		c02.m02();
	}
	
	public void m02() throws E0201 {
		C02 c02 = new C02();
		c02.m01();
	}
}
