package Model;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Equipos {
    private int id;
    private String name;
    private int ranking;
    private String flagPath;

    public Equipos(int id, String name, int ranking, String flagPath) {
        this.id = id;
        this.name = name;
        this.ranking = ranking;
        this.flagPath = flagPath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
