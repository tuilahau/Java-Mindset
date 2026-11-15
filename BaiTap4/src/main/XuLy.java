package main;

import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("The input court length: ");
		float courtLength = Float.parseFloat(sc.nextLine());
		System.out.print("The input tree length: ");
		float treeRadius = Float.parseFloat(sc.nextLine());
		System.out.print("The input tree spacing: ");
		float treeSpacing = Float.parseFloat(sc.nextLine());
		
		  float treeDiameter = treeRadius * 2;
		
		float spacePerTree = treeDiameter + treeSpacing;
		int numberOfTrees = (int) (courtLength / spacePerTree);
		float totalPlantAre = numberOfTrees * spacePerTree;
		
		System.out.println("Số cây có thể trồng: " + numberOfTrees);
		System.out.println("Không gian được chiếm bởi cây: " + totalPlantAre);
		
		
	}

}
