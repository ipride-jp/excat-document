package packages.p01;

import exceptions.E01.E0101;

public class C01 {
	public void m01() throws E0101 {
		throw new E0101();
	}
	
	public void m02() throws E0101 {
		m01();
	}
	
	public void m03() {
		try {
			m02();
		} catch (E0101 e) {
			e.printStackTrace();
		}
	}
}
