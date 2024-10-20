package baitap;

import java.util.Scanner;

public class baitap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhập số phần tử của mảng: ");
		int n = sc.nextInt();

		int[] mang = new int[n];
		// nhập giá trị cho mang
		System.out.println("nhập các phần tử của mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.println("phần tử thứ" + (i + 1) + ":");
			mang[i] = sc.nextInt();

		}
		// tính tổng
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += mang[i];

		}
		// tính trung bình cộng
		double trungbinh = (double) sum / n;

		// in kết quả
		System.out.println("tổng các phần tử của mạng là:" + sum);
		System.out.println("trung bình cộng các phần tử của mạng là:" + trungbinh);

	}
}
