import View.TrenerPocetniView;

public class Main {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TrenerPocetniView view = new TrenerPocetniView();
                view.setSize(400, 400); // možeš prilagoditi veličinu
                view.setLocationRelativeTo(null); // centriraj prozor
                view.setVisible(true);
	}
		 });
}
}