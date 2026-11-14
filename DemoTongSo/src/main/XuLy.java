package main;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		int n, unit, ten, hundred, sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		n = Integer.parseInt(sc.nextLine());
		
		hundred = n / 100;
		ten = (n % 100) / 10;
		unit = n % 10;
		
		sum = hundred + ten + unit;
		System.out.println("Kết quả cộng 3 số n :" + sum);

	}

}
