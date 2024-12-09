package Business;

import java.util.List;

import Abstraction.Listeleyebilir;
import Abstraction.Silebilir;
import Abstraction.Sorgulayabilir;
import Abstraction.Yazabilir;
import Factory.DataAccessFactory;
import Model.Personel;

public class PersonelManager implements Yazabilir<Personel>, Silebilir, Listeleyebilir<Personel>, Sorgulayabilir<Personel> {

	Yazabilir<Personel> yazmaIslemleri = DataAccessFactory.getYazabilirNesne();
	Listeleyebilir<Personel> listelemeIslemleri = DataAccessFactory.getListeleyebilirNesne(); 
	
	//Yazabilir interface
	
	@Override
	public void ekle(Personel p) {
		
		yazmaIslemleri.ekle(p);
		
	}

	@Override
	public void guncelle(Personel object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void topluEkle(List<Personel> objects) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void topluGuncelle(List<Personel> objects) {
		// TODO Auto-generated method stub
		
	}

	
	//Silebilir interface
	
	@Override
	public void idIleSil(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void topluSil(long[] idler) {
		// TODO Auto-generated method stub
		
	}
	
	
	//Listeleyebilir interface

	@Override
	public List<Personel> hepsiniListele() {
		// TODO Auto-generated method stub
		return listelemeIslemleri.hepsiniListele();
	}

	@Override
	public void siraliListele(String siraliKisi) {
		// TODO Auto-generated method stub
		
	}
	
	
	//Sorgulayabilir interface

	@Override
	public Personel idIleSorgula(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personel tcIleSorgula(long tcKimlikNo) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
