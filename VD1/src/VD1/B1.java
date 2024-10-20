package VD1;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("chieu dai =");
		int chieudai = scanner.nextInt();
		System.out.println("chieu rong =");
		int chieurong = scanner.nextInt();
		int chuvi = (chieudai + chieurong) * 2;
		System.out.println("chu vi =" + chuvi);

		int dientich = chieudai * chieurong;
		System.out.println("dien tich =" + dientich);

		System.out.println("Min =" + Math.min(chuvi, dientich));

	}

}
