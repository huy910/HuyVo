package baitap;

import java.util.Scanner;

public class baitap3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so hang: ");
		int n = sc.nextInt();
		System.out.println("nhap so cot: ");
		int m = sc.nextInt();
		int[][] mang = new int[n][m];
		System.out.println("nhap gia tri: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("nhap phan tu [" + i + "][" + j + "]: ");
				mang[i][j] = sc.nextInt();
			}
		}
		System.out.println("Ma tran da nhap la: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mang[i][j] + " ");
			}
			System.out.println();
		}
	}
}
