package day12_OOP;

import java.io.IOException;
import java.util.Scanner;
//���μ��� ����
public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ ���� ��ɾ� �Է�");
		String s = input.next();
		
		ProcessBuilder pro = new ProcessBuilder(s);
		
		try {
			pro.start(); //try�Է��� ������ �߱� ������ Ŭ���ؼ� ������ try/catchŬ��
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
