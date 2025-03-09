package ro.ctrln.vectors;

import java.util.Arrays;

public class Vectors {
    public static void main(String[] args) {

        char[] source = {'a','b','c','d','e','f','g','h'};
        char[] sourceOne = {'c','a','b','d','e','f'};

        char[] destination = new char[10]; //declaram ca acest vector destination va tine 10 caractere fix

//        destination = source;
        System.out.println("vectorul cu indexul 1 este egal cu " + "'" + source[1] + "'");
        //copiem din vectrul sursa'source' in vectorul destinatie 'destination' la pozitia  '0' 3 indexuri
        // indexul 'c','d','e'
        System.arraycopy(source, 2, destination, 0,3);
        System.out.println(destination);
        System.out.println("vector destination este egal " + Arrays.toString(destination));

//      din vectorul sursa care este 'source' copiem de la indexul '0' pina la indexul 4
        char[] copyOfRange = Arrays.copyOfRange(source,0,4);
        System.out.println(copyOfRange);
        System.out.println("copyOfRange este egal cu :" + Arrays.toString(copyOfRange));

        //      din vectorul sursa care este 'source' copiem de la indexul '3' pina la indexul 6 "d,e,f"
        char[] anotherCopyOfRange = Arrays.copyOfRange(source,3,6);
        System.out.println("anotherCopyOfRange este egal cu :" + Arrays.toString(anotherCopyOfRange));

        copyOfRange = Arrays.copyOfRange(source, 0, 10);
        System.out.println("copyOfRange de la '0' la '10': " + Arrays.toString(copyOfRange));

//        copyOfRange = Arrays.copyOfRange(source, 15, 20); //Arunca exceptie ArrayIndexOutOfBoundsException
//        System.out.println("copyOfRange de la '15' la '20': " + Arrays.toString(copyOfRange));

        Arrays.fill(destination, 'c'); // vectorul "destination" va fi umplut cu caracterul "c".
        System.out.println("Vectorul 'destination' va fi umplut cu caracterul 'c' : " + Arrays.toString(destination));

        // .binarySearch ne arata pe ce index de afla caracterul ...
        // cu conditia ca array-ul este sortat (exemplu: in ordinea alfabetica)
        System.out.println("caracterul 'c' in source are indexul: " + Arrays.binarySearch(source, 'c'));

        System.out.println("caracterul 'c' in sourceOne are indexul: " + Arrays.binarySearch(sourceOne, 'e'));

        // exemplu din C;
        int b;
        int a = 1;
        int numb[] = {1,2,3,4};
        b = numb[1+a]; // indexul se mai poate transmite si asa
        System.out.println(b);

        char d; // pentru a afla ce se afla in idexul 1 spre exemplu
        d = source[1];
        System.out.println(" Valoarea indexului '1' este: " + d);

        source[1] = 'n'; //pentru a schimba un caracter din array
        System.out.println("Am shimbat valoare indexului '1' in: " + Arrays.toString(source));

        //copiem un element din array in alt array
        source[1] = sourceOne[2];
        System.out.println(source);

        //Copiem elementele dintr-un array-ul (sourceOne) in alt array-ul (source)
        for (int i =0; i<6; i++){
            int j =0;
            source[i] = sourceOne[i];
        }
        System.out.println(source);

        // Sortarea unui array metoda bulelor (bubble)
        int[] arr = {6,5,4,3,32,1};
        SortArray.sortArray(arr,6);
        System.out.println(Arrays.toString(arr));

        // asa putem umple tot array ul cu 0 sau oricare alt numar
        for (int i = 0; i<3; i++){
            arr[i] = 0 ;
        }
        System.out.println(Arrays.toString(arr));

        //Daca vrei in rinduri si coloane, aici avem 3 rinduri cite doua elemente
        int[][] arr1 = {{1,2},
                        {2,3},
                        {4,5}};
         a = arr1[1][1];    //scoatem elementul 2 din rindul 2
        System.out.println(a);

        //Aici avem 3 tabele cu 3 rinduri cu doua elemente
        int[][][] arr2 = {{{1,2},//tabel cu doua rinduri cu cite 2 elemente
                            {1,2}}, //tabel cu doua rinduri cu cite 2 elemente
                            {{2,3},{4,5}},
                            {{6,7},{8,9}}};
        a = arr2[1][1][1]; //scoatem din tabelul 1 din primul rind primul element
        System.out.println(a);
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

    }
}
