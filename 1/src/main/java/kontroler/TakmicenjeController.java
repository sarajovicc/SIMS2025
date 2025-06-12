package kontroler;

import java.util.List;

import View.DetaljiOTakmicenjuView;
import View.IstorijaTakmicenjaView;
import View.TrenerPocetniView;
import model.TakmicenjaRepository;
import model.Takmicenje;

public class TakmicenjeController {
	private TrenerPocetniView pocetniView;
    private List<Takmicenje> takmicenja;

    public TakmicenjeController() {
    	TakmicenjaRepository repository = new TakmicenjaRepository();
        takmicenja = repository.getAllCompetitions();

        pocetniView = new TrenerPocetniView(this);
        pocetniView.setVisible(true);
    }

    public void prikaziIstoriju() {
        IstorijaTakmicenjaView istorija = new IstorijaTakmicenjaView(takmicenja, this);
        istorija.setVisible(true);
    }

    public void selektovanoTakmicenje(Takmicenje takmicenje) {
    	DetaljiOTakmicenjuView detalji = new DetaljiOTakmicenjuView(takmicenje);
        detalji.setVisible(true);
    }
}