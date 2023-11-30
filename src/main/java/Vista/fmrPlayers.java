package Vista;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fmrPlayers extends JFrame{

    private JTable tbFormacion;
    private JButton btnGuardarCambios;
    private JButton btnEditar;
    private JButton btnVolver;
    private JPanel jpPlayers;

    public fmrPlayers(){
        setVisible(true);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setTitle("Login");
        setContentPane(jpPlayers);


        //BOTON VOLVER
        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new fmrTeams();
                dispose();
            }
        });
    }
}
