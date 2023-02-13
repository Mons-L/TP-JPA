package model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private int duree;
    private String lieu;

    @ManyToOne(cascade = CascadeType.ALL)
    private Formateur formateur;

    public Formation(String label, int duree, String lieu, Formateur formateur){
        super();
        this.label = label;
        this.duree = duree;
        this.lieu = lieu;
        this.formateur = formateur;
    }

    public Formation() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    @Override
    public String toString() {
        return "Formation{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", duree=" + duree +
                ", lieu='" + lieu + '\'' +
                '}';
    }
}