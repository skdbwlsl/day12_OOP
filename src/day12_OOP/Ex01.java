package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		//시간관련기능
		
		//현재시간출력
		long time = System.currentTimeMillis();
		//          1/1000 초 단위로 가져온다
		System.out.println(time);
		
		//형식바꾸기
		//얻어온 시간을 이 형식(내가 지정한 형식)으로 바꾸겠다
		SimpleDateFormat s= new SimpleDateFormat("yyyy-MM-dd  aa  hh:mm:ss");
							//new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초")
		String str = s.format(time);
		System.out.println(str);
		
		//util에 있는 date사용했다
		Date d = new Date();
		System.out.println("date : " +d);
		//위의식은 미국식이라 우리식으로 포맷팅하기
		System.out.println("format(d) : " +s.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " +cal);
		System.out.println(cal.get(Calendar.YEAR));
		//month는 0월 부터 나오기 때문에 +1해줘야함
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
	}

}
