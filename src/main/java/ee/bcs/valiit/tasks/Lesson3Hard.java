package ee.bcs.valiit.tasks;

import java.util.Random;
import java.util.Scanner;


public class Lesson3Hard {
    public static void main(String[] args) {

    }

    public static int evenFibonacci(int x) {
        // TODO liida kokku kõik paaris fibonacci arvud kuni numbrini x
        //Fibonacci Numbers are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,...
        //fib number=Sum of(n-1)th and (n-2)th numbers
        //loon fib jada,
        int a = 0;
        int b = 1;
        if (x == 0) {
            return 0;
        }
        return 0;
    }

    public static void randomGame() {
        // TODO kirjuta mäng mis võtab suvalise numbri 0-100, mille kasutaja peab ära arvama
        // iga kord pärast kasutaja sisestatud täis arvu peab programm ütlema kas number oli suurem või väiksem
        // ja kasutaja peab saama uuesti arvata
        // numbri ära aramise korral peab programm välja trükkima mitu katset läks numbri ära arvamiseks
    }

    public static String morseCode(String text) {
        // TODO kirjuta programm, mis tagastab sisestatud teksti morse koodis (https://en.wikipedia.org/wiki/Morse_code)
        // Kasuta sümboleid . ja -
        return "";
    }
}
