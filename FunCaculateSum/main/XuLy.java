package main;

import java.util.Scanner;

public class XuLy {

	public static int CaculateSum(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số a: ");
		a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập số b: ");
		b = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập số c: ");
		c = Integer.parseInt(sc.nextLine());
		
		int ketQua =  CaculateSum(a, b, c);
		
		System.out.println("Kết quả là: " + ketQua);
		

	}

}
