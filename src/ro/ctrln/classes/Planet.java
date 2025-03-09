package ro.ctrln.classes;

import java.util.Objects;

public class Planet {
    private String planetName;
    private int numberOfOceans;
    private double mass;
    private short numberOfMoons;

    public Planet() {
    }

    public Planet(String planetName, int numberOfOceans, double mass, short numberOfMoons) {
        super(); //// chemam constructorul clasei parinte sau refera clasa parinte. Asta este de obicei in mostenire si trebuie definita intotdeauna prima
        this.planetName = planetName;
        this.numberOfOceans = numberOfOceans;
        this.mass = mass;
        this.numberOfMoons = numberOfMoons;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getNumberOfOceans() {
        return numberOfOceans;
    }

    public void setNumberOfOceans(int numberOfOceans) {
        this.numberOfOceans = numberOfOceans;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public short getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(short numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "planetName='" + planetName + '\'' +
                ", numberOfOceans=" + numberOfOceans +
                ", mass=" + mass +
                ", numberOfMoons=" + numberOfMoons +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return numberOfOceans == planet.numberOfOceans && Double.compare(mass, planet.mass) == 0 && numberOfMoons == planet.numberOfMoons && Objects.equals(planetName, planet.planetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planetName, numberOfOceans, mass, numberOfMoons);
    }

    public double computeMass(int powerOfTen){
//        this.getMass()*10*powerOfTen;
        return this.getMass()*Math.pow(10,powerOfTen);//...pow imultit la 10 cu powerOfTen
    }
}


