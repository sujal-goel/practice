// import java.util.*;
// public class main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("name : ");
//         String name = sc.nextLine();
//         System.out.print("AGE : ");
//         int age = sc.nextInt();
//         System.out.print("your name : ");
//         System.out.println(name);
//         System.out.print("your age : ");
//         System.out.println(age);
//         switch(age){
//             case 18: System.out.println("eligible");
//             break;
//             default: System.out.println("not elegible");
//         }
        
//     }
// }

// import java.util.*;
// public class main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
        // for(int i=1;i<=n;i++){
        //     sum = sum + i;
        // }
       
        // int i = 1;
        // while(i<=n){
        //     sum =sum+i;
        //     i++;
        // }

        // do{
        //     sum = sum+i;
        //     i++;
        // }while(i<=n);
 
        // System.out.println(sum);
        // for(int i = 1;i<=10;i++){
        //     System.out.println(n*i);
        // }
            // while(i<=10){
            //     System.out.println(i*n);
            //     i++;
            // }
            // do{
            //     System.out.println(i*n);
            //     i++;
            // }while(i<=10);
    // }
// }

import java.util.*;
// public class main{
//     public static void main(String[] args){
//         Instant start = Instant.now();
        // int n=4;

        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=10;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }
//         int n=5;
//         int i=1;
//         while(i<=n){
            
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int k=1;k<=n-i;k++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=n-i;k++){
//                 System.out.print(" ");
//             } 
//             for(j =1;j<=i;j++){
//                 System.out.print("*");
//             }
//         System.out.println(); 
//         i++;
//          } 
//             i--;
//             while(i>=1){
            
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
            
//             for(int k=1;k<=n-i;k++){
//                 System.out.print(" ");
//             }  
//             for(int k=1;k<=n-i;k++){
//                 System.out.print(" ");
//             }  
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//         System.out.println(); 
//         i--;     }
//         Instant end= Instant.now();
//         Duration t = Duration.between(start, end) ;
//         System.out.println("Time taken : " + t.toMillis() + "ms");
//     }
// }

// public class main {
//     // public static int sum(int a,int b){
//     //     int sum = a+b;
//     //     return sum;
//     // }
//     public static void fact(int n){
//         int factorial = 1;
//         for(int i =n;i>=1;i-- ){
//             factorial = factorial *i;
//         }
//         System.out.println("The factorial of "+n+": "+factorial);
//         return;
//     }

//    public static int max(int a,int b ,int c){
//     int max;
//     max = ((a>b)&&(a>c))? a:((b>c)?b:c);
//     return max;
//    }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("enter first number: ");
//     int a = sc.nextInt();
//     System.out.print("enter second number: ");
//     int b = sc.nextInt();
//     System.out.print("enter third number: ");
//     int c = sc.nextInt();
//     // System.out.print("enter second number: ");
//     // int b = sc.nextInt();
//     // fact(a);
//     System.out.println("Maximum among above number is : "+max(a,b,c));
//     // System.out.println(a+"+"+b+"="+sum(a,b));

// }
// }