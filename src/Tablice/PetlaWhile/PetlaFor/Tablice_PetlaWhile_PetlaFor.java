
package Tablice.PetlaWhile.PetlaFor;
/**
 * 
 * @author pawelstradomski
 */

public class Tablice_PetlaWhile_PetlaFor {

    
    public static void main(String[] args) {
        
        // 1 sposob
        
        String[] kursJava = {"Pawel", "Piotr", "Jacek"};
        System.out.println(kursJava[0]);
        System.out.println(kursJava[1]);
        System.out.println(kursJava[2]);
        
        // 2 sposob - Taktowanie: wypisze slowo tak10 do takt1
        
        int a=10;
        while (a>0)
        {
            System.out.println("takt" + a);
            a--;
        }
        
        // Taktowanie: wypisze takt10 do takt1. Jedno obok drugiego bo print (zamiast println)
        
           int xxx = 10;
           while (xxx>0)
           {
               System.out.print("takt" + "  " + xxx);
               xxx--;
           }
        
        // 3 sposob - wypisze nam od 0 do 6
         
        int b=0;
        while (b<7)
        {
            System.out.println(b);
            b++;
        }
        
        // 4 sposob
        String[] daysOfWeek = {"poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota",
            "niedziela"}; 
        
        int c=0;
        while (c<7) 
        {
            System.out.println(daysOfWeek[c]);
            c++;
        }
        
        //5 sposob - uniewersalny bo mozna dopisywac do tablicy stringi itp
                     
        String[] monthOfYear = {"styczen", "luty", "marzec", "kwiecien", "maj"};
        int d=0;
        while (d<monthOfYear.length) 
        {
            System.out.println(monthOfYear[d]);
            d++;
        }
        
        // 6 sposob, chcemy z tablicy wykluczyc jakis np miesiac np kwiecien
        
        int e = 0;
        while (e <monthOfYear.length) 
        {
            if (e !=3)    
            System.out.println(monthOfYear[e]);
            e++;
        }
        
        // 7 sposob
        int f=0;
        while (f<monthOfYear.length) 
        {
            System.out.println(monthOfYear[f++]);
        }
        
        // 8 sposob: DO WHILE
        
        int g=0;
        do 
        {
            System.out.println(monthOfYear[g++]);
        }
        while (g<monthOfYear.length);
        
        /* 9 sposob - petla for
        for (inicjalizacja zmiennych; warunek petli; iteracja)
        {cialo petli - instrukcje do wykonania
        }
        Kolejnosc:
        1. inicjalizacja zmiennych (jeden raz)
        2. sprawdzenie warunku petli (jak ok przechodzi do ciala petli i wykonuje blok - instrukcje)
        3. przejscie do bloku instrukcji i wykonanie ciala petli
        3. iteracja - modyfikacja liczniaka - wykonywana po ciele funkcji np a++
        */
        
        String[] monthOfYear2 = {"styczen2", "luty2", "marzec2", "kwiecien2", "maj2"};
        for (int h = 0; h < monthOfYear2.length; h++)
        {
            System.out.println(monthOfYear2[h]);
        }
        
        String[] Cities = {"sosnowiec", "katowice", "myslowice"};
        for (int i=0; i<Cities.length; i++)
        {
            System.out.println(Cities[i]);
        }
        
        // Enhanced for - ulepszona petla for
        
        String[] mojePlyty = {"manowar", "udo", "zetYago"};
        for (String MyValue: mojePlyty)
        {
            System.out.println(MyValue);
        }
        
        for (String miasta: Cities)
            System.out.println(miasta);
        
        // Petla w petli, np moze mnozyc tablice
        
        for (int j = 1; j <= 10; j++)
        { 
        {
            for (int k = 1; k <= 10; k++)
            System.out.print(j*k + " ");//print bez ln, zeby bylo jedno obok drugiego
            System.out.println(); // dodatkowa pusta linia, zeby oddzielic kolejne petle mnozenia
        }
        } 

        //Dzialania na liczbach w tablicy np suma, mnozenie itp
        
        int[] TablicaLiczb = {2, 3, 4, 5, 6, 7};
        int sumaTablicy = 0;
        {
        for (int p = 0; p < TablicaLiczb.length; p++) 
        sumaTablicy = sumaTablicy + TablicaLiczb[p];
        }
        System.out.println(sumaTablicy);
        
        //Dzialania na liczbach w tablicy - ulepszona for - enhanced for :)
        
        int[] Tablica = {9, 10, 11};
        int suma = 0;
        for (int abcd:Tablica)
            suma += abcd; // inaczej suma = suma + abcd
        System.out.println(suma);
        
        
        // POWTORKA - PETLA FOR
        // wypisanie 3x slowa "witaj!"
        
        for (int i = 0; i < 3; i++)
        {
            System.out.println("witaj!");
        }
        
        // wypisze tylko liczby parzyste od 22 do 29
        
        for (int i = 22; i <= 29; i++)
        {
            if(i % 2 == 0)
                System.out.println("i" + " " + i);
        }
        
        // Mnozenie liczb w tablicy *2
        int[][] numbers = {{2, 4}, {5, 10}};
        for (int i = 0; i < numbers.length; i++) 
        {
            for (int j = 0; j < numbers.length; j++) 
            {
                numbers[i][j] = numbers[i][j] * 2;
                System.out.println(numbers[i][j]);
            }
        }
        
        
        
        
    }
    
}
