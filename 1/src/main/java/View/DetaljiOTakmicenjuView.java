package View;
 
import java.awt.GridLayout;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
import model.Takmicenje;
 
public class DetaljiOTakmicenjuView extends JFrame {
	
	public DetaljiOTakmicenjuView(Takmicenje takmicenja) {
		setTitle("Detalji takmičenja");
        setSize(400, 200);
        setLocationRelativeTo(null);
 
        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.add(new JLabel("Naziv: " + takmicenja.getKategorija()));
        panel.add(new JLabel("Datum: " + takmicenja.getDatum()));
        panel.add(new JLabel("Pobjednik: " + takmicenja.getPobednik()));
        panel.add(new JLabel("Pobjednica: " + takmicenja.getPobednica()));
	
        JButton btnPrint = new JButton("Štampaj");
        
        panel.add(btnPrint);
        add(panel);
        setVisible(true);
	}
}
 
 