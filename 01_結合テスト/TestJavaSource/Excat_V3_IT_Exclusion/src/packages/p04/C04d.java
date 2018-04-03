package packages.p04;

import exceptions.E04.E0404;
import exceptions.E04.E040401;

public class C04d {
	public void m01() throws E040401 {
		throw new E040401();
	}
	
	public void m02() throws E040401 {
		m01();
	}
	
	public void m03() throws E0404 {
		m02();
	}
}
