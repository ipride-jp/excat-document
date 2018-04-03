package test.bytecode;

public class ReturnMethodTest08 {
	
	//8_0 InvokeVirtual
	public Object ReturnInvokeVirtual_8_0(){
		return test01();
	}
	
	//8_1 InvokeSpecial
	public Object ReturnInvokeSpecial_8_1(){
		return test03();
	}
	
	//8_2 InvokeStatic
	public Object ReturnInvokeStatic_8_2(){
		return test02();
	}
	
	//8_3 InvokeInterface
	public Object ReturnInvokeInterface_8_3(){
		C c = new D();
		return c.Parent();
	}
	
	//Test—p
	private Object test03(){
		return "a";
	}
	public Object test01(){
		return "a";
	}
	public static Object test02(){
		return "b";
	}
}
//Test—p
interface C{
	public Object Parent();
}
class D implements C{

	public Object Parent() {
		return "a";
	}
	
}