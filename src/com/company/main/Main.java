package com.company.main;

import com.company.Mass;
import com.company.robot.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine());

        int n = Integer.parseInt(reader.readLine());

        for (; m > 0; m--) {

            for (int i = n; i > 0; i--) {

                System.out.print(8);

            }

            System.out.println();

        }
    }*/

/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());

        int b = Integer.parseInt(reader.readLine());


        while (a > 0) { a--;
            int i = b;
            while (i > 0) { i--;
                System.out.print("P");
            }
            System.out.println();

        }*/


/*            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            int a = Integer.parseInt(reader.readLine());
            int b = 0;

            while (a!=-1){

                b = a+b;
                System.out.println(b);
                a = Integer.parseInt(reader.readLine());


            }
        System.out.println(b-1);*/

/*        Robot alex = new Robot("Alex", 30,40);
        Robot alan = new Robot("Alan", 25,71);
        Robot ion = new Robot("Ion", 28,83);
        Robot kop = new Robot("Kop", 22,45);
        Robot term = new Robot("Term", 33,46);

        while (alan.getPower()< alex.getPower()){
            System.out.println();
        }
        int power1 = alan.getPower() - alex.getPower();
        System.out.println(power1);*/


/*        BufferedReader fight = new BufferedReader(new InputStreamReader(System.in));
        String name1 = fight.readLine();
        String name2 = fight.readLine();
        while (name1.equals("exit")){*/

 /*       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[10];


        for (int i=0; i < 8; i++){
            mass[i]= Integer.parseInt(reader.readLine());

        }for (int i = 9; i>= 0; i--){

            System.out.println(mass[i]);
        }*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] stroky = new String[10];
        for (int i = 0; i < stroky.length; i++){
            stroky[i] = String.format (reader.readLine());

        }
        String[] stroky1 = new String[5];
        String[] stroky2 = new String[5];

        for (int i = 0; i< stroky1.length; i++) {
            stroky1[i] = stroky[i];
            System.out.print(stroky1[i]);
        }
        for (int i = 0; i< stroky2.length; i++){
            stroky2[i] = stroky[i + 5];
            System.out.print(stroky2[i]);
        }









        }











    }