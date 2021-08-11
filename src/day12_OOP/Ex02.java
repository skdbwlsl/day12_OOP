package day12_OOP;

public class Ex02 {
	public static void main(String[] args) {
		for(int i =1; i<5;i++) {
			System.out.println(i);
			
			//무조건 이런 형식으로 써야함
			try {
				Thread.sleep(3000); //()안에 들어가는 만큼 3초 대기해라 
			}catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("다음 문장들 실행!");
		}
	}


