package day12_OOP;

public class Ex02 {
	public static void main(String[] args) {
		for(int i =1; i<5;i++) {
			System.out.println(i);
			
			//������ �̷� �������� �����
			try {
				Thread.sleep(3000); //()�ȿ� ���� ��ŭ 3�� ����ض� 
			}catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("���� ����� ����!");
		}
	}


