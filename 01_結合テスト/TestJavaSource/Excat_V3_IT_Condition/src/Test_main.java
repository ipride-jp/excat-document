
public class Test_main {
	public static void main(String[] args){
		System.out.println("Enter the test_main of Excat_V3_IT_Condition!");
		
		Test_main testMain = new Test_main();
		
		testMain.testCondition("a");
		testMain.testCondition("b");
		testMain.testCondition("c");
		testMain.testCondition("?");
		testMain.testCondition("*");
		
		testMain.testCondition("ab");
		testMain.testCondition("ac");
		testMain.testCondition("cb");
		testMain.testCondition("*a");
		testMain.testCondition("*?");
		testMain.testCondition("**");
		testMain.testCondition("?a");
		testMain.testCondition("?*");
		testMain.testCondition("??");
		
		testMain.testCondition("aba");
		testMain.testCondition("acb");
		testMain.testCondition("abc");
		testMain.testCondition("cba");
		testMain.testCondition("cab");
		testMain.testCondition("?cab");
		testMain.testCondition("*cab");
		
		testMain.testCondition("abab");
		testMain.testCondition("abac");
		testMain.testCondition("acab");
		testMain.testCondition("acbc");
		testMain.testCondition("baba");
		testMain.testCondition("baca");
		testMain.testCondition("caba");
		testMain.testCondition("cacb");
		testMain.testCondition("?cacb");
		testMain.testCondition("*cacb");
		
		testMain.testCondition("abcba");
		testMain.testCondition("bacba");
		testMain.testCondition("cacbc");
		testMain.testCondition("cacac");
		testMain.testCondition("?cacac");
		testMain.testCondition("*cacac");


	}
	
	public Test_main(){
		;
	}
	public int testCondition(String str1){
		int nLength = str1.length();
		return nLength;
	}
}
