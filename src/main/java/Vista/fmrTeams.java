package Vista;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fmrTeams extends JFrame{
    private JButton btnPlayers;
    private JButton btnExit;
    private JTextField txtRanking;
    private JLabel lblChoose;
    private JLabel lblRanking;
    private JLabel lblImage;
    private JPanel jpTeams;
    private JRadioButton rdbChile;
    private JRadioButton rdbAlemania;
    private JRadioButton rdbAustralia;
    private JRadioButton rdbCamerun;
    private ButtonGroup grupoBotonesSeleccion;

    public fmrTeams(){

        grupoBotonesSeleccion = new ButtonGroup();
        ButtonGroup grupoBotonesSeleccion = new ButtonGroup();

        grupoBotonesSeleccion.add(rdbChile);
        grupoBotonesSeleccion.add(rdbAlemania);
        grupoBotonesSeleccion.add(rdbAustralia);
        grupoBotonesSeleccion.add(rdbCamerun);

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

        txtRanking.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        rdbAlemania = new JRadioButton("Alemania");
        rdbAustralia = new JRadioButton("Australia");
        rdbCamerun = new JRadioButton("Camerun");
        rdbChile = new JRadioButton("Chile");

        rdbAustralia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtRanking.setText("48");
            }
        });

        rdbCamerun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtRanking.setText("48");
            }
        });

    }
}


