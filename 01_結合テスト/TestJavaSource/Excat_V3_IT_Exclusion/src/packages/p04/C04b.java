package packages.p04;

import exceptions.E04.E0402;
import exceptions.E04.E040201;

public class C04b {
	public void m01() throws E0402 {
		throw new E0402();
	}
	
	public void m02() throws E040201 {
		try {
			m01();
		} catch (E0402 e) {
			e.printStackTrace();
			throw (E040201)e;
		}
	}
	
	public void m03() throws E040201 {
		m02();
	}
}
