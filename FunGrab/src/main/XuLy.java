package main;

import java.util.Scanner;

public class XuLy {

	public static float GrabCar(float soKm, float soPhut) {
		final float PRICE_FIRST_KM = 8000f;
		final float PRICE_PRE_KM_2_TO_19 = 7500f;
		final float PRICE_PRE_KN_OVER_19 = 7000f;
		final float WAITING_INTERVAL_MINUTES = 2000f;
		float tongTien = 0;
		float tongTienCho = 0;
		if (soKm <= 1) {
			tongTien = PRICE_FIRST_KM;
		} else if (soKm > 1 && soKm <= 19) {
			tongTien = PRICE_FIRST_KM + (soKm - 1) * PRICE_PRE_KM_2_TO_19;
		} else {
			tongTien = PRICE_FIRST_KM + (18 * PRICE_PRE_KM_2_TO_19) + (soKm - 19) * PRICE_PRE_KN_OVER_19;
		}

		if (soPhut >= 3) {
			tongTienCho =(soPhut * 1.0f / 3) * WAITING_INTERVAL_MINUTES;
		}

		return tongTien + tongTienCho;
	}

	public static float GrabSuv(float soKm, float soPhut) {
		final float PRICE_FIRST_KM = 9000f;
		final float PRICE_PRE_KM_2_TO_19 = 8500f;
		final float PRICE_PRE_KN_OVER_19 = 8000f;
		final float WAITING_INTERVAL_MINUTES = 3000f;
		float tongTien = 0;
		float tongTienCho = 0;
		if (soKm <= 1) {
			tongTien = PRICE_FIRST_KM;
		} else if (soKm > 1 && soKm <= 19) {
			tongTien = PRICE_FIRST_KM + (soKm - 1) * PRICE_PRE_KM_2_TO_19;
		} else {
			tongTien = PRICE_FIRST_KM + (18 * PRICE_PRE_KM_2_TO_19) + (soKm - 19) * PRICE_PRE_KN_OVER_19;
		}

		if (soPhut >= 3) {
			tongTienCho = (soPhut * 1.0f / 3) * WAITING_INTERVAL_MINUTES;
		}

		return tongTien + tongTienCho;
	}

	public static float GrabBlack(float soKm, float soPhut) {
		final float PRICE_FIRST_KM = 10000f;
		final float PRICE_PRE_KM_2_TO_19 = 9500f;
		final float PRICE_PRE_KN_OVER_19 = 9000f;
		final float WAITING_INTERVAL_MINUTES = 3000f;
		float tongTien = 0;
		float tongTienCho = 0;
		if (soKm <= 1) {
			tongTien = PRICE_FIRST_KM;
		} else if (soKm > 1 && soKm <= 19) {
			tongTien = PRICE_FIRST_KM + (soKm - 1) * PRICE_PRE_KM_2_TO_19;
		} else {
			tongTien = PRICE_FIRST_KM + (18 * PRICE_PRE_KM_2_TO_19) + (soKm - 19) * PRICE_PRE_KN_OVER_19;
		}

		if (soPhut >= 3) {
			tongTienCho = (soPhut * 1.0f / 3) * WAITING_INTERVAL_MINUTES;
		}

		return tongTien + tongTienCho;

	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Mời bạn chọn 1: GradCar 2: GrabSuv 3: GrabBlack");
		int luaChon = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập số km: ");
		float soKm = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập số phút: ");
		float soPhut = Float.parseFloat(sc.nextLine());

		float ketQua = 0;
		boolean flag = true;

		switch (luaChon) {
		case 1:
			ketQua = GrabCar(soKm, soPhut);
			break;
		case 2:
			ketQua = GrabSuv(soKm, soPhut);
			break;
		case 3:
			ketQua = GrabBlack(soKm, soPhut);
			break;
		default:
			flag = false;
		}

		if (flag) {
			System.out.println("Số KM: " + soKm);
			System.out.println("Số phút: " + soPhut);
			System.out.println("Số tiền: " + ketQua);
		} else {
			System.out.println("Lựa chọn không hợp lệ từ 1 - 3");
		}

	}

}
