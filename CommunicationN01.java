package cn.edu360.javase24.day01;

import java.util.Scanner;

public class CommunicationN01{
	//main方法是这个类的执行入口
	public static void main(String[] args) {
		//创建一个jdk中用于获取输入信息的工具，并定义了一个变量
		Scanner sc = new Scanner(System.in);
		
		//用工具从终端上获取用户输入的一行文字
		String name = sc.nextLine();
		
		//拼接字符串
		String res = name + "好美，" + name +"好坏，" + name +"真是人见人爱。";
		
		//将拼接好的结果打印到终端
		System.out.println(res);
		
	}
	
	
}
