package main;

import java.util.Scanner;

public class XuLy {
	public static void main(String[] args) {
		
		final int NUM_CHAR_PADD_LEFT = -100;
		Scanner sc = new Scanner(System.in);
		String movieTitle;
		int adultTicketPrice, childTicketPrice, numberOfAdultTickets, 
		numberOfChildTickets, totalDonationPercentage;
		float donationAmount, netRevenue, totalRevenue;

		System.out.print("The input movie title: ");
		movieTitle = sc.nextLine();
		System.out.print("The input Adult ticket price: ");
		adultTicketPrice = Integer.parseInt(sc.nextLine());
		System.out.print("The input Child ticket price: ");
		childTicketPrice = Integer.parseInt(sc.nextLine());
		System.out.print("The input number of Adult tickets: ");
		numberOfAdultTickets = Integer.parseInt(sc.nextLine());
		System.out.print("The input num of Child tickets: ");
		numberOfChildTickets = Integer.parseInt(sc.nextLine());
		System.out.print("The input total donation percantage: ");
		totalDonationPercentage = Integer.parseInt(sc.nextLine());

		
		totalRevenue =  adultTicketPrice * numberOfAdultTickets + childTicketPrice * numberOfChildTickets;

		donationAmount = totalRevenue * ((1.0f * totalDonationPercentage) / 100);
		

		netRevenue = totalRevenue - donationAmount;
		
		String text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s" , "Tên-phim").replace(' ', '.').replace('-', ' ');
		System.out.println(text + movieTitle);
		
		
		text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Số-vé-đã-bán").replace(' ', '.').replace('-', ' ');
		System.out.println(text + (numberOfAdultTickets + numberOfChildTickets));
		
		text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "doanh-thu").replace(' ', '.').replace('-', ' ');
		System.out.println(text + totalRevenue);
		
		text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Trích-từ-phần-trăm-từ-thiện").replace(' ', '.').replace('-', ' ');
		System.out.println(text + totalDonationPercentage + "%");
		
		text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Tổng-tiền-trích-từ-thiện").replace(' ', '.').replace('-', ' ');
		System.out.println(text + netRevenue);
//
//		System.out.printf("\n|%-30s|%30d|", "Số vé đã bán: ", numberOfAdultTickets + numberOfChildTickets);
//
//		System.out.printf("\n|%-30s|%30d|", "Trích %% từ thiện: ", totalDonationPercentage );
//
//		System.out.printf("\n|%-30s|%30.0f|", "Tổng tiền từ thiện: ", totalRevenue);
//
//		System.out.printf("\n|%30s|%30.0f|", "Tổng doanh thu sau khi trừ: ", netRevenue);
//		
		sc.close();

	}

}
