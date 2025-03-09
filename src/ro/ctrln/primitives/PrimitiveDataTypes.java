package ro.ctrln.primitives;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        byte b1 = -128;// valoarea negativa maxima
        byte b2 = 127;// valoarea pozitiva maxima
        byte b3 = 30;// orice valoare intre aceste doua capete este perfect valida
        byte b4 = (byte) 130; //in acest caz daca depasim si facem "cast" atunci pierdem din valooare

        System.out.println("Variabila B4 este: " + b4);


        short s1 = -32768; // valoarea negativa maxima
        short s2 = 32767; // valoarea pozitiva maxima
        short s3 = 10468; // orice valoare intre aceste doua capete este perfect valida
        short s4 = (short) 40691; // acelasi lucru pierdem din valoare (SEMNIFICATIV)

        System.out.println("Varisbila s4 este: " + s4);

        int i1 = 456777876;
        int i2 = -456777876;
       // int i3 = 12456777876; // int is to large
        long i3 = 12456777876L;
        long l1 = 43548365;
        long l2 = -43548365;

        float f1 = 567890;
        float f2 = 23.2354F;

        double d1 = 25.67;
        double d2 = 12345678123D;

        boolean isTrue = true;
        boolean isFalse = false;

        char c1 = 'A';
    }

}
