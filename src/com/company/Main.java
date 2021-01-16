package com.company;

public class Main {

    public static void main(String[] args) {
        //int to String
        // int i = 35;
        // String str = Integer.toString(i);
        // System.out.println(str);
        //-----------------------
        //  double to String
        //double  i = 32.4e10;
        // String str = Double.toString(i);
        // System.out.println(str);
        //-----------------------
        // long to String
        //long  i = 3422222;
        //String str = Long.toString(i);
        //System.out.println(str);
        //-----------------------
        //float to String
        //float  i = 3.46f;
        // String str = Float.toString(i);
        //System.out.println(str);

        //  char to String
        char ch = 'S';

        // c использованием класса Character
        String charToString = Character.toString(ch);
        System.out.println(charToString);

        // с использованием операции добавления класса String
        String str = "" + ch;
        System.out.println(str);

        //с использованием массива
        String fromChar = new String(new char[] { ch });
        System.out.println(fromChar);

        // с использованием метода valueOf класса String
        String valueOfchar = String.valueOf(ch);
        System.out.println(valueOfchar);


        // char to int
        // char ch = '9';

        // c использованием метода getNumericValue
        // класса Character
        //  int i1 = Character.getNumericValue(ch);
        //System.out.println(i1);

        // c использованием метода digit класса Character
        //int i2 = Character.digit(ch,10);
        //  System.out.println(i2);
        //--------------------
        //int to long
        //    int i = 2015;
        //    long l = (long) (i);
        //    System.out.println(l);
        //
        //int to float
        //    int i = 2015;
        //    float f = (float) (i);
        //    System.out.println(f);
        //
        //long to int
        //    long l = 214748364;
        //    int i = (int) l;
        //    System.out.println(i);
        //
        //double to int
        //    double d = 3.14;
        //    int i = (int) d;
        //    System.out.println(i);


    }
}