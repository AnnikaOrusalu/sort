package ee.bcs.valiit.tasks;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

import static ee.bcs.valiit.tasks.solution.Lesson2.seqLength;

public class Lesson2 {

    public static void main(String[] args) {
        //exercise1();
        //exercise2(5);
        //exercise3(3,5);
        System.out.println(exercise4(5));
        //System.out.println(exercise5(2,5));
        // TODO siia saab kirjutada koodi testimiseks
    }

    // TODO loo 10 elemendile täisarvude massiv
    // TODO loe sisse konsoolist 10 täisarvu
    // TODO trüki arvud välja vastupidises järiekorras
    public static void exercise1() {
        int[] array=new int[10];
        Scanner scanner=new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Sisesta number: ");
            array[i]=scanner.nextInt();
        }
        for(int i=9; i>=0; i--){
            System.out.print(array[i]+" ");
        }
    }

    // TODO prindi välja x esimest paaris arvu
    // Näide:
    // Sisend 5
    // Väljund 2 4 6 8 10
    public static void exercise2(int x) {
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        int equals=2;
        while(equals<=x*x){
            System.out.println(equals);
            equals +=2;
        }

    }

    // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
    // TODO näiteks x = 3 y = 3
    // TODO väljund
    // 1 2 3
    // 2 4 6
    // 3 6 9
    // TODO 1 trüki korrutustabeli esimene rida (numbrid 1 - x)
    // TODO 2 lisa + " " print funktsiooni ja kasuta print mitte println
    // TODO 3 trüki seda sama rida y korda
    // TODO 4 Kuskile võiks kirjutada System.out.println(),
    //  et saada taebli kuju
    // TODO 5 võrdle ridu. Kas on mingi seaduspärasus ridade vahel,
    // mis on ja mis võiks olla. Äkki tuleb mõni idee
    public static void exercise3(int x, int y) {
        for(int i=1;i<=x; i++){
            for(int j=0; j<=y; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }

    // TODO
    // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
    // 0, 1, 1, 2, 3, 5, 8, 13, 21
    // Tagasta fibonacci jada n element
    public static int exercise4(int n) {
        int a=0;
        int b=1;
        if(n==0){
            return 0;
        }else if(n==1) {
            return 0;
        }else{
            for(int i=1; i<n; i++){
                int tmp=a;
                a=b;
                b=b+tmp;
            }
            return b;
        }
    }

    public static String exercise5(int x, int y) {
        // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
        // TODO 1 (tee alamfunktsioon) mis leiab 3n+1 sequenci pikkuse
        // kui on paaris / 2 kui on paaritu *3+1
        // TODO 2 tee tsükkel mis leiab i -> j kõige suurema tsükkli pikkuse

        int maxLength = 0; //kõige pikem jada pikkus
        for(int i = x; i <= y; i++){
            int seqLength = seqLength(i);
            if(seqLength > maxLength){
                maxLength = seqLength;
            }
        }
        return x + " " + y + " " + maxLength;
    }
    public static int sequenci(int n){
    int count=1; //jada pikkus on 1
        while(n>1){ //n on suurem kui 1
            count++; // liidab juurde ühe
            if(n%2 == 0){ // kui n on paarisarv
                n = n / 2; // kui n on paaris siis n/2
            } else { // kui muu ehk paaritu siis n*3+1
                n = n*3 + 1;
            }
        }
        return count; //tagastab
        }
    }
