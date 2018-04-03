package packages.p02;

import exceptions.E02.E020101;

public class C02 {
	public void m01() throws E020101 {
		throw new E020101();
	}
	
	public void m02() {
		try {
			m01();
		} catch (E020101 e) {
			e.printStackTrace();
		}
	}
	
	public void m03() {
		m02();
	}
}
