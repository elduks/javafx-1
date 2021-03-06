/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package location.app.persistence;

import java.util.Objects;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author DELL
 */
public class Location {
    
    private SimpleIntegerProperty idlocation ;
    private SimpleIntegerProperty idclient ;
    private SimpleIntegerProperty idvoiture;
    private SimpleStringProperty datedebut;
    private SimpleStringProperty datefin;
    private SimpleFloatProperty tarif ;
   
    //constructeurs par defaut
    public Location() {
    }
    
    //constructeur paramétré

    public Location(int idlocation,int idclient, int idvoiture, String datedebut, String datefin, float tarif) {
        this.idlocation = new SimpleIntegerProperty(idlocation);
        this.idclient = new SimpleIntegerProperty(idclient);
        this.idvoiture = new SimpleIntegerProperty(idvoiture);
        this.datedebut = new SimpleStringProperty(datedebut);
        this.datefin = new SimpleStringProperty(datefin);
        this.tarif = new SimpleFloatProperty(tarif);
    }

    //xxxxxxxx
     public SimpleIntegerProperty Idlocation_Property(){return idlocation;}
     public SimpleIntegerProperty Idclient_Property(){return idclient;}
     public SimpleIntegerProperty Idvoiture_Property(){return idvoiture;}
     public SimpleStringProperty Datedebut_Property(){return datedebut;} 
     public SimpleStringProperty Datefin_Property(){return datefin;}
     public SimpleFloatProperty Tarif_Property(){return tarif;}
     
    //getters
    public SimpleIntegerProperty  getIdlocation() {
        return idlocation;
    }
    public SimpleIntegerProperty  getIdclient() {
        return idclient;
    }

    public SimpleIntegerProperty getIdvoiture() {
        return idvoiture;
    }

    public SimpleStringProperty getDatedebut() {
        return datedebut;
    }

    public SimpleStringProperty getDatefin() {
        return datefin;
    }

    public SimpleFloatProperty getTarif() {
        return tarif;
    }

    //setters
    public void setIdlocation(int idlocation) {
        this.idlocation.setValue(idlocation); 
    }

    public void setIdclient(int idcllient) {
        this.idclient .setValue(idcllient); 
    }
    public void setIdvoiture(int idvoiture) {
        this.idvoiture.setValue(idvoiture);
    }

    public void setDatedebut(String datedebut) {
        this.datedebut.setValue(datedebut);
    }

    public void setDatefin(String datefin) {
        this.datefin.setValue(datefin);
    }

    public void setTarif(float tarif) {
        this.tarif.setValue(tarif);
    }

  

    //equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.idclient != other.idclient) {
            return false;
        }
        if (this.idvoiture != other.idvoiture) {
            return false;
        }
        if (!Objects.equals(this.datedebut, other.datedebut)) {
            return false;
        }
        if (!Objects.equals(this.datefin, other.datefin)) {
            return false;
        }
        if (!Objects.equals(this.tarif, other.tarif)) {
            return false;
        }
        return true;
    }

    
  
    //tostring
    @Override
    public String toString() {
        return "Location{" + "idclient=" + idclient + ", idoiture=" + idvoiture + ", datedebut=" + datedebut + ", datefin=" + datefin + ", tarif=" + tarif + '}';
    }
}
