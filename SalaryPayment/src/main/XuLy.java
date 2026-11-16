package main;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		final int STANDARD_HOUR = 40;
		final float RATE_OT = 1.5f;
		float hours, rate, salary;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số giờ: ");
		hours = Float.parseFloat(sc.nextLine());
		
		System.out.println("Nhập vào số tiền: ");
		 rate = Float.parseFloat(sc.nextLine());
		
		
		if(hours > STANDARD_HOUR) {
			salary = STANDARD_HOUR * rate + (hours - 40) * rate * RATE_OT;
		}else {
			salary = hours * rate;
		}
		System.out.println("Tiền phải trả: " + salary);

	}

}
