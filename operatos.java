public class operatos {
    public static void main(String[] args) {
        /* OPERATORS in Java
        -Symbols that tells compiler to perform some operation
        - example +-/x
        - There are Different types of operators in java
        - Example (arithmetic, relational ,logical ,bitwise etc)
         */

        /* Arithmetic Operators
        Binary         Unary
           +            ++
           -            --
           /
           x
           % -> Gives remainder
         */
        //Example
        /*
        int a =10;
        int b= 20;
        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a/b = " + (a/b));
        System.out.println("a*b = " + (a*b));
        */
        /*
        Unary Operators
        -If you want to increase/decrease value by 1
        -for example a=a+1 or a=a-1
        -you can use ++ or -- operators
        -these are also known as increment/decrement operators
        -Further they are of two types pre-increment/decrement and post
        - ++a / a++
        - pre-increment / post-increment
        - in pre increment first value is changed and then used where as
        - in post increment first it is used and then change
        - here is an example of pre-increment

        int a=10;
        int b=++a;
        System.out.println(a); //output 11
        System.out.println(b); //output 11

        first value of a is changed to 11 then it is assigned to b hence b is also 11

        here is example of post increment

        int a=10;
        int b=a++;
        System.out.println(a); //output 11
        System.out.println(b); //output 10

        at first value of a is 10 then it is assigned to b
        after assignment it is incremented by 1 a++ hence value of a become 11
        and updated in memory
         */

        //Relational Operators
        /* There is not much i know it
        - here are few example of relational ope
        - == , != , <= , >= , < , >
         */

        //Logical Operators
        /* There are three types of logical operators
        - && Logical and ,same as logical gate And
        - || Logical or ,same as logical or
        - ! Logical not
         */

        //Assignment Operators
        /* used to assign value to variables
        Different type of assignment operators are
        - += ex a+=10 is same as a=a+10
        - -= ex a-=10 is same as a=a-10
        - and similarly can be said for * and /
         */

    }
}
