package C242;


import java.util.*;

public class Dog_prog{

    public static void main(String []args){



        Scanner sc = new Scanner(System.in);

        System.out.println("What is your dog's name?");

// Entering name of dog

        String name = sc.nextLine();



        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");



        System.out.println("\n\nSir " + name + " is : \n\n");



//Generating random numbers

        Random rand = new Random();

        int sum = 0;

        int a = 0;

        int b = 0;

        int c = 0;

        int d = 0;

        int e = 0;

        while(sum != 100)

        {

            a = rand.nextInt(100);
            //System.out.println(a); not use
            b = rand.nextInt(100-a);

            c = rand.nextInt(100-b);

            d = rand.nextInt(100-c);

            e = rand.nextInt(100-d);

            sum = a + b+ c + d + e;

        }



        System.out.println(a + "% St. Bernard");

        System.out.println(b + "% Chihuahua");

        System.out.println(c + "% Dramatic RedNosed Asian Pug");

        System.out.println(d + "% Common Cur");

        System.out.println(e + "% King Doberman");



        System.out.println("\n\nWow, that's QUITE the dog!");



    }

}