package day12;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap map=new HashMap();
		map.put("�޸���", "notepad");
		map.put("����", "calc");
		map.put("�׸���", "mspaint");
		System.out.println(map);
		
		System.out.println("���� ��ɾ� �Է�");
		String key =sc.next();
		if(map.containsKey(key)) {
			ProcessBuilder pro= new ProcessBuilder((String)map.get(key));
			try {
				pro.start();
				System.out.println("��ɾ ���� �Ǿ����ϴ�.");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("�ش� ��ɾ�� �������� �ʽ��ϴ�. ");
		}
	}
}
