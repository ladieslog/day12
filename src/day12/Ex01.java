package day12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		long time =System.currentTimeMillis();
		System.out.println(time);
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		long time1= System.currentTimeMillis();
		System.out.println();
		
		SimpleDateFormat s= new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss");
		
		String str=s.format(time);
		System.out.println("sim : "+str);
		Date d= new Date();
		System.err.println("date : "+d);
		System.out.println("formate(date) : "+s.format(d));
		
		Calendar cal=Calendar.getInstance();
		
		//객체가 보여주기 
		System.out.println("cal : "+cal);
		
		System.out.print(cal.get(Calendar.YEAR)+" ");
		System.out.print(cal.get(Calendar.MONTH)+" ");
		System.out.print(cal.get(Calendar.DATE)+" ");
		System.out.println();
		
		
		//2
		int i;
		for(i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("다음 문장 실행!!!");
	}
}








