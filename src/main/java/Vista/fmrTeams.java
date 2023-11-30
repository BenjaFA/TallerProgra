package Vista;

import Model.Jugadores;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fmrTeams extends JFrame{
    private JComboBox cbChoose;
    private JButton btnPlayers;
    private JButton btnExit;
    private JTextField txtRanking;
    private JLabel lblChoose;
    private JLabel lblRanking;
    private JLabel lblImage;
    private JPanel jpTeams;

    public fmrTeams(){
        setVisible(true);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setTitle("Teams");
        setContentPane(jpTeams);

        //BOTON SALIR
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        //BOTON PLAYERS
        btnPlayers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new fmrPlayers();
                dispose();
            }
        });
    }
}


