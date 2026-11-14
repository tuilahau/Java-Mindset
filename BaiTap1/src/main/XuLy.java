package main;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào num 5 số: ");
		int num = sc.nextInt();
		final int NUMBER_COUNT = 5 ;
		
		
		int tenMilion = num / 10000;
		
		int milion = (num % 10000) / 1000;
		
		int hundred = (num % 1000) / 100;
		
		int ten = (num % 100) / 10;
		
		int unit = (num % 10);
		
		int total = tenMilion + milion + hundred + ten + unit;
		
		double totalAVG = (double) total / NUMBER_COUNT;
		
		System.out.println(total);
		System.out.println("Kết tính trung bình cộng 5 số: " + totalAVG);
		
		
		System.out.println(tenMilion);
		System.out.println(milion);
		System.out.println(hundred);
		System.out.println(ten);
		System.out.println(unit);
		

	}

}
