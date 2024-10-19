import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //While loop
        /* syntax
        while(condition){
            statements;
         }
        Q) print number from 1 to n
         */
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int number = 1;
//        while (number <n){
//            System.out.println(number);
//            number++ }

        // sum of n natural number
        /*
        int sum=0;
        int n = sc.nextInt();
        int number =1;
        while (number<=n){
            sum+=number;
            number++;
        }
        System.out.println(sum);

        same question using for loop
        int sum=0;
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
         */
        // print reverse of a number
        /* for example if you have number 1243
        we can print reverse with loop
        to get last digit we will use modulo % operator
        1243 % 10 = 3 ( we will get remainder , which we can use as lastDigit )
        now to remove last digit we will use divide / operator
        1234 / 10 = 123
        by following these steps we can get reverse of the number 1243

        code implementation

        int n = sc.nextInt();
        int rev=0;
        int lastDigit;
        while(n>0){
            lastDigit=n%10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev);

        Break and Continue Statement
        Break is used to exit from iteration
        where as continue is used to skip iteration

        code implementation of continue

        for (int i = 1; i < 10; i++) {
            if (i==3){
                continue;
            }
            System.out.println(i);
       ::output will be
       1 2 4 5 6 7 8 9
       here it skipped 3rd iteration 
        }*/


    }
}
