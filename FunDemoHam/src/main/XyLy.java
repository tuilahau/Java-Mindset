package main;

public class XyLy {
	
	public static int tinhTong(int a, int b) {
		int tong = a + b;
		return tong;
	}
	
	public static void main(String[] args) {
		int x = 10;
		int y =9; 
		int ketQua = tinhTong(x, y);
		System.out.println("Kết quả: " + ketQua);

	}

}
