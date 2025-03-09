package ro.ctrln.classes;

import java.math.BigDecimal;
import java.util.Objects;

/*
     Sunt patru tipuri de variabile
     → Variabile de instanta
     → Variabile  de clasa
     → Variabile locale
     →  parametri
     → mai sunt si tipuri de clase ex:BigDecimal
 */
public class Star {
    /// ///////////////////// variabile de instanta sau proprietatile clasei ///////////////////
    String starDescription;
    int diameter;
    int satellites;
    BigDecimal mass;
    SmallPlanet smallPlanet;

    /// ////////////////asa se declara o constanta, care poate fi accesata din alte clase pentru ca e "publica" /////////////////
    public static final boolean MILKYWAYSTAR = true;

    //public - poate folosi din alte clase
    // private - poate fi folosita doar din interiorul clasei
    public Star() {
    }

    /// //////////parametri sunt in parantezele rotunde si la cit la constructor atit si la metode /////////////
    public Star(String starDescription, int diameter, int satellites, BigDecimal mass) {
        this.starDescription = starDescription;
        this.diameter = diameter;
        this.satellites = satellites;
        this.mass = mass;
//        this.smallPlanet = smallPlanet;
    }

    public String getStarDescription() {
        return starDescription;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getSatellites() {
        return satellites;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public void setStarDescription(String starDescription) {
        this.starDescription = starDescription;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setSatellites(int satellites) {
        this.satellites = satellites;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    public void setSmallPlanet(SmallPlanet planetNme/*parametru*/) {
        this.smallPlanet /*variabila de instanta*/ = planetNme; //parametru metodei
    }

    public SmallPlanet getSmallPlanet() {
        return smallPlanet;
    }

    public int functionC() {
        return 1;
    }

    @Override
    public String toString() {
        return "Star{" +
                "starDescription=' " + starDescription + '\'' +
                ", diameter= " + diameter +
                ", satellites=" + satellites +
                ", mass=" + mass +
                ", smallPlanet=" + smallPlanet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return diameter == star.diameter &&
                satellites == star.satellites &&
                Objects.equals(starDescription, star.starDescription) &&
                Objects.equals(mass, star.mass) &&
                Objects.equals(smallPlanet, star.smallPlanet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(starDescription, diameter, satellites, mass, smallPlanet);
    }




}


