package packages.p01;

import exceptions.E01.E0101;
import exceptions.E01.E0102;

public class C01a {
	public void m01() throws E0101 {
		throw new E0101();
	}
	
	public void m02() throws E0102 {
		throw new E0102();
	}
}
