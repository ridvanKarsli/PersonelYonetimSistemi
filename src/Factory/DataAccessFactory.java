package Factory;

import Abstraction.Listeleyebilir;
import Abstraction.Yazabilir;
import Data.PersonalDataAccess;
import Model.Personel;

public class DataAccessFactory {

	public static Yazabilir<Personel> getYazabilirNesne() {
		// TODO Auto-generated method stub
		return new PersonalDataAccess();
	}

	public static Listeleyebilir<Personel> getListeleyebilirNesne() {
		// TODO Auto-generated method stub
		return new PersonalDataAccess();
	}

}
