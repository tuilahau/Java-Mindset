package main;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		int d1, d2, bigger;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Nhập giá trị d1: ");
		d1 = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập giá trị d2: ");
		d2 = Integer.parseInt(sc.nextLine());
		
		if(d1 > d2) {
			bigger = d1;
		}else {
			bigger = d2;
		}
		System.out.println("Số lớn nhất là: " + bigger);

	}

}
