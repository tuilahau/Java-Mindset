package main;

import java.util.Scanner;

public class XuLy {
	static final float PRIORITY_SCORE_AREA_A = 2.0f;
	static final float PRIORITY_SCORE_AREA_B = 1.0f;
	static final float PRIORITY_SCORE_AREA_C = 0.5f;

	static final float PRIORITY_SCORE_OBJECT_1 = 2.5f;
	static final float PRIORITY_SCORE_OBJECT_2 = 1.5f;
	static final float PRIORITY_SCORE_OBJECT_3 = 1;

	public static int inputArea(Scanner sc) {
		System.out.println("Choose area");
		System.out.println("A. Area 1");
		System.out.println("B. Area 2");
		System.out.println("C. Area 3");
		System.out.println("X. No area");
		String selectedArea = sc.nextLine().toLowerCase();
		if (selectedArea.equals("a")) {
			return 1;
		} else if (selectedArea.equals("b")) {
			return 2;
		} else if (selectedArea.equals("c")) {
			return 3;
		} else {
			return 0;
		}
	}

	public static float selectAreaScore(int seletedArea) {
		if (seletedArea == 1) {
			return PRIORITY_SCORE_AREA_A;
		} else if (seletedArea == 2) {
			return PRIORITY_SCORE_AREA_B;
		} else if (seletedArea == 3) {
			return PRIORITY_SCORE_AREA_C;
		} else {
			return 0;
		}
	}

	public static int inputObject(Scanner sc) {
		System.out.println("Enter candidate category: ");
		System.out.println("0. No priority category");
		System.out.println("1. Category 1");
		System.out.println("2. Category 2");
		System.out.println("3. Category 3");
		int selectedObject = Integer.parseInt(sc.nextLine());
		return selectedObject;
	}

	public static float selectObjectScore(int seletedObject) {
		if (seletedObject == 1) {
			return PRIORITY_SCORE_OBJECT_1;
		} else if (seletedObject == 2) {
			return PRIORITY_SCORE_OBJECT_2;
		} else if (seletedObject == 3) {
			return PRIORITY_SCORE_OBJECT_3;
		} else {
			return 0;
		}
	}
	

	public static float calculatePriorityScore(float areaScore, float objectSocore) {
		return areaScore + objectSocore;
	}

	public static float inputThreeSubjectScores(Scanner sc) {
		System.out.print("Enter the first subject score: ");
		float score1 = Float.parseFloat(sc.nextLine());
		
		System.out.print("Enter the seconds suject score: ");
		float score2 = Float.parseFloat(sc.nextLine());
		
		System.out.print("Enter the third suject score: ");
		float score3 = Float.parseFloat(sc.nextLine());
		
		if (score1 == 0 || score2 == 0 || score3 == 0) {
			System.out.println("A subject score is 0");
			System.out.println("You are not admitted.");
			return 0;

		}
		return score1 + score2 + score3;

	}

	public static float calculateAverageSubjectScore(float totalSujectScore) {
		return totalSujectScore / 3;
	}

	public static float calculateTotalScore(float priorityScore, float averageSujectScore) {
		return priorityScore + averageSujectScore;
	}

	public static float inputPassingScore(Scanner sc) {
		System.out.print("Enter the passing score: ");
		float passingScore = Float.parseFloat(sc.nextLine());
		return passingScore;
	}

	public static void checkAdmission(float passingScore, float totalScore) {
		if (totalScore >= passingScore) {
			System.out.println("You are admitted.");
		} else {
			System.out.println("You are not admitted.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int selectedArea = inputArea(sc);
        float areaScore = selectAreaScore(selectedArea);
        System.out.println("Area priority score: " + areaScore);

        int selectedObject = inputObject(sc);
        float objectScore = selectObjectScore(selectedObject);
        System.out.println("Object priority score: " + objectScore);

        float totalSubjectScore = inputThreeSubjectScores(sc);
        if (totalSubjectScore == 0) {
            sc.close();
            return;
        }
        float averageSubjectScore = calculateAverageSubjectScore(totalSubjectScore);
        System.out.println("Average subject score: " + averageSubjectScore);

        float passingScore = inputPassingScore(sc);

        float totalPriorityScore = calculatePriorityScore(areaScore, objectScore);
        System.out.println("Total priority score: " + totalPriorityScore);

        float totalScore = calculateTotalScore(totalPriorityScore, averageSubjectScore);
        System.out.println("Total score: " + totalScore);

        checkAdmission(passingScore, totalScore);

        sc.close();


	}

}
