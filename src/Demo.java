/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/09/2019
 */

public class Demo {


    public static int breakExample(int optil) {

        int resultat = 0;
        for (int i = 0; i < optil; i++) {
            if (i == optil - 5) {
                break;
            }
            resultat++;
        }
        return resultat;
    }

    public static void loopInLoop(int optil) {

        for (int i = 1; i <= optil; i++) {
            for (int j = 1; j <= optil; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();

        }
    }


}
