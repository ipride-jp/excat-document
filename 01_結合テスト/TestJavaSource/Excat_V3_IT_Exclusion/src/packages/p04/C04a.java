package packages.p04;

import exceptions.E04.E0401;
import exceptions.E04.E040101;

public class C04a {
	public void m01() throws E0401 {
		throw new E0401();
	}
	
	public void m02() throws E0401 {
		m01();
	}
	
	public void m03() throws E040101 {
		try {
			m02();
		} catch (E0401 e) {
			e.printStackTrace();
			throw (E040101)e;
		}
	}
}
