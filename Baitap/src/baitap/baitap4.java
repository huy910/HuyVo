package baitap;

import java.util.Scanner;

public class baitap4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap so hang: ");
		int n = sc.nextInt();
		System.out.print("nhap so cot: ");
		int m = sc.nextInt();
		int[][] mang = new int[n][m];
		System.out.println("nhap gia tri");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("so phan tu[" + i + "][" + i + "]: ");
				mang[i][j] = sc.nextInt();

			}
		}
		System.out.println("ma tran da nhap la: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mang[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("cac phan tu tren duong cheo chinh: ");
		int sum = 0;
		for (int i = 0; i < Math.min(n, m); i++) {
			System.out.print(mang[i][i] + " ");
			sum += mang[i][i];
			System.out.println("Tong duong cheo chinh la: " + sum);
		}
	}

}
