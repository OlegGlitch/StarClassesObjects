package ro.ctrln.classes;

import java.math.BigDecimal;

public class StarUsage  {
    public static void main(String[] args) {
        /*////////////Definirea unui obiect nou////////////
        //Star// este tipul de date //star// denumirea si //new Star();// este constructorul implicit fara parametri
         */
        Star star = new Star();
        SmallPlanet smallPlanet = new SmallPlanet("abd");
        System.out.println(smallPlanet);

        star.setStarDescription("Aceasta este steaua Kepler ");
        star.setDiameter(1000); /// Parametri prin Valori -- sunt la tipurile de date primitive
        star.setSatellites(15);
        star.setMass(new BigDecimal(2500)); /// Parametri prin obiecte(sau prin referinta) -- pentru tipuri de date clase
        star.setSmallPlanet(new SmallPlanet("Star planet name ! "));

        System.out.println("Obiectul star: " + star);

        /// ////////////////Putem crea obiecte si cu ajutorul Constructorului///////////////
        Star mars = new Star("Aceasta este planeta mars",1000,20,new BigDecimal(300));
        mars.setSmallPlanet(new SmallPlanet("Mars planet"));

        System.out.println("Obiectul mars " + mars);

        SmallPlanet starPlanet = new SmallPlanet(); /// new SmallPlanet(); este defapt constructorul implicit din SmallPlanet
        starPlanet.setPlanetName(" Numele planetei din jurul stelei! ");

        System.out.println();
        SmallPlanet marsPlanet = new SmallPlanet();
        marsPlanet.setPlanetName(" Numele planetei din jurul marte! ");

        star.setSmallPlanet(starPlanet);
        mars.setSmallPlanet(marsPlanet);

        System.out.println(starPlanet.computeSmallPlanetLocation(star,20));
        System.out.println(marsPlanet.computeSmallPlanetLocation(mars, 10));
    }
}
