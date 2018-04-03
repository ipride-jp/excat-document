package test;

import test.returnvalue.*;
import test.customobj.*;

public class Test_main {
	public static void main(String[] args){
		MethodReturnValueBase returnBase = new MethodReturnValueBase();
		returnBase.testReturn001();
		returnBase.testReturn002();
		
		returnBase.returnLoopN(3);
		returnBase.returnLoop100();
		returnBase.doOverLoading(5);
		
		returnBase.returnThis();
		
		returnBase.returnNull();
		
		MethodReturnValueBase.returnStaticMethod();
		
		//boolean
		MethodReturnBoolValue returnBoolValue = new MethodReturnBoolValue(true);
		returnBoolValue.getBoolReturnValue();
		returnBoolValue.setBoolReturnValue(false);
		returnBoolValue.getBoolReturnValue();
		
		//char
		MethodReturnCharValue returnCharValue = new MethodReturnCharValue('a');
		returnCharValue.getCharReturnValue();
		
		//byte
		byte byteTemp = 1;
		MethodReturnByteValue returnByteValue = new MethodReturnByteValue(byteTemp);
		returnByteValue.getByteReturnValue();
		
		//short
		short shortTemp = 31;
		MethodReturnShortValue returnShortValue = new MethodReturnShortValue(shortTemp);
		returnShortValue.getShortReturnValue();
		shortTemp = -31;
		returnShortValue.setShortReturnValue(shortTemp);
		returnShortValue.getShortReturnValue();
		
		//int
		MethodReturnIntValue returnIntValue = new MethodReturnIntValue(255);
		returnIntValue.getIntReturnValue();
		returnIntValue.setIntReturnValue(-255);
		returnIntValue.getIntReturnValue();
		
		//long
		long longTemp = 65535;
		MethodReturnLongValue returnLongValue = new MethodReturnLongValue(longTemp);
		returnLongValue.getLongReturnValue();
		longTemp = -65535;
		returnLongValue.setLongReturnValue(longTemp);
		returnLongValue.getLongReturnValue();
		
		//float
		float floatTemp = 123456;
		MethodReturnFloatValue returnFloatValue = new MethodReturnFloatValue(floatTemp);
		returnFloatValue.getFloatReturnValue();
		floatTemp = -123456;
		returnFloatValue.setFloatReturnValue(floatTemp);
		returnFloatValue.getFloatReturnValue();
		
		//double
		double doubleTemp = 123.456;
		MethodReturnDoubleValue returnDoubleValue = new MethodReturnDoubleValue(doubleTemp);
		returnDoubleValue.getDoubleReturnValue();
		doubleTemp = -123.456;
		returnDoubleValue.setDoubleReturnValue(doubleTemp);
		returnDoubleValue.getDoubleReturnValue();
		
		//String
		MethodReturnStringValue returnStringValue = new MethodReturnStringValue("return string value");
		returnStringValue.getStringReturnValue();
		
		//custom object
		TestObj001 objTemp = new TestObj001("this is custom object");
		MethodReturnObjValue returnObjValue = new MethodReturnObjValue(objTemp);
		returnObjValue.getCustomObjReturnValue();
		
		//static
		MethodReturnStaticValue returnStaticValue= new MethodReturnStaticValue(true);
		returnStaticValue.getStaticBoolReturnValue();
		returnStaticValue.setStaticBoolReturnValue(false);
		returnStaticValue.getStaticBoolReturnValue();
		
		returnStaticValue.setStaticCharReturnValue('b');
		returnStaticValue.getStaticCharReturnValue();
		
		byteTemp = 1; 
		returnStaticValue.setStaticByteReturnValue(byteTemp);
		returnStaticValue.getStaticByteReturnValue();
		
		shortTemp = 31;
		returnStaticValue.setStaticShortReturnValue(shortTemp);
		returnStaticValue.getStaticShortReturnValue();
		shortTemp = -31;
		returnStaticValue.setStaticShortReturnValue(shortTemp);
		returnStaticValue.getStaticShortReturnValue();
		
		returnStaticValue.setStaticIntReturnValue(255);
		returnStaticValue.getStaticIntReturnValue();
		returnStaticValue.setStaticIntReturnValue(-255);
		returnStaticValue.getStaticIntReturnValue();
		
		longTemp = 65535;
		returnStaticValue.setStaticLongReturnValue(longTemp);
		returnStaticValue.getStaticLongReturnValue();
		longTemp = -65535;
		returnStaticValue.setStaticLongReturnValue(longTemp);
		returnStaticValue.getStaticLongReturnValue();
		
		floatTemp = 123456;
		returnStaticValue.setStaticFloatReturnValue(floatTemp);
		returnStaticValue.getStaticFloatReturnValue();
		floatTemp = -123456;
		returnStaticValue.setStaticFloatReturnValue(floatTemp);
		returnStaticValue.getStaticFloatReturnValue();
		
		doubleTemp = 123.456;
		returnStaticValue.setStaticDoubleReturnValue(doubleTemp);
		returnStaticValue.getStaticDoubleReturnValue();
		doubleTemp = -123.456;
		returnStaticValue.setStaticDoubleReturnValue(doubleTemp);
		returnStaticValue.getStaticDoubleReturnValue();
		
		returnStaticValue.setStaticStringReturnValue("this is a static String");
		returnStaticValue.getStaticStringReturnValue();
		
		returnStaticValue.setStaticCustomObjReturnValue(objTemp);
		returnStaticValue.getStaticCustomObjReturnValue();
		
		//localïœêî
		MethodReturnLocalValue returnLocalValue = new MethodReturnLocalValue();
		
		returnLocalValue.getLocalBoolValue(true);
		returnLocalValue.getLocalBoolValue(false);
		
		returnLocalValue.getLocalCharValue('c');
		
		byteTemp = 1; 
		returnLocalValue.getLocalByteValue(byteTemp);
		
		shortTemp = 31;
		returnLocalValue.getLocalShortValue(shortTemp);
		shortTemp = -31;
		returnLocalValue.getLocalShortValue(shortTemp);
		
		returnLocalValue.getLocalIntValue(255);
		returnLocalValue.getLocalIntValue(-255);
		
		longTemp = 65535;
		returnLocalValue.getLocalLongValue(longTemp);
		longTemp = -65535;
		returnLocalValue.getLocalLongValue(longTemp);
		
		floatTemp = 123456;
		returnLocalValue.getLocalFloatValue(floatTemp);
		floatTemp = -123456;
		returnLocalValue.getLocalFloatValue(floatTemp);
		
		doubleTemp = 123.456;
		returnLocalValue.getLocalDoubleValue(doubleTemp);
		doubleTemp = -123.456;
		returnLocalValue.getLocalDoubleValue(doubleTemp);
		
		returnLocalValue.getLocalStringValue("this is a local string");
		
		returnLocalValue.getLocalCustomObjValue(objTemp);
		
		//constant value
		MethodReturnConstantValue returnConstantValue = new MethodReturnConstantValue();
		
		returnConstantValue.returnConstantBoolValue(true);
		returnConstantValue.returnConstantBoolValue(false);
		
		returnConstantValue.returnConstantCharValue();
		
		returnConstantValue.returnConstantByteValue();
		
		shortTemp = 31;
		returnConstantValue.returnConstantShortValue(shortTemp);
		shortTemp = -31;
		returnConstantValue.returnConstantShortValue(shortTemp);
		
		returnConstantValue.returnConstantIntValue(255);
		returnConstantValue.returnConstantIntValue(-255);
		
		longTemp = 65535;
		returnConstantValue.returnConstantLongValue(longTemp);
		longTemp = -65535;
		returnConstantValue.returnConstantLongValue(longTemp);
		
		floatTemp = 123456;
		returnConstantValue.returnConstantFloatValue(floatTemp);
		floatTemp = -123456;
		returnConstantValue.returnConstantFloatValue(floatTemp);
		
		doubleTemp = 123.456;
		returnConstantValue.returnConstantDoubleValue(doubleTemp);
		doubleTemp = -123.456;
		returnConstantValue.returnConstantDoubleValue(doubleTemp);

		returnConstantValue.returnConstantStringValue();
		
		//the return value of another method
		MethodReturnMethodValue returnMethodValue = new MethodReturnMethodValue();
		
		returnMethodValue.returnBoolMethodValue(true);
		returnMethodValue.returnBoolMethodValue(false);
		
		returnMethodValue.returnCharMethodValue('e');
		
		byteTemp = 1;
		returnMethodValue.returnByteMethodValue(byteTemp);
		
		shortTemp = 31;
		returnMethodValue.returnShortMethodValue(shortTemp);
		shortTemp = -31;
		returnMethodValue.returnShortMethodValue(shortTemp);
		
		returnMethodValue.returnIntMethodValue(255);
		returnMethodValue.returnIntMethodValue(-255);
		
		longTemp = 65535;
		returnMethodValue.returnLongMethodValue(longTemp);
		longTemp = -65535;
		returnMethodValue.returnLongMethodValue(longTemp);
		
		floatTemp = 123456;
		returnMethodValue.returnFloatMethodValue(floatTemp);
		floatTemp = -123456;
		returnMethodValue.returnFloatMethodValue(floatTemp);
		
		doubleTemp = 123.456;
		returnMethodValue.returnDoubleMethodValue(doubleTemp);
		doubleTemp = -123.456;
		returnMethodValue.returnDoubleMethodValue(doubleTemp);
		
		returnMethodValue.returnStringMethodValue("this is another method's return value");
		
		returnMethodValue.returnCustomObjMethodValue(objTemp);
		
		
		//the type change
		MethodReturnConverTypeValue returnConvertTypeValue = new MethodReturnConverTypeValue();
		
		//xÅÀbyte
		returnConvertTypeValue.returnCharToByte();
		
		returnConvertTypeValue.returnShortToByte();
		
		returnConvertTypeValue.returnIntToByte();

		returnConvertTypeValue.returnLongToByte();

		returnConvertTypeValue.returnFloatToByte();

		returnConvertTypeValue.returnDoubleToByte();
		
		//XÅÀchar
		returnConvertTypeValue.returnByteToChar();
		
		returnConvertTypeValue.returnShortToChar();
		
		returnConvertTypeValue.returnIntToChar();
		
		returnConvertTypeValue.returnLongToChar();
		
		returnConvertTypeValue.returnFloatToChar();

		returnConvertTypeValue.returnDoubleToChar();

		//XÅÀshort
		returnConvertTypeValue.returnCharToShort();
		
		returnConvertTypeValue.returnIntToShort();
		
		returnConvertTypeValue.returnLongToShort();

		returnConvertTypeValue.returnFloatToShort();

		returnConvertTypeValue.returnDoubleToShort();
		
		//XÅÀint
		returnConvertTypeValue.returnCharToInt();
		
		returnConvertTypeValue.returnShortToInt();
		
		returnConvertTypeValue.returnLongToInt();

		returnConvertTypeValue.returnFloatToInt();

		returnConvertTypeValue.returnDoubleToInt();
		
		//XÅÀlong
		returnConvertTypeValue.returnCharToLong();
		
		returnConvertTypeValue.returnShortToLong();
		
		returnConvertTypeValue.returnIntToLong();
		
		returnConvertTypeValue.returnFloatToLong();
		
		returnConvertTypeValue.returnDoubleToLong();
		
		//XÅÀdouble
		returnConvertTypeValue.returnCharToDouble();

		returnConvertTypeValue.returnShortToDouble();
		
		returnConvertTypeValue.returnIntToDouble();

		returnConvertTypeValue.returnLongToDouble();
		
		returnConvertTypeValue.returnFloatToDouble();
		
		//XÅÀfloat
		returnConvertTypeValue.returnCharToFloat();
		
		returnConvertTypeValue.returnShortToFloat();
		
		returnConvertTypeValue.returnIntToFloat();
		
		returnConvertTypeValue.returnLongToFloat();
		
		returnConvertTypeValue.returnDoubleToFloat();
		
		System.out.println("Hello World!");
	}
}
