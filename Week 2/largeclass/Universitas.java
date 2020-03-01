package largeclass;
import java.util.List;

import largeclass.Dosen;
import largeclass.Jurusan;
import largeclass.Kampus;
import largeclass.MahasiswaOnline;
import largeclass.MahasiswaReguler;

public class Universitas {
	private List<MahasiswaOnline> mahasiswaOnline;
	private List<MahasiswaReguler> mahasiswaReguler;
	private List<Dosen> dosen;
	private List<Jurusan> jurusan;
	private List<Kampus> kampus;
	
	public List<MahasiswaOnline> getMahasiswaOnline() {
		return mahasiswaOnline;
	}
	public void setMahasiswaOnline(List<MahasiswaOnline> mahasiswaOnline) {
		this.mahasiswaOnline = mahasiswaOnline;
	}
	public List<MahasiswaReguler> getMahasiswaReguler() {
		return mahasiswaReguler;
	}
	public void setMahasiswaReguler(List<MahasiswaReguler> mahasiswaReguler) {
		this.mahasiswaReguler = mahasiswaReguler;
	}
	public List<Dosen> getDosen() {
		return dosen;
	}
	public void setDosen(List<Dosen> dosen) {
		this.dosen = dosen;
	}
	public List<Jurusan> getJurusan() {
		return jurusan;
	}
	public void setJurusan(List<Jurusan> jurusan) {
		this.jurusan = jurusan;
	}
	public List<Kampus> getKampus() {
		return kampus;
	}
	public void setKampus(List<Kampus> kampus) {
		this.kampus = kampus;
	}
	
}
