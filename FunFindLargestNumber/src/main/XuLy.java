package main;

import java.util.Scanner;

public class XuLy {

	public static int FindLargestNumber(int a, int b, int c) {
		int largestNumber = a; //biến tạm

		//kiểm tra lần lượt
		if (b > largestNumber) {
			largestNumber = b;
		}
		
		if (c > largestNumber) {
			largestNumber = c;
		}
		
		return largestNumber;

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

		int ketQua = FindLargestNumber(a, b, c);

		System.out.println("Số lớn nhất là bigger: " + ketQua);
	}

}
