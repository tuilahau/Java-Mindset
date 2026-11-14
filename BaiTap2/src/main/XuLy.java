package main;

import java.util.Scanner;

public class XuLy {
	public static void main(String[] args) {
		final int VND_PER_USD = 23500;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số USD muốn đổi sang VND: ");
		float amoutUSD  = Float.parseFloat(sc.nextLine());
		  
		float  amoutVND = VND_PER_USD * amoutUSD;
		
		System.out.println(amoutVND);
	}

}
