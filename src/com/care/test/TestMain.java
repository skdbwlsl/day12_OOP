package com.care.test;



import java.util.Date;

import com.care.zzz.*; //한번에 가져다 쓰겠다, 모든값

public class TestMain {

	public static void main(String[] args) {
		Test t= new Test();
		t.test();
		TestClass tc = new TestClass();
		tc.testClass();
		TestClass02 tc02 = new TestClass02();
		tc02.testClass02();
		
		//이게 위치가 다르다 그럼 다른 기능이라 쓸때 원하는걸 가져다쓴다(aaa가 있고 zzz가 있어서)
		a.a.a.TestClass tt = new a.a.a.TestClass();
		
		//이르밍 같은순 있지만 다른 기능이다 들엉있는 위치가 다르기에
		Date dd = new Date();
		java.sql.Date ddd = new java.sql.Date(0);
	}

}
