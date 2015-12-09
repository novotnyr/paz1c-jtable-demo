package sk.upjs.ics.paz1c.jtable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HockeyPlayersForm extends JFrame {
    public static final int NO_SELECTION = -1;

    private JScrollPane playersTableScrollPane;

    private JTable playersTable;

    private HockeyPlayersTableModel playersTableModel = new HockeyPlayersTableModel();

    public HockeyPlayersForm() {
        initComponents();
    }

    private void initComponents() {
        this.playersTable = new JTable(playersTableModel);
        this.playersTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                playersTableMouseClicked(e);
            }
        });

        this.playersTableScrollPane = new JScrollPane(this.playersTable);
        add(this.playersTableScrollPane);

        setBounds(new Rectangle(800, 600));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void playersTableMouseClicked(MouseEvent event) {
        if(event.getClickCount() == 2) {
            int selectedRowIndex = this.playersTable.getSelectedRow();
            if(selectedRowIndex == NO_SELECTION) {
                return;
            }
            Player selectedPlayer = this.playersTableModel.getPlayerAt(selectedRowIndex);
            JOptionPane.showMessageDialog(this, selectedPlayer.getName());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HockeyPlayersForm hockeyPlayersForm = new HockeyPlayersForm();
                hockeyPlayersForm.setVisible(true);
            }
        });
    }
}
