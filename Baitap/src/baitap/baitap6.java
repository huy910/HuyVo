package baitap;

import java.util.Scanner;

public class baitap6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so mang: ");
		int n = sc.nextInt();
		int[] mang = new int[n];

		Mang(mang, n, sc);
		System.out.print("So phan tu da nhap: ");
		Mang2(mang);
	}

	public static void Mang(int[] mang, int n, Scanner sc) {
		for (int i = 0; i < mang.length; i++) {
			System.out.print("phan tu thu: " + i + ":");
			mang[i] = sc.nextInt();
		}
	}

	public static void Mang2(int[] mang) {
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + " ");

		}
	}
}