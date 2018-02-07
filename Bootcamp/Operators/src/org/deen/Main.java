package org.deen;

public class Main {

    public static void main(String[] args) {

        /* Operators */
        // Assignment -> =
        // Arithmetic -> +, -, *, /, %
        // Unary      -> +, -, ++, --, !
        // Equality   -> ==, !=, >, <, >=, <=
        // Conditional-> &&, ||, ?:
        // Type       -> instanceof
        // Bitwise    -> ~, <<, >>, >>>, &, ^, |

        // More at docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

        // Examples

        /* Assignment */
        int a = 3;
        System.out.println("The value of assigned int is: " + a);

        // Remember assignment returns value
        System.out.println("Assignments return value! a: " + (a = 10));

        // Checkout for assignment in boolean
        boolean itsTrue = false;

        // This actually assigns itsTrue to false and if evaluate false
        if (itsTrue = true) {
            System.out.println("You lying!!");
        }

        // Changes value permanently
        System.out.println("Current Value of itsTrue: " + itsTrue);

        // When I might have wanted to do
        if (itsTrue == true) {
            System.out.println("You telling truth?");
        }

        // Or just
        System.out.println("Current Value of itsTrue: " + itsTrue);
        if (itsTrue) {
            System.out.println("Master of lying!!, A truth is lost...");
        }

        // However it doesn't work with other data types
        int answer = 42;
        if (answer == 42) { // answer = 42 doesn't work
            System.out.println("You get to go to the diner!");
        }

        /* Arithmetic */
        // Operator precedence follows BODMMAS
        int exp = 45 * 2 + 10 - 30 % 2;
        System.out.println("Expression evaluates to: " + exp);

        // Also combination with assignment operator is possible
        exp += 1;
        System.out.println("New evaluation is: " + exp);

        /* Unary */
        // Applied to single operand
        int posNum = 1234;
        int negNum = -posNum;
        System.out.println("Positive number is: " + posNum + ", Negative number is " + negNum);

        // Postfix Increment/Decrement
        posNum++;
        negNum--;
        System.out.println("Positve number = " + posNum);
        System.out.println("Negative number = " + negNum);

        System.out.println("posNum == posNum++ is " + (posNum == posNum++));

        // Prefix
        System.out.println("posNum == ++posNum is " + (posNum == ++posNum));

        boolean check = true;
        System.out.println("Check = " + check + " !Check = " + !check);


        /* instanceof */
        // test if an object is an instance of a class,
        // an instance of a subclass,
        // or an instance of a class that implements a particular interface.

        Parent parent = new Parent();
        Child child = new Child();

        System.out.println("parent instance of Parent = " + (parent instanceof Parent));
        System.out.println("child instance of Child = " + (child instanceof Child));
        System.out.println("child instance of Parent = " + (child instanceof Parent));
        System.out.println("parent instance of Child = " + (parent instanceof  Child));
        System.out.println("child instance of interface Senses = " + (child instanceof Senses) );
        System.out.println("new string instance of Object = " + (new String() instanceof Object));


        /* Bitwise */
        System.out.printf("0x001 & 0xFFF = 0x%03x%n", 0x001 & 0xFFF);
        System.out.printf("0x101 | 0xFF0 = 0x%03x%n", 0x101 | 0xFFF);
        System.out.println("4 >> 1 = " + (4 >> 1)); // 100 >> 1 = 010
        System.out.println("1 << 2 = " + (1 << 2)); // 001 << 010 = 100
        System.out.println("8 >>> 1 = " + (8 >>> 1)); // 1000 >>> 001 = 0100
        System.out.println("-8 >>> 1 = " + (-8 >> 1)); // 1111...1000 >> 1 = 1111...0100
        System.out.println("-8 >>> 1 = " + (-8 >>> 1)); // 1111...1000 >>> 1 = 0111...1100


        // Precedence

        /*
        | Operator             | Precedence                            |
        | postfix              | expr++, expr--                        |
        | unary                | ++expr --expr +expr -expr ~ !         |
        | multiplicative       | * / %                                 |
        | additive             | + -                                   |
        | shift                | >>, <<, >>>                           |
        | relational           | < > <= >= instanceof                  |
        | equality             | == !=                                 |
        | bitwise AND          | &                                     |
        | bitwise exclusive OR | ^                                     |
        | bitwise inclusive OR | |                                     |
        | logical AND          | &&                                    |
        | logical OR           |                                       |
        | ternary              | ?:                                    |
        | assignment           | = += -= *= /= %= &= ^= |= <<= >>= >>>=|
        */

    }
}
class Parent {
    public Parent() {
    }

}

class Child extends Parent implements Senses {
    public Child() {
    }
}

interface Senses {

}
