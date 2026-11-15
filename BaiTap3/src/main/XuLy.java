package main;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập tọa độ xC");
		float xC = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập tọa độ yC");
		float yC = Float.parseFloat(sc.nextLine());
		
		System.out.println("Nhập tọa độ xM");
		float xM = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập tọa độ yM");
		float yM = Float.parseFloat(sc.nextLine());
		
		System.out.println("Nhập bán kính r: ");
		float r = Float.parseFloat(sc.nextLine());
		
		double d = Math.sqrt(Math.pow(xM - xC, 2) + Math.pow(yM - yC, 2));
		System.out.println(d);
		
		String result = "";
		
		if (d  < r) {
			result  = "Điểm M nằm trong C";
		}else if(d == r) {
			result = "Điểm M nằm trên C";
		}else {
			result = "Điểm M nằm ngoài C";
		}
		
		
		System.out.println(result);
	}

}
