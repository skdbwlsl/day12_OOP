package day12_OOP;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//여기서는 그냥 map으로 키와 값으로 만들어줌
		HashMap map = new HashMap();
		map.put("메모장", "notepad");
		map.put("계산기", "calc");
		map.put("그림판", "mspaint");
		
		System.out.println(map);
		//프로세스빌더는 현재 시슽템에대해 실행가능한 명령어들을 실행시켜주는것
		System.out.println("실행 명령어 입력 ");
		String key = sc.next();
		if(map.containsKey(key)) {
			ProcessBuilder pro = new ProcessBuilder((String)map.get(key));//string으로 형변환을 해야 오류가 안남
			try {
				pro.start(); //꼭 start를 써줘야 실행이된다
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("해당 명령어는 존재하지 않습니다.");
		}
	}

}
