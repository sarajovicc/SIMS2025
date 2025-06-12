package model;

import java.util.ArrayList;
import java.util.List;

public class TakmicenjaRepository {

	private List<Takmicenje> takmicenja = new ArrayList<>();
	

	public List<Takmicenje> getAllCompetitions(){
		List<Takmicenje>takmicenja = new ArrayList<>();

		takmicenja.add(new Takmicenje("Preskakanje konopca","12.4.2024.","Ana Marković","Milan Petrović"));
		takmicenja.add(new Takmicenje("Trčanje na 100m", "18.5.2024.", "Marko Jovanović", "Jelena Ilić"));
		takmicenja.add(new Takmicenje("Skok u dalj", "25.5.2024.", "Nikola Stanković", "Milica Lukić"));
		takmicenja.add(new Takmicenje("Bacanje kugle", "3.6.2024.", "Stefan Nikolić", "Ivana Pavlović"));
		takmicenja.add(new Takmicenje("Penjanje uz konopac", "10.6.2024.", "Aleksandar Đorđević", "Sara Kovačević"));
		takmicenja.add(new Takmicenje("Vožnja bicikla", "15.6.2024.", "Luka Ristić", "Tamara Vuković"));

		return takmicenja;
}	


}