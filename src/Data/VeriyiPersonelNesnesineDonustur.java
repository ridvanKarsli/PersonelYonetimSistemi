package Data;

import java.time.LocalDate;

import Model.Personel;

public class VeriyiPersonelNesnesineDonustur {

	public static Personel donustur(String[] veriler) {
		long id = Long.valueOf(veriler[0]);
		String ad = veriler[1];
		String soyad = veriler[2];

		String strDogumTarihi = veriler[3];
		strDogumTarihi = strDogumTarihi.replace(".", ";");
		String[] tarihBolumleri = strDogumTarihi.split(";");
		int gun = Integer.valueOf(tarihBolumleri[0]);
		int ay = Integer.valueOf(tarihBolumleri[1]);
		int yil = Integer.valueOf(tarihBolumleri[2]);
		LocalDate dogumTarihi = LocalDate.of(yil, ay, gun);
o
		double maas = Double.valueOf(veriler[4]);
		Personel personel = new Personel(id, ad, soyad, dogumTarihi, maas);

		System.out.print(personel);
		return personel;
	}
}
