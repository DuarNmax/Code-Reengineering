package largemethod;
import java.util.Scanner;

public class LargeMethodSmell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Harga Barang : ");
		int harga = in.nextInt();
		System.out.print("Jumlah Barang : ");
		int kuantiti = in.nextInt();
		System.out.print("Berat Barang (kg) : ");
		int berat = in.nextInt();
		
		/*
		 *  kalkulasi total biaya pesanan (asumsi perhitungan)
		 *  = (harga * kuantiti) + ongkir (berat * 9000) + biaya layanan - diskon
		 */
		
		float biayaLayanan = 0f;
		if (harga <= 500000) {
			biayaLayanan = 0.1f * harga;
		} else if (harga > 500000 && harga <= 1000000) {
			biayaLayanan = 0.15f * harga;
		} else {
			biayaLayanan = 0.2f * harga;
		}
		
		int subtotal = (harga * kuantiti) + (berat * 9000) +
						+ (int) biayaLayanan;
		int diskon = 0;
		if (subtotal > 1000000) {
			diskon = 50000;
		}
		
		int totalBiayaPesanan = subtotal - diskon;
		System.out.println("TOTAL BIAYA PESANAN : " + totalBiayaPesanan);
	}

}
