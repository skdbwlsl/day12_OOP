package day12_OOP;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���⼭�� �׳� map���� Ű�� ������ �������
		HashMap map = new HashMap();
		map.put("�޸���", "notepad");
		map.put("����", "calc");
		map.put("�׸���", "mspaint");
		
		System.out.println(map);
		//���μ��������� ���� �Ú��ۿ����� ���డ���� ��ɾ���� ��������ִ°�
		System.out.println("���� ��ɾ� �Է� ");
		String key = sc.next();
		if(map.containsKey(key)) {
			ProcessBuilder pro = new ProcessBuilder((String)map.get(key));//string���� ����ȯ�� �ؾ� ������ �ȳ�
			try {
				pro.start(); //�� start�� ����� �����̵ȴ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("�ش� ��ɾ�� �������� �ʽ��ϴ�.");
		}
	}

}
