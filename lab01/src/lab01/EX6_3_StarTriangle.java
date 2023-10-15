package lab01;
import java.util.Scanner;

public class EX6_3_StarTriangle {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap chieu cao: ");
		int h = input.nextInt(); // nhap chieu cao tam giac
		System.out.print("Tam giac hinh sao co do cao " + h + " la: \n");
		for(int i=0; i<h; i++) {
			int a = h - i -1; // a la so khoang trang den ngoi sao dau tien cua moi dong
			int b = 2*i + 1; // b la so ngoi sao cua moi dong
			for(int j=0; j<a; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<b; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
