package ee.bcs.valiit.tasks;

public class Lesson3 {
    public static void main(String[] args) {
        //System.out.println(sum();

    }

    public static int sum(int[] x){
        // Todo liida kokku kõik numbrid massivis x

        int sum=0; //elemendi indeksid hakkavad 0-ist
        for (int i=1; i< x.length; i++) { //massiivi pikkus .lengh
            sum +=i; //liidame summale x väärtuse
        }
        return sum;
    }

    public static int factorial(int x) {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 5*4*3*2*1 = 120
        if(x==0) //
            return 1;
        else
            return(x * factorial(x-1));
    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi.
        // TODO kasuta tsükleid, ära kasuta ühtegi olemasolevat sort funktsiooni
        int arrayList;
        return new int[0];
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        return "";
    }

    public static boolean isPrime(int x){
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        return false;
    }
}
