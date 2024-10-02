package Loops.ForLoop;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 1;
        a[1] =3;
        a[2] =6;
        a[3]=7;
        a[4]=6;

        int sum = 1;

        for(int i = 0; i<5; i++) {

            System.out.println(a[i]);
            sum = sum * a[i];
        }

        System.out.println(sum);



//        sum = sum + a[0];
//        sum = sum + a[1];
//        sum = sum + a[2];
//        sum = sum + a[3];
//        sum = sum + a[4];




        System.out.println(sum);

    }

}
