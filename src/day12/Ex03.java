package day12;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap map=new HashMap();
		map.put("메모장", "notepad");
		map.put("계산기", "calc");
		map.put("그림판", "mspaint");
		System.out.println(map);
		
		System.out.println("실행 명령어 입력");
		String key =sc.next();
		if(map.containsKey(key)) {
			ProcessBuilder pro= new ProcessBuilder((String)map.get(key));
			try {
				pro.start();
				System.out.println("명령어가 실행 되었습니다.");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("해당 명령어는 존재하지 않습니다. ");
		}
	}
}
