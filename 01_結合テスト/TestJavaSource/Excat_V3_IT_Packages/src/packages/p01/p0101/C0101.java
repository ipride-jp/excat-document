package packages.p01.p0101;

public class C0101 {
	public void selfException() {
		try {
			throw new Exception("C0101");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
