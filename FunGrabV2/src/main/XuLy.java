package main;

import java.util.Scanner;

public class XuLy {

	static final int GRAB_CAR_1KM = 8000;
	static final int GRAB_SUV_1KM = 9000;
	static final int GRAB_BLACK_1KM = 10000;

	static final int GRAB_CAR_1TO_19 = 7500;
	static final int GRAB_SUV_1TO_19 = 8500;
	static final int GRAB_BLACK_1TO_19 = 9500;

	static final int GRAB_CAR_UPPER_19 = 7000;
	static final int GRAB_SUV_UPPER_19 = 8000;
	static final int GRAB_BLACK_UPPER_19 = 9000;

	static final int GRAB_CAR_WAIT = 2000;
	static final int GRAB_SUV_WAIT = 3000;
	static final int GRAB_BLACK_WAIT = 4000;
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loaiGrab = chonGrab(sc); //là đối số
		float soKM = nhapSoKM(sc);
		int thoiGianCho= nhapThoiGianCho(sc);
		float tienTra = tinhTienTra(loaiGrab, soKM, thoiGianCho);
		System.out.println("Tiền trả: " + tienTra);

	}
	
	public static float nhapSoKM(Scanner sc) {
		float soKM;
		System.out.print("Vui lòng nhập vào số km: ");
		soKM = Float.parseFloat(sc.nextLine());
		return soKM;
	}
	
	public static int nhapThoiGianCho(Scanner sc) {
		int thoiGianCho;
		System.out.print("Vui lòng nhập thời gian chờ: ");
		thoiGianCho = Integer.parseInt(sc.nextLine());
		return thoiGianCho;
	}

	public static int chonGrab(Scanner sc) {
		int loai;
		System.out.println("Vui lòng chọn loại Grab");
		System.out.println("1. Grab Car");
		System.out.println("2. Grab SUV");
		System.out.println("3. Grab Black");
		loai = Integer.parseInt(sc.nextLine());
		return loai;
	}

	public static float tinhTienKMDauTien(int loaiGrab) {
		float tongTien = 0;
		if (loaiGrab == 1) {
			tongTien = GRAB_CAR_1KM;
		} else if (tongTien == 2) {
			tongTien = GRAB_SUV_1KM;
		} else {
			tongTien = GRAB_BLACK_1KM;
		}
		return tongTien;
	}

	public static float tinhTienKM1Den19(int loaiGrab, float soKM) {
		float tongTien = 0;
		if (loaiGrab == 1) {
			tongTien = GRAB_CAR_1KM + (soKM - 1) * GRAB_CAR_1TO_19;
		} else if (loaiGrab == 2) {
			tongTien = GRAB_SUV_1KM + (soKM - 1) * GRAB_SUV_1TO_19;
		} else {
			tongTien = GRAB_BLACK_1KM + (soKM - 1) * GRAB_BLACK_1TO_19;
		}
		return tongTien;
	}

	public static float tinhTienKMTren19(int loaiGrab, float soKM) {
		float tongTien = 0;
		if (loaiGrab == 1) {
			tongTien = GRAB_CAR_1KM + 18 * GRAB_CAR_1TO_19 + (soKM - 19) * GRAB_CAR_UPPER_19;
		} else if (loaiGrab == 2) {
			tongTien = GRAB_SUV_1KM + 18 * GRAB_SUV_1TO_19 + (soKM - 19) * GRAB_SUV_UPPER_19;
		} else {
			tongTien = GRAB_BLACK_1KM + 18 * GRAB_BLACK_1TO_19 + (soKM - 19) * GRAB_BLACK_UPPER_19;
		}
		return tongTien;
	}

	public static float tinhTienCho(int loaiGrab, int thoiGianCho) {
		float tongTien = 0;
		if (thoiGianCho >= 3) {
			int soLanCho = Math.round(thoiGianCho * 1.0f / 3);
			if (loaiGrab == 1) {
				tongTien = soLanCho * GRAB_CAR_WAIT;
			} else if (loaiGrab == 2) {
				tongTien = soLanCho * GRAB_SUV_WAIT;
			} else {
				tongTien = soLanCho * GRAB_BLACK_WAIT;
			}
		}
		return tongTien;
	}

	public static float tinhTienTra(int loaiGrab, float soKM, int thoiGianCho) {
		float tienTra = 0;
		if (soKM <= 1) {
			tienTra = tinhTienKMDauTien(loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
		} else if (soKM > 1 && soKM <= 19) {
			tienTra = tinhTienKM1Den19(loaiGrab, soKM) + tinhTienCho(loaiGrab, thoiGianCho);
		} else {
			tienTra = tinhTienKMTren19(loaiGrab, soKM) + tinhTienCho(loaiGrab, thoiGianCho);
		}
		return tienTra;
	}

	

}
