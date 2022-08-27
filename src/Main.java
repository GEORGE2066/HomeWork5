public class Main {
    public static void main(String[] args) {
        /*ПЕРВЫЙ ТАСК*/

        int[] arrey1 = {1, 2, 3, 4, 5, 6};
        float[] arrey2 = {1.57f, 7.654f, 9.986f};
        char[] arrey3 = new char[4];
        arrey3[0] = 1069;
        arrey3[1] = 1016;
        arrey3[2] = 937;
        arrey3[3] = 916;



        /*ВТОРО2Й ТАСК*/

        int i = 0;

        while (i <= (arrey1.length - 1)) {
            if (i == arrey1.length - 1) {
                System.out.println(arrey1[i]);
                break;
            } else {
                System.out.print(arrey1[i] + ", ");
                i++;
            }
        }

        i = 0;

        while (i <= (arrey2.length - 1)) {
            if (i == arrey2.length - 1) {
                System.out.println(arrey2[i]);
                break;
            } else {
                System.out.print(arrey2[i] + ", ");
                i++;
            }
        }

        i = 0;

        while (i <= (arrey3.length - 1)) {
            if (i == arrey3.length - 1) {
                System.out.println(arrey3[i]);
                break;
            } else {
                System.out.print(arrey3[i] + ", ");
                i++;
            }
        }

        i = 0;
        System.out.println();



        /*ТРЕТИЙ ТАСК*/

        int n = arrey1.length - 1;

        while (n >= 0) {
            if (n == 0) {
                System.out.println(arrey1[n]);
                break;
            } else {
                System.out.print(arrey1[n] + ", ");
                n--;
            }
        }

        n = arrey2.length - 1;

        while (n >= 0) {
            if (n == 0) {
                System.out.println(arrey2[n]);
                break;
            } else {
                System.out.print(arrey2[n] + ", ");
                n--;
            }
        }

        n = arrey3.length - 1;

        while (n >= 0) {
            if (n == 0) {
                System.out.println(arrey3[n]);
                break;
            } else {
                System.out.print(arrey3[n] + ", ");
                n--;
            }
        }

        System.out.println();



        /* ЧЕТВЁР4ТЫЙ ТАСК*/

        while (i <= (arrey1.length - 1)) {
            if (arrey1[i] % 2 == 0) {
                System.out.print(arrey1[i]);
            } else {
                arrey1[i] = arrey1[i] + 1;
                System.out.print(arrey1[i]);
            }
            i++;
        }
    }
}