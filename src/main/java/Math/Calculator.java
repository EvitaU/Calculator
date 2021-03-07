package Math;

public class Calculator {

    public void myCalculator() {

        int num1 = 306;
        int num2 = 43;
        int num3 = 570;
        int num4 = 14;
        int num5 = 95;

        int result = num1 + num2;
        result = num1 - num2;
        result = num4 * num2;
        result = num1 / num2;
        result = num3 % num5;


        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num4 * num2);
        System.out.println(num1 / num2);
        System.out.println(num3 % num5);
        System.out.println(Math.sqrt(num3));
        System.out.println(Math.sqrt(num5));
        System.out.println(Math.sqrt(num2));
        if ((num4 * num5) == 15f) ;
        System.out.println("It was 2016. five years ago but");


    }

    public void thisYear(int fiveYearsAgo) {
        fiveYearsAgo += 5;

        System.out.println("current year is " + fiveYearsAgo + ".");


    }
}