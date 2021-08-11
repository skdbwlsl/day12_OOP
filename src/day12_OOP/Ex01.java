package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		//�ð����ñ��
		
		//����ð����
		long time = System.currentTimeMillis();
		//          1/1000 �� ������ �����´�
		System.out.println(time);
		
		//���Ĺٲٱ�
		//���� �ð��� �� ����(���� ������ ����)���� �ٲٰڴ�
		SimpleDateFormat s= new SimpleDateFormat("yyyy-MM-dd  aa  hh:mm:ss");
							//new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��")
		String str = s.format(time);
		System.out.println(str);
		
		//util�� �ִ� date����ߴ�
		Date d = new Date();
		System.out.println("date : " +d);
		//���ǽ��� �̱����̶� �츮������ �������ϱ�
		System.out.println("format(d) : " +s.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " +cal);
		System.out.println(cal.get(Calendar.YEAR));
		//month�� 0�� ���� ������ ������ +1�������
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
	}

}
