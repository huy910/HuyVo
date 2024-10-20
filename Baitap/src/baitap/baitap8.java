package baitap;

import java.util.Scanner;

public class baitap8 {
	static boolean snt(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void inkq(int[] mang) {
		for (int i = 0; i < mang.length; i++) {
			if (snt(mang[i])) {
				System.out.print(mang[i] + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua mang:");
		int n = sc.nextInt();
		int[] mang = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu [" + i + "]:");
			mang[i] = sc.nextInt();
		}
		System.out.println("Cac phan tu da nhap la:");
		for (int i = 0; i < n; i++) {
			System.out.print(mang[i] + " ");
		}
		System.out.println();
		System.out.println("Cac phan tu la so nguyen so:");
		inkq(mang);
	}

}
