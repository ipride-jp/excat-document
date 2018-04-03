package test.bytecode;

public class ReturnMathTest02 {
	
	byte bInstance = 1;
	
	/**
	 * éZèpââéZ2 start: bytecode is 
	 * [2_0 iinc íºê⁄ãLèqÇµÇΩíËêîï™ÅAëùå∏Ç∑ÇÈ]
	 * [2_1 iaload, laload, faload, daload, aaload, baload, caload, saload]
	 * [2_2 newarray, 1_3 anewarray,1_4 multianewarray,1_5 arraylength]
	 */
	
	//2_0 return add byte (i++)
	public int ReturnIPlusPlus_2_0(){
		int bLocal = 2;
		return  bLocal++; 
	}
	
	//2_1 return add int(1+2=3)
	public int ReturnLocalAddInt_2_1(){
		int a = 1;
		int b = 2;
		return a + b ; 
	}
	
	//2_1 return add long(1+2=3)
	public long ReturnLocalAddLong_2_1(){
		long a = 1;
		long b = 2;
		return a + b ; 
	}
	//2_1 return add float(1+2=3)
	public float ReturnLocalAddFloat_2_1(){
		float a = 1;
		float b = 2;
		return a + b ; 
	}
	//2_1 return add double(1+2=3)
	public double ReturnLocalAddDouble_2_1(){
		double a = 1;
		double b = 2;
		return a + b ; 
	}
	//2_2 return sub int(2-1=-1)
	public int ReturnLocalSubInt_2_2(){
		int a = 2;
		int b = 1;
		return a - b ; 
	}
	//2_2 return sub long(2-1=-1)
	public long ReturnLocalSubLong_2_2(){
		long a = 2;
		long b = 1;
		return a - b ;
	}
	//2_2 return sub float(2-1=-1)
	public float ReturnLocalSubFloat_2_2(){
		float a = 2;
		float b = 1;
		return a - b ; 
	}
	
	//2_2 return sub double(2-1=-1)
	public double ReturnLocalSubDouble_2_2(){
		double a = 2;
		double b = 1;
		return a - b ; 
	}
	
	//2_3 return mul int(2*1=-1)
	public int ReturnLocalMulInt_2_3(){
		int a = 2;
		int b = 1;
		return a * b ; 
	}
	//2_3 return Mul long(2-1=-1)
	public long ReturnLocalMulLong_2_3(){
		long a = 2;
		long b = 1;
		return a * b ; 
	}
	//2_3 return Mul float(2-1=-1)
	public float ReturnLocalMulFloat_2_3(){
		float a = 2;
		float b = 1;
		return a * b ; 
	}
	
	//2_3 return Mul double(2-1=-1)
	public double ReturnLocalMulDouble_2_3(){
		double a = 2;
		double b = 1;
		return a * b ; 
	}
	
	//2_4 return Div int(2*1=-1)
	public int ReturnLocalDivInt_2_4(){
		int a = 2;
		int b = 1;
		return a / b ; 
	}
	//2_4 return Div long(2-1=-1)
	public long ReturnLocalDivLong_2_4(){
		long a = 2;
		long b = 1;
		return a / b ; 
	}
	//2_4 return Div float(2-1=-1)
	public float ReturnLocalDivFloat_2_4(){
		float a = 2;
		float b = 1;
		return a / b ; 
	}
	
	//2_4 return div double(2-1=-1)
	public double ReturnLocalDivDouble_2_4(){
		double a = 2;
		double b = 1;
		return a / b ; 
	}
	
	//2_5 return Rem int(2*1=-1)
	public int ReturnLocalRemInt_2_5(){
		int a = 2;
		int b = 1;
		return a % b ; 
	}
	//2_5 return Rem long(2-1=-1)
	public long ReturnLocalRemLong_2_5(){
		long a = 2;
		long b = 1;
		return a % b ; 
	}
	//2_5 return Rem float(2-1=-1)
	public float ReturnLocalRemFloat_2_5(){
		float a = 2;
		float b = 1;
		return a % b ; 
	}
	
	//2_5 return rem double(2-1=-1)
	public double ReturnLocalRemDouble_2_5(){
		double a = 2;
		double b = 1;
		return a % b ; 
	}
	
	//2_6 return Neg int(2*1=-1)
	public int ReturnLocalNegInt_2_6(){
		int a = 2;
		return - a; 
	}
	//2_6 return Neg long(2-1=-1)
	public long ReturnLocalNegLong_2_6(){
		long a = 2;
		return - a;  
	}
	//2_6 return Neg float(2-1=-1)
	public float ReturnLocalNegFloat_2_6(){
		float a = 2;
		return - a; 
	}
	
	//2_6 return Neg double(2-1=-1)
	public double ReturnLocalNegDouble_2_6(){
		double a = 2;
		return - a; 
	}
	
}
