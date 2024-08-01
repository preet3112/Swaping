import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Using the third variable
        /*System.out.println("Enter value for a:");
        String a =sc.next();
        System.out.println("Enter value for a:");
        String b =sc.next();
        String c;
        c=a;
        a=b;
        b=c;
        System.out.println("Swap Result a: "+a+" b: "+b);*/


        //If it is integer and we can do addtion and substraction
        /*System.out.println("Enter value for a integer:");
        int p =sc.nextInt();
        System.out.println("Enter value for b integer:");
        int q =sc.nextInt();
        p = p + q;
        q = p - q;
        p = p - q;
        System.out.println("Swap Result a: "+p+" b: "+q);*/


        //Use multiplication and division
        System.out.println("Enter value for a integer:");
        int p =sc.nextInt();
        System.out.println("Enter value for b integer:");
        int q =sc.nextInt();
        p=p*q;
        q=p/q;
        p=p/q;
        System.out.println("Swap Result a: "+p+" b: "+q);
        sc.close();
    }
}