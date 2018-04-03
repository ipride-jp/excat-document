package packages.p04;

import exceptions.E04.E0403;
import exceptions.E04.E040301;

public class C04c {
	public void m01() throws E040301 {
		throw new E040301();
	}
	
	public void m02() throws E0403 {
		m01();
	}
	
	public void m03() throws E0403 {
		m02();
	}
}
