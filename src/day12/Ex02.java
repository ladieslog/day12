package day12;

import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("������ ���� ��ɾ� �Է�");
		String s =input.next();
		
		//������ ��ɾ� �޾ƿ��� �Լ� 
		ProcessBuilder pro =new ProcessBuilder(s);
		try {
			pro.start();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

