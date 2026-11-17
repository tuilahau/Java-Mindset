package main;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		int d, m, y, dayOfWeek;
		int top; // số ngày tối đa trong tháng
		boolean flag = true; // bật hợp lệ
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập ngày: ");
		d = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập tháng: ");
		m = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập năm: ");
		y = Integer.parseInt(sc.nextLine());

		// Xét năm
		if (y < 1582) {
			flag = false;
		}

		// Xét tháng
		if (m < 1 || m > 12) {
			flag = false;
		}

		switch (m) {
		case 4:
		case 6:
		case 9:
		case 11:
			top = 30;
			break;
		case 2:
			if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
				top = 29;
			} else {
				top = 28;
			}
			break;
		default: // Lợi dụng tháng đã hợp lệ
			top = 13;
		}

		// Kiểm tra ngày nhập vào có hợp lệ hay không
		if (d < 1 || d > top) {
			flag = false;
		}

		if (!flag) {
			System.out.println("Không hợp lệ");
		} else {
			int a = (14 - m) / 12;
			y -= a;
			m += 12 * a - 2;

			dayOfWeek = (d + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
			
			if(dayOfWeek == 0) {
				System.out.println("Chủ nhật");
			}else {
				int thu = dayOfWeek + 1;
				System.out.println("Thứ " + thu);
			}
		}
	}

}
