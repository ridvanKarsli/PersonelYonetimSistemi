package Model;

import java.time.LocalDate;

import Helper.DateTimeHelper;

public class Personel extends Kisi {

	private LocalDate dogumTarihi;
	private double maas;

	public Personel(long id, String ad, String soyad, LocalDate dogumTarihi2, double maas2) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
		this.maas = maas;
	}
	public Personel() {
		
	}

	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	@Override
	public String toString() {
		return "Personel [id=" + id + ", ad=" + ad + ", soyad=" + soyad + "dogumTarihi=" + dogumTarihi + ", maas="
				+ maas + "]";
	}

	public String toCSVString() {

		String formatlanmisTarih = DateTimeHelper.tarihBicimlendir(dogumTarihi, DateTimeHelper.NOKTALI_TARIH_FORMATI);

		return String.format("%d;%s;%s;%s;%.2f\n", id, ad, soyad, formatlanmisTarih, maas);
	}

}
