package ro.ctrln.classes;

import java.util.Objects;

public class SmallPlanet {
    private String planetName;

    public SmallPlanet() {
    }

    public SmallPlanet(String planetName) {
        this.planetName = planetName;
    }


    public String getPlanetName() {
        return this.planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    /// ///////////////////////////////////////
    public String computeSmallPlanetLocation(Star star, int location) {
        return star.getStarDescription() + this.planetName + location;                                                                         //ea traieste doar in interiorul metodei computeSmallPlanetLocation
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SmallPlanet that = (SmallPlanet) o;
        return Objects.equals(planetName, that.planetName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(planetName);
    }

    @Override
    public String toString() {
        return "SmallPlanet{" +
                "planetName='" + planetName + '\'' +
                '}';
    }
}
