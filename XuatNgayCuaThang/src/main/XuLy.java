package main;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		int month;
		int day = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập vào tháng: ");
		month = Integer.parseInt(sc.nextLine());

		//sử dụng cờ hiệu
		boolean flag = true; // giả sử tháng hợp lệ

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;

		default:
			flag = false; //tháng sai bật cờ lên
		}
		
		if (flag) {
			System.out.println("Tháng " + month + " hợp lệ.");
			System.out.println("Số ngày trong tháng: " + day);
		}else {
			System.out.println("Nhập tháng không hợp lệ.");
		}

	}

}
