package baitap;

import java.util.Scanner;

public class baitap7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		int[] mang = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("nhap mang [" + i + "]");
			mang[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			System.out.println(mang[i] + " ");
		}
	}
}