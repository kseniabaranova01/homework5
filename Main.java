/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
        Fraction a = new Fraction(1, 2); // создание простой дроби 1/2
        Fraction b = new Fraction(3, 4); // создание простой дроби 3/4

        Fraction sum = a.add(b); // сложение дробей
        System.out.println("Sum: " + sum.toString()); // вывод результата
    }
}


