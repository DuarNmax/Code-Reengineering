package largemethod;

public class Pesanan {
	private Barang barang;
	private int kuantiti;
	private final int ongkirPerKg = 9000;

	public Pesanan(Barang barang, int kuantiti) {
		super();
		this.barang = barang;
		this.kuantiti = kuantiti;
	}
	public Barang getBarang() {
		return barang;
	}
	public void setBarang(Barang barang) {
		this.barang = barang;
	}
	public int getKuantiti() {
		return kuantiti;
	}
	public void setKuantiti(int kuantiti) {
		this.kuantiti = kuantiti;
	}
	
	private int hitungBiayaLayanan() {
		if (barang.getHarga() <= 500000) {
			return (int) 0.1f * barang.getHarga();
		} else if (barang.getHarga() > 500000 
					&& barang.getHarga() <= 1000000) {
			return (int) 0.15f * barang.getHarga();
		} else {
			return (int) 0.2f * barang.getHarga();
		}
	}

	private int hitungSubtotalPesanan() {
		return (barang.getHarga() * this.kuantiti) 
				+ (barang.getBerat() * this.ongkirPerKg)
				+ hitungBiayaLayanan();
	}
	
	private int hitungDiskon() {
		if (hitungSubtotalPesanan() > 1000000) {
			return 50000;
		}
		return 0;
	}
	
	public int hitungTotalBiayaPesanan() {
		return hitungSubtotalPesanan() - hitungDiskon();
	}
}
