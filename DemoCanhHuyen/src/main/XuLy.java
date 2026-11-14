package main;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		
		int edge1; // canh goc vuong 1
		int edge2; // canh goc vuong 2
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập vào cạnh 1: ");
		edge1= Integer.parseInt(sc.nextLine());
		System.out.println("Vui lòng nhâp vào cạnh 2: ");
		edge2 = Integer.parseInt(sc.nextLine());
		
		double edge3 = Math.sqrt(edge1 * edge1 + edge2 * edge2);
		System.out.println("Cạnh huyền là : " + edge3);
		

	}

}
