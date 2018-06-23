package com.companyname.bank;

import java.net.Socket;
import java.util.Scanner;

public class Util {
	public static void main(String args[]){
		int x, y = 0;

		//抽取开始
		extract(y);

		//抽取结束
		}

	private static void extract(int y) {
		int ri;
		int repeat;
		int x;
		Scanner in=new Scanner(System.in);
		repeat=in.nextInt();
		for(ri=1; ri<=repeat; ri++){
		x=in.nextInt();
		/*------------------*/
		if (x>0)
		y=1;
		else if (x==0)
		y=0;
		else if (x<0)
		y=-1;
		System.out.println(y);
		}
	}

		//我把要抽取的部分选择 然后 ALT+SHIFT+M
		//命名后 就可以变为下面这样了

//		public static void main(String args[]){
//		int ri, repeat;
//		int x, y = 0;
//		chouqu(y);
//		}
//
//		private static void chouqu(int y) {
//		int ri;
//		int repeat;
//		int x;
//		Scanner in=new Scanner(System.in);
//		repeat=in.nextInt();
//		for(ri=1; ri<=repeat; ri++){
//		x=in.nextInt();
//		/*------------------*/
//		if (x>0)
//		y=1;
//		else if (x==0)
//		y=0;
//		else if (x<0)
//		y=-1;
//		System.out.println(y);
//		}
//		} 
	public static void printMessage(String message) {
		System.out.println(message);
	 
	}
}
