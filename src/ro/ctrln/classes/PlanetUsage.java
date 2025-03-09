package ro.ctrln.classes;

public class PlanetUsage {
    public static void main(String[] args) {
        Planet mercury = new Planet(); /// Intelij il vede pe (short) ca fiind un int si ne obliga sa ii facem cast
        System.out.println(mercury);
        System.out.println(mercury.getPlanetName());
        System.out.println(mercury.getNumberOfOceans());
        System.out.println(mercury.getMass());
        System.out.println(mercury.getNumberOfMoons());

        mercury.setPlanetName("Mercur");
        mercury.setNumberOfOceans(5);
        mercury.setNumberOfMoons((short) 5); /// 32767 Valoarea maxima a tipului de data short
        mercury.setMass(330);

        System.out.println();
        System.out.println(mercury.getPlanetName());
        System.out.println(mercury.getNumberOfOceans());
        System.out.println(mercury.getMass());
        System.out.println(mercury.getNumberOfMoons());

        Planet venus = new Planet("Venus", 4, 488, (short) 34);

//        System.out.println("Mercury HashCode " + mercury.hashCode());
//        System.out.println("Venus HashCode " + venus.hashCode());

//        mercury.setPlanetName(venus.getPlanetName());
//        mercury.setMass(venus.getMass());
//        mercury.setNumberOfOceans(venus.getNumberOfOceans());
//        mercury.setNumberOfMoons(venus.getNumberOfMoons());
//        System.out.println("Acuma mercuri este egala "+mercury);

        System.out.println("mercury.equals(venus) " + mercury.equals(venus));


        System.out.println("Mercury mass: " + mercury.computeMass(22));
        System.out.println("Venus mass: " + venus.computeMass(22));
    }
}
