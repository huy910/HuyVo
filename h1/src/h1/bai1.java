package h1;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" nhap so thu nhat : ");
		float a = scanner.nextInt();
		System.out.print(" nhap so thu hai : ");
		float b = scanner.nextInt();
		float tong = a + b;
		System.out.print(" tong cua bai la " + tong);
		float hieu = a - b;
		System.out.print(" hieu cua bai la " + hieu);
		float nhan = a * b;
		System.out.print(" tich cua bai la  " + nhan);
		float chia = a / b;
		System.out.print(" thuong cua bai la " + String.format("%.2f", chia));
	}
}
