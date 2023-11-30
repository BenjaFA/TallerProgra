package Model;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Jugadores {
    private int number;
    private String name;
    private String position;

    public Jugadores(int number, String name, String position) {
        this.number = number;
        this.name = name;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
