package model;

import java.sql.Date;

public class Takmicenje {
	
	private String kategorija;
    private String datum;
    private String pobednik;
    private String pobednica;
    
	public Takmicenje() {
		super();
	}

	public Takmicenje(String kategorija, String datum, String pobednik, String pobednica) {
		super();
		this.kategorija = kategorija;
		this.datum = datum;
		this.pobednik = pobednik;
		this.pobednica = pobednica;
	}

	public String getKategorija() {
		return kategorija;
	}

	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getPobednik() {
		return pobednik;
	}

	public void setPobednik(String pobednik) {
		this.pobednik = pobednik;
	}

	public String getPobednica() {
		return pobednica;
	}

	public void setPobednica(String pobednica) {
		this.pobednica = pobednica;
	}

	@Override
	public String toString() {
		return "Takmicenje [kategorija=" + kategorija + ", datum=" + datum + ", pobednik=" + pobednik + ", pobednica="
				+ pobednica + "]";
	}

	
	
    

}
