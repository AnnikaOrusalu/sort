package ee.bcs.valiit.tasks;

public class Lesson3 {
    public static void main(String[] args) {
        //System.out.println(sum(new int[]{1,2,3,4,5}));
        //System.out.println(Array.toString(sort(new int[]{5,-6,9,12,7})))
        //System.out.println(Arrays.toString(sort2(new int[]{5, -6, 9, 12, 7})));
        //String r= reverseString("Annika");
        //System.out.println(r);
        System.out.println(isPrime(17));
        System.out.println(isPrime(8));
    }

    public static int sum(int[] x) {
        // Todo liida kokku kõik numbrid massivis x

        int sum = 0; //elemendi indeksid hakkavad 0-ist
        for (int i = 1; i < x.length; i++) { //massiivi pikkus .lengh
            sum += i; //liidame summale i väärtuse
        }
        return sum;
    }

    public static int factorial(int x) {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 5*4*3*2*1 = 120
        int sum = 1;
        for (int i = 1; i < 1; i++) {
            sum = sum * 1;
        }
        return sum;
    }

    public static int[] sort(int[] a) { //Bubble sort
        // TODO sorteeri massiiv suuruse järgi.
        // TODO kasuta tsükleid, ära kasuta ühtegi olemasolevat sort funktsiooni
        //int[] a = {5,-6,9,12,7}

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) { //-1 välistab eelneva rea miis on sortitud
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
        }
        return a;
    }

    // 5, -6, 9, 12, 7
    public static int[] sort2(int[] array) { //Selection Sort
        for (int j = 0; j < array.length - 1; j++) {
            int minIndex = j;
            for (int i = j + 1; i < array.length; i++) { // j+1 algab järgmine tsükkel, mis välistab eelneva rea
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            int tmp = array[j]; //vahetab järjekorra
            array[j] = array[minIndex];
            array[minIndex] = tmp;
        }
        return array;
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        //String name;
        //name="Annika";
        char[] letters = new char[a.length()]; //teisendan jada ühikuteks
        int letterIndex = 0; //määrame alguse väärtuse

        for (int i = a.length() - 1; i >= 0; i--) { //i=jada pikkus miinus 1, i on suurem võrdne eelneva väärtusega, lahutame ühiku
            letters[letterIndex] = a.charAt(i);
            letterIndex++;
        }
        String reverse = "";
        for (int i = 0; i < a.length(); i++) {
            reverse = reverse + letters[i];
        }
        return reverse;
    }

    public static boolean isPrime(int x) {
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)

        for (int i = 2; i < x; i++) { //jada algus on 2 kuna ühega Prima jagub; i on suurem kui X; liidab ühe
            if (x % i == 0) //kui antud väärtus jaguneb i-ga ja jääk on 0
                return false;
        }
        return true;
    }
}