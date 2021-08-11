package day12;

import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("윈도우 실행 명령어 입력");
		String s =input.next();
		
		//윈도우 명령어 받아오기 함수 
		ProcessBuilder pro =new ProcessBuilder(s);
		try {
			pro.start();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

