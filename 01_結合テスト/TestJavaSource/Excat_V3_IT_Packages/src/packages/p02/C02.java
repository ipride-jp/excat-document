package packages.p02;

import packages.p03.p0301.p030101.C030101;

public class C02 {
	public void catchException() {
		C030101 c030101 = new C030101();
		try {
			c030101.throwException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
