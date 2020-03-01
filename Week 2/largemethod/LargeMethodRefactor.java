package largemethod;
import java.util.Scanner;

public class LargeMethodRefactor {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Harga Barang : ");
		int harga = in.nextInt();
		System.out.print("Jumlah Barang : ");
		int kuantiti = in.nextInt();
		System.out.print("Berat Barang (kg) : ");
		int berat = in.nextInt();
		Barang barang = new Barang(harga, berat);
		Pesanan pesanan = new Pesanan(barang, kuantiti);
		System.out.println("TOTAL BIAYA PESANAN : " + pesanan.hitungTotalBiayaPesanan());

	}

}
