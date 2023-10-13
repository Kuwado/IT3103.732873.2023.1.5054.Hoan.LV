import java.util.Scanner;
public class caculation {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so thu nhat: ");
		double n = input.nextDouble();
		System.out.print("Nhap so thu hai: ");
		double m = input.nextDouble();
		double sum = n + m;
		double diff = n - m;
		double pro = n * m;
		int quo = (int) (n / m);
		double div = n % m;
		System.out.print("Tong " + n + " + " + m + " = " + sum + "\n");
		System.out.print("Hieu " + n + " - " + m + " = " + diff + "\n");
		System.out.print("Tich " + n + " * " + m + " = " + pro + "\n");
		System.out.print("Thuong " + n + " / " + m + " = " + quo + " du " + div + "\n");
	}
}

