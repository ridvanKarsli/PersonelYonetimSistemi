package Abstraction;

import java.util.List;

public interface Yazabilir<T> {
	
	void ekle(T object);
	void guncelle(T object);
	void topluEkle(List<T> objects);
	void topluGuncelle(List<T> objects);
}



/*
* PROJE BAŞLANGICI
* 1.class diyagramı kurulumu.
* 2.interfacelerin oluşturulması.
*/