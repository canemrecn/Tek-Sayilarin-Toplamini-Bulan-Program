package tstblp;

import java.util.Scanner;

public class tst {
	public static void main(String[] args) {
		Scanner inpScanner = new Scanner(System.in);
		int number;
		int total = 0;
		while (true) {
			System.out.print("Sayi Giriniz: ");
			number = inpScanner.nextInt();
			if (number < 0) {
				break;	
			}
			if (number % 2 == 1) {
				total += number;
			}
		}
		System.out.println("Toplam: " + total);
	}

}
