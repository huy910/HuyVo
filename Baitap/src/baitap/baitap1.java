package baitap;

import java.util.Scanner;

public class baitap1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so mang: ");
		int n = sc.nextInt();
		int[] mang = new int[n];
		System.out.println("nhap gia tri cua mang: ");
		for (int i = 0; i < mang.length; i++) {
			System.out.print("Phan tu thu:" + i + ":");
			mang[i] = sc.nextInt();

		}
		System.out.println("gia tri da nhap la: ");
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + " ");
		}
	}
}
