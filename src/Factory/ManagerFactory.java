package Factory;

import Abstraction.Listeleyebilir;
import Abstraction.Yazabilir;
import Business.PersonelManager;
import Model.Personel;

public class ManagerFactory {

	public static Yazabilir<Personel> getYazabilirNesne() {
		// TODO Auto-generated method stub
		return new PersonelManager();
	}

	public static Listeleyebilir<Personel> getListeleyebilirNesne() {
		// TODO Auto-generated method stub
		return new PersonelManager();
	}

}
