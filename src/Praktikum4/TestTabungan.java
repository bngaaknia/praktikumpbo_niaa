package Praktikum4;
import java.util.Scanner;
public class TestTabungan {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int saldo, tariktunai;
		
		System.out.print("Masukan saldo : ");
		saldo = input.nextInt();
		Tabungan atm = new Tabungan(100000);
		System.out.println("Saldo Anda : "+atm.saldo);
		
		System.out.print("Masukan nominal tarik tunai : ");
		tariktunai = input.nextInt();
		atm.ambiluang(tariktunai);
		System.out.println("Jumlah saldo yang diambil : "+tariktunai);
		System.out.print("Saldo saat ini : "+atm.saldo);
	}

}
