package cn.edu360.javase24.day01;

import java.util.Scanner;

public class CommunicationN01{
	//main������������ִ�����
	public static void main(String[] args) {
		//����һ��jdk�����ڻ�ȡ������Ϣ�Ĺ��ߣ���������һ������
		Scanner sc = new Scanner(System.in);
		
		//�ù��ߴ��ն��ϻ�ȡ�û������һ������
		String name = sc.nextLine();
		
		//ƴ���ַ���
		String res = name + "������" + name +"�û���" + name +"�����˼��˰���";
		
		//��ƴ�ӺõĽ����ӡ���ն�
		System.out.println(res);
		
	}
	
	
}
