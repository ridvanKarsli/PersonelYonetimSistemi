package Personel;

import java.time.LocalDate;
import java.util.List;

import Abstraction.Listeleyebilir;
import Abstraction.Yazabilir;
import Factory.ManagerFactory;
import Model.Personel;

public class Program {

	public static void main(String[] args) {
		
		Personel personel = new Personel();

		personel.setAd("ali");
		personel.setSoyad("veli");
		personel.setId(1L);
		personel.setDogumTarihi(LocalDate.of(2000, 1, 2));
		personel.setMaas(2000.0);
		
		Yazabilir<Personel> yazmaIslemi = ManagerFactory.getYazabilirNesne();
		
		yazmaIslemi.ekle(personel);
		
		Listeleyebilir<Personel> listeIslemi = ManagerFactory.getListeleyebilirNesne();
		
		List<Personel> liste = listeIslemi.hepsiniListele();
		
		//sil işlemi 1 idsine sahip persobeli silinecek
	}

}
