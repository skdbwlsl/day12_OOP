package com.care.test;



import java.util.Date;

import com.care.zzz.*; //�ѹ��� ������ ���ڴ�, ��簪

public class TestMain {

	public static void main(String[] args) {
		Test t= new Test();
		t.test();
		TestClass tc = new TestClass();
		tc.testClass();
		TestClass02 tc02 = new TestClass02();
		tc02.testClass02();
		
		//�̰� ��ġ�� �ٸ��� �׷� �ٸ� ����̶� ���� ���ϴ°� �����پ���(aaa�� �ְ� zzz�� �־)
		a.a.a.TestClass tt = new a.a.a.TestClass();
		
		//�̸��� ������ ������ �ٸ� ����̴� ����ִ� ��ġ�� �ٸ��⿡
		Date dd = new Date();
		java.sql.Date ddd = new java.sql.Date(0);
	}

}
