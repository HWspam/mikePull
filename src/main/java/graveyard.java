/**
 * Created by erikjakubowski on 10/21/17.
 */
public class graveyard {

    private static void grave(){

         /*
        example
         */
//        int a = 1;
//        int b = 2;
//        int c;
//        int d;
//        c = ++b;
//        d = a++;
//        c++;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);












            /*
        arithmatic oper
         */
//            int a = 1+1;
//            int b = a *3;
//            int c = b / 4;
//            int d = c - a;
//            int e = -d;
//
//            //same
//            a = a +4;
//            a += 4;
//
//            a = 42;
//            b = ++a;
//            System.out.println(b);
//            //43
//            a = 42;
//            b = a++;
//            System.out.println(b);
//            //42





        /*
        operand  and in char cast
         */
        int a = 1+1;
        int b = a *1;
        int c = b / 2;
        int d = c - 102;
        int e = -d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(d);
        System.out.println(e);
        char p = (char) e;
        String leeter = p +"";
        System.out.println(leeter);




        /*
        twoD multidemontional array of ints
        example of y vertical sizing
         */
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int i, j, k = 0;


        for (i=0;i<4;i++)
            for (j=0;j<i+1;j++){
                twoD[i][j] = k;
                k++; }

        for (i=0;i<4;i++){
            for (j=0;j<i+1;j++)

                System.out.print(twoD[i][j] + " ");
            System.out.println();

        }





















    }//final grave() closing bracket


}
