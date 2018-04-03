package test;

import test.bytecode.*;

public class TestByteCodeMain {
	public static void main(String[] args) {
		
		//01
		ReturnArrayTest01 test01 = new ReturnArrayTest01();
		test01.ReturnArray_1_0_InstanceByte();
		test01.ReturnArray_1_0_LocalByte();
		test01.ReturnInt_1_1_FromArray();
		test01.ReturnLong_1_1_FromArray();
		test01.ReturnFloat_1_1_FromArray();
		test01.ReturnDouble_1_1_FromArray();
		test01.ReturnString_1_1_FromArray();
		test01.ReturnByte_1_1_FromArray();
		test01.ReturnBoolean_1_1_FromArray();
		test01.ReturnChar_1_1_FromArray();
		test01.ReturnShort_1_1_FromArray();
		test01.Return_1_2_NewArrayByte();
		test01.Return_1_3_ANewArray();
		test01.Return_1_3_ANewArray1();
		test01.Return_1_4_MultiaNewArray();
		test01.Return_1_4_MultiaNewArray1();
		test01.Return_1_5_ArrayLength();
		test01.Return_1_5_ArrayLength1();
		test01.Return_1_5_ArrayLengthWithCast();
		
		//02
		ReturnMathTest02 test02 = new ReturnMathTest02();
		test02.ReturnIPlusPlus_2_0();
		test02.ReturnLocalAddInt_2_1();
		test02.ReturnLocalAddLong_2_1();
		test02.ReturnLocalAddFloat_2_1();
		test02.ReturnLocalAddDouble_2_1();
		test02.ReturnLocalSubInt_2_2();
		test02.ReturnLocalSubLong_2_2();
		test02.ReturnLocalSubFloat_2_2();
		test02.ReturnLocalSubDouble_2_2();
		test02.ReturnLocalMulInt_2_3();
		test02.ReturnLocalMulLong_2_3();
		test02.ReturnLocalMulFloat_2_3();
		test02.ReturnLocalMulDouble_2_3();
		test02.ReturnLocalDivInt_2_4();
		test02.ReturnLocalDivLong_2_4();
		test02.ReturnLocalDivFloat_2_4();
		test02.ReturnLocalDivDouble_2_4();
		test02.ReturnLocalRemInt_2_5();
		test02.ReturnLocalRemLong_2_5();
		test02.ReturnLocalRemFloat_2_5();
		test02.ReturnLocalRemDouble_2_5();
		test02.ReturnLocalNegInt_2_6();
		test02.ReturnLocalNegLong_2_6();
		test02.ReturnLocalNegFloat_2_6();
		test02.ReturnLocalNegDouble_2_6();
		
		//03
		ReturnBitTest03 test03 = new ReturnBitTest03();
		test03.ReturnIntLeftShift_3_0();
		test03.ReturnLongLeftShift_3_0();
		test03.ReturnIntRightShift_3_1();
		test03.ReturnLongRightShift_3_1();
		test03.ReturnIntRightShift_3_2();
		test03.ReturnLongRightShift_3_2();
		test03.ReturnIntAND_3_3();
		test03.ReturnLongAND_3_3();
		test03.ReturnIntOR_3_4();
		test03.ReturnLongOR_3_4();
		test03.ReturnIntXOR_3_5();
		test03.ReturnLongXOR_3_5();
		
		//04
		ReturnObjectTest04 test04 = new ReturnObjectTest04();
		test04.ReturnNewObject_4_0();
		test04.ReturnNewObject_4_0_1();
		test04.ReturnField_4_1();
		test04.ReturnStatic_4_2();
		
		//05
		ReturnTypeCastTest05 test05 = new ReturnTypeCastTest05();
		test05.ReturnCheckCastOnObject_5_0();
		test05.ReturnCheckCastOnArray_5_0();
		test05.ReturnInstanceof_5_1();
		test05.ReturnInstanceof1_5_1();
		test05.ReturnIntToLong_5_2();
		test05.ReturnIntToFloat_5_2();
		test05.ReturnIntToDouble_5_2();
		test05.ReturnIntToByte_5_2();
		test05.ReturnIntToChar_5_2();
		test05.ReturnIntToShort_5_2();
		test05.ReturnLongToInt_5_3();
		test05.ReturnLongToFloat_5_3();
		test05.ReturnLongToDouble_5_3();
		test05.ReturnFloatToInt_5_4();
		test05.ReturnFloatToLong_5_4();
		test05.ReturnFloatToDouble_5_4();
		test05.ReturnDoubleToInt_5_5();
		test05.ReturnDoubleToLong_5_5();
		test05.ReturnDoubleToFloat_5_5();
		
		//06
		ReturnLocalVarTest06 test06 = new ReturnLocalVarTest06();
		test06.ReturnLocalInt_6_0();
		test06.ReturnLocalLong_6_0();
		test06.ReturnLocalFloat_6_0();
		test06.ReturnLocalDouble_6_0();
		test06.ReturnLocalString_6_0();
		test06.ReturnLocalListObject_6_0();
		test06.ReturnLocalListMap_6_0();
		test06.ReturnLocalMapObject_6_0();
		test06.ReturnLocalMapList_6_0();
		test06.ReturnLocalMapMap_6_0();
		test06.ReturnLocalInt1_6_1();
		test06.ReturnLocalInt2_6_1();
		test06.ReturnLocalInt3_6_1();
		test06.ReturnLocalLong1_6_2();
		test06.ReturnLocalLong2_6_2();
		test06.ReturnLocalLong3_6_2();
		test06.ReturnLocalFloat1_6_3();
		test06.ReturnLocalFloat2_6_3();
		test06.ReturnLocalFloat3_6_3();
		test06.ReturnLocalDouble1_6_4();
		test06.ReturnLocalDouble2_6_4();
		test06.ReturnLocalDouble3_6_4();
		test06.ReturnLocalString1_6_5();
		test06.ReturnLocalString2_6_5();
		test06.ReturnLocalString3_6_5();
		
		//07
		ReturnStackTest07 test07 = new ReturnStackTest07();
		test07.ReturnByte_7_0();
		test07.ReturnShort_7_0();
		test07.ReturnString_7_1();
		test07.ReturnFloat_7_2();
		test07.ReturnFloat_7_2_aloadw();
		test07.ReturnDouble_7_3();
		test07.ReturnInt_m01_7_4();
		test07.ReturnInt_00_7_4();
		test07.ReturnInt_01_7_4();
		test07.ReturnInt_02_7_4();
		test07.ReturnInt_03_7_4();
		test07.ReturnInt_04_7_4();
		test07.ReturnInt_05_7_4();
		test07.ReturnLong_00_7_5();
		test07.ReturnLong_01_7_5();
		test07.ReturnFloat_00_7_6();
		test07.ReturnFloat_01_7_6();
		test07.ReturnFloat_02_7_6();
		test07.ReturnDouble_00_7_7();
		test07.ReturnDouble_01_7_7();
		test07.ReturnNull_7_8();
		test07.ReturnGenInt_7_99();
		
		//08
		ReturnMethodTest08 test08 = new ReturnMethodTest08();
		test08.ReturnInvokeVirtual_8_0();
		test08.ReturnInvokeSpecial_8_1();
		test08.ReturnInvokeStatic_8_2();
		test08.ReturnInvokeInterface_8_3();
	}
}
