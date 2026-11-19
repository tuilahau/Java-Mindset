package main;

import java.util.Scanner;

public class XuLy {

	public static boolean CheckEventOdd(int n) {
		boolean checkN;
		
		if(n % 2 == 0) {
			checkN = true;
		}else {
			checkN = false;
		}
		
		return checkN;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào n: ");
		int n = Integer.parseInt(sc.nextLine());
		
		boolean ketQua = CheckEventOdd(n);
		
		if (ketQua) {
			System.out.println(n + " là số chẵn");
		}else {
			System.out.println(n + " là số lẻ");
		}
		

	}

}
