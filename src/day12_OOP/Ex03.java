package day12_OOP;

import java.io.IOException;
import java.util.Scanner;
//프로세스 빌더
public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("윈도우 실행 명령어 입력");
		String s = input.next();
		
		ProcessBuilder pro = new ProcessBuilder(s);
		
		try {
			pro.start(); //try입력전 오류가 뜨기 때문에 클릭해서 무조건 try/catch클릭
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
