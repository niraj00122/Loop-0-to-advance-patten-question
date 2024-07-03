package loop;

import java.util.Scanner;

import sorting.selection;

public class loop {
    public static void main(String[] args) {
        // loop
        // for loop 
        // while loop jab tak kam karte rahiye

        // do while loop

        // for loop(insertionsort ; condition; updation)
        // for(int counter=0; counter<11;counter++){
        //     System.out.print(" " +counter);

        //while loop
        // int i=0;
        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }
    

        // do while

    // int i=0;
    // do{
    //     System.out.println(i);
    //     i++;
    // }while(i<11);


//  
// int n=sc.nextInt();
// int sum=0;
// for(int i=0; i<=n; i++){
//     sum=sum+i;
// }
// System.out.println(sum);
//     }
// }     

// // Q 1.print the table of a number input by the user 
// int n=sc.nextInt();
// for(int i=1;i<11; i++){
//     System.out.println(i*n);
// }
//     }
// }

///------------------loop pattren--------------
//Q1 solid Ractangle
// ******
// ******
// ******
// ****** 
// outer loopi
// int n=4;
// int m=5;

// for(int i=1; i<=4; i++){
//     //inner loop
//     for(int j=1; j<=5; j++){
//         System.out.print("*");
//     }
//     System.out.println();
  
// }
//     }
// }

//Q2 Hollow Rachtangle 
// ****** 
// *     *
// *     *
// *******
// int n=4;
// int m=5;
// for(int i=1; i<=n; i++){
//     for(int j=1;j<=m;j++){
//         if (i==1|| j==1|| i==n|| j==m) {
//             System.out.print("*");
//         } 
//        else{
//         System.out.print(" ");
//        }
//     }
//     System.out.println();
// }
//     }
// }

//Q4 Half pyramid
// *
// **
// ***
// ****
// int n=4;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n; j++){
//       System.out.print("*");
//     }
//     System.out.println();
// }
//     }
// }

// Q5 
// ****
// ***
// **
// *
// int n=4;
// for(int i=n; i>=1; i--){
//     for(int j=1;j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//     }
// }


// Q6 invertef half pyramid
//      *
//     **
//    *** 
//  *****
 
// int n=4;
//outer loop
// for(int i=1; i<=n; i++){
//     //inner loop  space ke lye 
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     //inner loop star ke liye 
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//     }
// }

// Q7 half pramid with number  
// 1
// 12
// 123
// 1234
// 12345
// int n=5;
// for(int i=1; i<=n; i++){
//     for(int j=1;j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }
//     }
// }


//Q9
// // invated half pyramind number
// 12345
// 1234
// 123
// 12
// 1
// int n=5;
// // outer loop
// for(int i=1; i<=n; i++){
//     //inner loop
//     for(int j=1; j<=n-i+1; j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }
//     }
// }

// Q10 floyds trangle

// 1
// 2 3
// 4 5 6
// 7 8 9 10
//  11 12 13 14 15
// int n=5;
// int number=1;
// for(int i=1; i<=n; i++){
//     for(int j=1;j<=i; j++){
//         System.out.print(number);
//         number++;
//     }
//     System.out.println();
// }
//     }
// }

// Q 11 0-1 trangle
// 1
// 01
// 101
// 0101
// 10101

// int n=5;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         int sum=i+j;
//         if (sum % 2==0) {//even 
//             System.out.print("1");
//         }
//         else{
//             System.out.print("0");
//         }
//     }
//     System.out.println();
// }
//     }
// }  


// ---------------------problem -----------
// Scanner sc= new Scanner(System.in);
// int r=sc.nextInt();
// int c=sc.nextInt();

// for(int i=1; i<=r; i++){
//     for(int j=1; j<=c; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//     }
// }

// Q10  


// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *


// int n=4;
// //outer loop
// for(int i=1; i<=n; i++){
//     //uper half
//     for(int j=1;j<=i; j++){
//         System.out.print("*");
//     }
//     //space
//     int space=2*(n-i);
//     for(int j=1; j<=space; j++){
//         System.out.print(" ");
//     }
//     //2nd part
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int i=n; i>=1; i--){
//     //uper half
//     for(int j=1;j<=i; j++){
//         System.out.print("*");
//     }
//     //space
//     int space=2*(n-i);
//     for(int j=1; j<=space; j++){
//         System.out.print(" ");
//     }
//     //2nd part
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//     }
// }
  

// //Q11
//       *****
//      *****
//     *****
//   *****
//  *****
// int n=5;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<n-i; j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=n; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//     }
// }


// Q12
//            1
//           2 2
//          3 3 3
//         4 4 4 4
//        5 5 5 5 5
// int n=5;
//outer loop
// for(int i=1; i<=n; i++){
//     //space
//     for(int j=1; j<n-i; j++){
//         System.out.print(" ");
//     }
//     //inner loop
//     for(int j=1; j<=i; j++){
//         System.out.print(i+" ");
//     }
//     System.out.println();
// }
//     }
// }



// Q13 paliemdrom pattren
//     1
//    212
//   32123
//  4321234
// 543212345
// int n =5;
// //outer loop
// for(int i=1; i<=n; i++){
//     //space
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     //1st half8
//     for(int j=;j>=1;j--){
//         System.out.print(j);
//     }
//     //2nd half
//     for(int j=2; j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }
//     }
// }


int n=4;
//outer loop
for(int i=1; i<=n; i++){
    //space
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    //sttar
    for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
    }
    System.out.println();
}
//2nd half
for(int i=n; i>=1; i--){
    //space
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    //sttar
    for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
