package praktikum2;
import java.util.Scanner;

public class PengkondisianSwitch {
	public static void main (String args[]) {
		int angka1, angka2, hasil;
		String perhitungan;
		Scanner input = new Scanner(System.in);
		System.out.print("masukan angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("masukan angka 2 : ");
		angka2 = input.nextInt();
		System.out.print("list perhitungan yang diinginkan"
				+ "\n + : pertambahan"
				+ "\n - : pengurangan"
				+ "\n * : perkalian"
				+ "\n / : pembagian"
				+ "\n : masukan angka perhitungan");
		perhitungan = input.next();
//		kondisian switch
		switch(perhitungan) {
		case "+":
			hasil = angka1 + angka2;
			System.out.println("hasilnya adalah : "+hasil);
			break;
		case "-":
			hasil = angka1 - angka2;
			System.out.println("hasilnya adalah : "+hasil);
			break;
		case "*":
			hasil = angka1 * angka2;
			System.out.println("hasilnya adalah : "+hasil);
			break;
		case "/":
			hasil = angka1 / angka2;
			System.out.println("hasilnya adalah : "+hasil);
			break;
		default:
			System.out.println("simbol yang dimasukan salah");
		}
	}

}
