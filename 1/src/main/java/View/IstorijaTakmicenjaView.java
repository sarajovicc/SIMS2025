package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.TakmicenjeController;
import model.Takmicenje;

public class IstorijaTakmicenjaView extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;

    public IstorijaTakmicenjaView(List<Takmicenje> takmicenja, TakmicenjeController controller) {
        setTitle("Istorija takmičenja");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel(new Object[]{"Naziv", "Datum"}, 0);
        table = new JTable(tableModel);
        table.setBackground(new Color(230, 230, 250));
        add(new JScrollPane(table), BorderLayout.CENTER);

        for (Takmicenje t : takmicenja) {
            tableModel.addRow(new Object[]{t.getKategorija(), t.getDatum()});
        }

        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    controller.selektovanoTakmicenje(takmicenja.get(selectedRow));
                }
            }
        });
    }
}
