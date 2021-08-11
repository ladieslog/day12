package day12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz01_t2 {
	private Date date;
	private SimpleDateFormat simpl;
	public void timePrint() {
		int i;
		
		for(i=0;i<11;i++) {
			long time =System.currentTimeMillis();
			SimpleDateFormat sim =new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss");
			System.out.println("현재 시각 : "+sim.format(time));
			try {
				Thread.sleep(100);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
