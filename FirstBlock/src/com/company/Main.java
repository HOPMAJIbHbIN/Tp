package com.company;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Zadanie #1,2: ");
        //1) Ostatok ot delenia
        int a1,b1;
        System.out.println("Enter first number: ");
        a1= num.nextInt();
        System.out.println("Enter second number: ");
        b1= num.nextInt();
        float temp = reminder (a1,b1);
        System.out.println("Ostatok ot delenia = " + temp);

        //2) Ploshad Trig
        double plosh = TrigArea(a1,b1);
        System.out.println("Ploshad treugolnika = " + plosh);

        System.out.println("Zadanie #3: ");
        //3) Total number of legs
        System.out.println("Enter amount animals ");
        System.out.println("Enter chicken: ");
        int chicken=num.nextInt();
        System.out.println("Enter cow: ");
        int cow = num.nextInt();
        System.out.println("Enter pigs: ");
        int pigs = num.nextInt();
        int TotalLegs = animals(chicken,cow,pigs);
        System.out.println("Total lags of animals = " + TotalLegs);

        System.out.println("Zadanie #4: ");
        //4) True or false
        double prob,prize,pay;
        System.out.println("Enter argument 1 (prob): ");
        prob = num.nextDouble();
        System.out.println("Enter argument 2 (prize): ");
        prize = num.nextDouble();
        System.out.println("Enter argument 3 (pay): ");
        pay = num.nextDouble();
        boolean PPPres = ppp(prob,prize,pay);
        System.out.println("True or false: " + PPPres);

        System.out.println("Zadanie #5: ");
        //5) (+ - * /)
        int a2,b2,N;
        System.out.println("Enter argument 1: ");
        a2 =  num.nextInt();
        System.out.println("Enter argument 2: ");
        b2= num.nextInt();
        System.out.println("And we result: ");
        N = num.nextInt();
        String op=operation(a2,b2,N);
        System.out.println(op);

        System.out.println("Zadanie #6: ");
        //6) Ascii
        String simvol;
        System.out.println("Enter simvol: ");
        simvol = num.nextLine();
        int Asc2 = Asc(simvol);
        System.out.println(Asc2);

        System.out.println("Zadanie #7: ");
        //7 Fact
        int chislo;
        System.out.println("Enter chislo: ");
        chislo=num.nextInt();
        int Fact = fact(chislo);
        System.out.println(Fact);

        System.out.println("Zadanie #8: ");
        //8 Max third side
        int stor1, stor2;
        System.out.println("Enter side 1: ");
        stor1 = num.nextInt();
        System.out.println("Enter side 2: ");
        stor2 = num.nextInt();
        double thirdStor= maxStor(stor1,stor2);
        System.out.println(thirdStor);

        System.out.println("Zadanie #9: ");
        //9 три числа сумма их кубов
        int q1,q2,q3,Q;
        System.out.println("Enter number 1: ");
        q1 = num.nextInt();
        System.out.println("Enter number 2: ");
        q2 = num.nextInt();
        System.out.println("Enter number 3: ");
        q3 = num.nextInt();
        Q=qub(q1,q2,q3);
        System.out.println(Q);

        System.out.println("Zadanie #10: ");
        //10 a+a b раз делится ли на с
        int a3,b3,c3,Q1;
        System.out.println("Enter number 1: ");
        a3 = num.nextInt();
        System.out.println("Enter number 2: ");
        b3 = num.nextInt();
        System.out.println("Enter number 3: ");
        c3 = num.nextInt();
        Q1=tenth(a3,b3,c3);
        System.out.println(Q1);
    }

    //1
    public static float reminder (int a, int b){
        int result;
        result = a % b;
        return result;
    }
    //2
    public static double TrigArea(int a,int h){
        double result = a*h*0.5;
        return result;
    }
    //3
    public static int animals (int a,int b,int c){
        int result;
        int chicken=2, cow=4, pigs=4;
        result = a*chicken + b*cow + c*pigs;
        return result;
    }
    //4
    public static boolean ppp (double a,double b, double c){
        boolean result;
        if ((a*b)>c)
            result=true;
        else
            result=false;
        return result;
    }
    //5
    public static String operation (int a, int b, int N){
        String result;
        if (a+b == N)
            result = "We must plus them";
        else if (a-b == N)
            result = "We must minus them";
        else if (a*b == N)
            result = "We must Umnojit' them";
        else if (a/b == N)
            result = "We must delit' them";
        else
            result = "We cant do this";
        return result;
    }

    //6
    public static int Asc(String a){
        char b=a.charAt(0);
        int ascii=(int) b;
        return ascii;
    }
    //7
    public static int fact(int a){
        int result=0, i;
        for (i=0; i <= a; i++)
            result += i;
        return result;
    }
    //8
    public static double maxStor(int a, int b){
        double result;
        result = a+b -1;
        return result;
    }

    //9
    public static int qub (int a,int b, int c){
        int q=a*a*a+b*b*b+c*c*c;
        return q;
    }

    //10
    public static int tenth (int a,int b,int c){
        for(int i=0;i<b;i++)
            a+=a;
        if (a%c==0)
            System.out.println("true");
        else
            System.out.println("false");
        return a;
    }
}
