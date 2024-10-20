package baitap;

import java.util.Scanner;

public class baitap5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so mang: ");
		int n = sc.nextInt();
		int[] mang = new int[n];

		Mang(mang, n, sc);
	}

	public static void Mang(int[] mang, int n, Scanner sc) {
		for (int i = 0; i < mang.length; i++) {
			System.out.println("so phan thu: " + i + ":");
			mang[i] = sc.nextInt();
		}
	}
}