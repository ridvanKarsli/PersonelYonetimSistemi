package Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Abstraction.Listeleyebilir;
import Abstraction.Silebilir;
import Abstraction.Sorgulayabilir;
import Abstraction.Yazabilir;
import Model.Personel;

public class PersonalDataAccess implements Yazabilir<Personel>, Silebilir, Listeleyebilir<Personel>, Sorgulayabilir<Personel> {

	final static String PERSONELLER_DOSYA_ADI = "personeller.csv";
	
	//Yazabilir interface
	
	@Override
	public void ekle(Personel personel) {
		
		try {
			FileWriter dosyaYazici = new FileWriter(PERSONELLER_DOSYA_ADI, true);
			// true üstüne yazar false siler baştan yazar
			String csvPersonel = personel.toCSVString().replace(",", ".");
			dosyaYazici.write("\n");
			dosyaYazici.write(csvPersonel);
			dosyaYazici.close();
			System.out.print("yeni personel başarılı bir şekilde oluşturuldu.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.print("yeni personel oluşturulurken bir hata ile karşılaştırıldı.");
		}
		
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
		
		File personellerDosyasi = new File(PERSONELLER_DOSYA_ADI);
		List<Personel> liste = new ArrayList<Personel>();

		try {
			Scanner reader = new Scanner(personellerDosyasi);
			int i = 0;
			while (reader.hasNextLine()) {

				String satir = reader.nextLine();

				if (i >= 0) {// ilk satırı okumayacağız

					String[] veriler = satir.split(";");
					Personel p = VeriyiPersonelNesnesineDonustur.donustur(veriler);
					liste.add(p);
				}
				i++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return liste;
		
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
