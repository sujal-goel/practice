import java.util.*;
public class practiceQues {
    // Q1 Enter 3 numbers from the user & make a function to print their average.
    // public static float avg(int a,int b,int c){
    //     float average;
    //     average = (a+b+c)/3;
    //     return average;
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter first number : ");
    //     int a = sc.nextInt();
    //     System.out.println("enter second number : ");
    //     int b = sc.nextInt();
    //     System.out.println("enter Third number : ");
    //     int c = sc.nextInt();
    //     System.out.println(avg(a,b,c));
    // }
    

    // Q2 Write a function to print the sum of all odd numbers from 1 to n.
        // public static int sum_of_odd(int n){
        //     int sum=0;
        //     int i =1;
        //     while(i<=n){
        //         sum=sum+i;
        //         i=i+2;
        //     }
        //     return sum;
        // }
        // public static void main(String[] args){
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //     System.out.println("the sum of odd numbers upto "+n+" : "+ sum_of_odd(n));
        // }\

// Q3 Write a function which takes in 2 numbers and returns the greater of those two.
// public static int great(int a,int b){
//     int max;
//     max = (a>b) ? a:b ;
//     return max;
// }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the first number : ");
//     int a = sc.nextInt();
//     System.out.println("Enter the second number : ");
//     int b = sc.nextInt();
//     System.out.println(great(a, b));
// }

// Q4 Write a function that takes in the radius as input and returns the circumference of a circle.
// public static double cir(int r){
//     double pie = 3.14;
//     return 2*pie*r;
// }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("enter the value of radius of a circle : ");
//     int r  = sc.nextInt();
//     System.out.println("Circumference of the circle is : "+cir(r));
// }
// }

// Q5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// public static  String eligible(int age){
// if (age>18){
//     return "congratulations! eligible to vote";
// }
// else{
//     return "not eligible to vote!";
// }
// }

// public static void main(String[] args){
// Scanner sc =  new Scanner(System.in);
// System.out.print("enter your age : ");
// int age = sc.nextInt();
// String r = eligible(age);
// System.out.println(r);
// }

//  Q6 Write an infinite loop using do while condition.
// public static void main(String[] args){
// int a = 0;
// do{
// System.out.println("hello");
// }while(a==0);
// }

//Q7 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
//public static void main(String[] args){
//    int a=1,p=0,n=0, z=0;
//    Scanner sc = new Scanner(System.in);
//    while(a==1){
//        System.out.print("enter any number : ");
//        int num = sc.nextInt();
//        if (num<0){
//            n++;
//        }
//        else if(num>0){
//            p++;
//        }
//        else{
//            z++;
//        }
//        System.out.print("Do you want to enter more num Y(1) or N(0)........ : ");
//        a = sc.nextInt();
//    }
//    System.out.println("number of positive integers: "+p+"\nnumber of negative integers: "+n+"\nnumber of zero integers: "+z);
//    }

//Q8 Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
//public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    int x,n;
//    System.out.print("enter the base integer : ");
//    x = sc.nextInt();
//    System.out.print("enter the power ineger : ");
//    n = sc.nextInt();
//    System.out.println(x+"^"+n+" = "+power(x,n));
//}
//public static int power(int x,int n){
//    int p =1;
//    for(int i=0;i<n;i++){
//      p = p * x;
//    }
//    return p;
//}

//Q9 Write a function that calculates the Greatest Common Divisor of 2 numbers.
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a,b;
//        System.out.print("enter the number a : ");
//        a=sc.nextInt();
//        System.out.print("enter the number b : ");
//        b=sc.nextInt();
//        System.out.println("gcd of "+a+" and "+b+" = "+gcd(a,b));
//
//    }
//    public  static int gcd(int a,int b) {
//        int small = (a > b) ? b : a;
//        int big = (a>b)? a:b;
//        int max = 0;
//        while(b != 0)
//        {
//            if(a > b)
//            {
//                a = a - b;
//            }
//            else
//            {
//                b = b - a;
//            }
//        }
//        return a;
//        if (big%small==0){
//            max = small;
//        }
//        else{
//        for (int i=1; i <= small/2; i++) {
//            if(a%i==0 && b%i==0){
//                if (i>=max)
//                    max = i;
//            }
//
//        }
//        }
//        \return max;
//    }

// Q10 Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 .....
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), num , ln = 0, rn = 0;

//        using for loop
                                            // dry run
//        for(int i=0;i<n;i++){             //num=0,ln=1,rn = 0
//            num = ln+rn;                  //1,0,1
//            System.out.print(num+" ");    //1,1,1
//            if (rn==0){                   //2,1,2
//                rn++;                     //3,2,3
//            }                             //5,3,5.......
//            if(i==1){
//                rn--;
//            }
//            ln = rn;
//            rn = num;
//        }


//      using while loop
//        int i = 0;
//        while(i<n){
//            num=ln+rn;
//            System.out.print(num+" ");
//            if(rn==0){
//                rn++;
//            }
//            if(i==1){
//                rn--;
//            }
//            ln = rn;
//            rn = num;
//            i++;
//        }

//        using online method
        int n = sc.nextInt(),firstterm =0,secondterm = 1,nextterm;
        for(int i =0;i<n;i++){
            System.out.print(firstterm+" ");
            nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
        }
     }
}