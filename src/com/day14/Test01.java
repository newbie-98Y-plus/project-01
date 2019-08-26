package com.day14;

public class Test01
    {
        public static void main ( String[] args )
        {
            int[] myArray = {1, 2, 3, 4, 5};
            ChangeIt c = new ChangeIt();
            c.doIt( myArray );
            System.out.println(myArray[0]);
            for(int j=0; j<myArray.length; j++)
                System.out.print( myArray[j] + " " );
        }
    }
    class ChangeIt
    {
        static void doIt( int[] z )
        {
            z = null ;
        }
    }

