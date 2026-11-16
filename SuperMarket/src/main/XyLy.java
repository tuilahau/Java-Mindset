package main;

import java.util.Scanner;

public class XyLy {

	public static void main(String[] args) {
		final int QUOTE1 = 100;
		final int QUOTE2 = 50;
		final float GIFT_QUOTE1 = 0.88f;
		final float GIFT_QUOTE2 = 0.92f;
		String tenHang;
		int soLuong;
		float donGia, thanhTien;
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập tên sản phẩm: ");
		tenHang = sc.nextLine();
		System.out.print("Nhập số lượng: ");
		soLuong = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập số đơn giá: ");
		donGia = Float.parseFloat(sc.nextLine());

		if (soLuong >= 	QUOTE1) {
			thanhTien = QUOTE1 * donGia + (soLuong - QUOTE1) * donGia * GIFT_QUOTE1;
		} else if (soLuong > QUOTE2 && soLuong < QUOTE1) {
			thanhTien = QUOTE2 * donGia + (soLuong - QUOTE2) * donGia * GIFT_QUOTE2;
		} else {
			thanhTien = soLuong * donGia;
		}

		System.out.println("Tên : " + tenHang + "\t Số lượng: " + soLuong + "\t Đơn giá: " + donGia + "\t Thành tiền: "
				+ thanhTien);

	}

}
