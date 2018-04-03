package packages.p03;

import exceptions.E03.E0301;
import exceptions.E03.E0302;

public class C03 {
	public void m01() throws E0301 {
		throw new E0301();
	}
	
	public void m02() throws E0302 {
		try {
			m01();
		} catch (E0301 e) {
			e.printStackTrace();
			throw new E0302();
		}
	}
	
	public void m03() throws E0302 {
		m02();
	}
}
