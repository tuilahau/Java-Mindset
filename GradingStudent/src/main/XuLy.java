package main;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		String tenSinhVien, xepLoai;
		float diemToan, diemLy, diemHoa, diemTrungBinh;

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		tenSinhVien = sc.nextLine();
		System.out.println("Nhập điểm toán: ");
		diemToan = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm lý: ");
		diemLy = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm hóa: ");
		diemHoa = Float.parseFloat(sc.nextLine());
		
		diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
		
		if(diemTrungBinh >= 8.5) {
			xepLoai = "GIỎI";
		}else if (diemTrungBinh >= 6.5) {
			xepLoai = "KHÁ";
		}else if (diemTrungBinh >= 5) {
			xepLoai = "TB";
		}else {
			xepLoai = "YẾU";
		}
		
		System.out.println("Tên học sinh: " + tenSinhVien + 
					       "\t Điểm trung bình: " + diemTrungBinh + 
					       "\t Xếp loại: " + xepLoai);
		
		

	}

}
