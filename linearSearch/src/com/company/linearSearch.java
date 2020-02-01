package com.company;
import java.util.Scanner;
import java.util.Random;

public class linearSearch {

    public  void arr() {
        int key;
        // item to be entered
        System.out.println("Enter the searchkey");
        Scanner sc=new Scanner(System.in);
key=sc.nextInt();
        // initializing the array
Random ran=new Random();
        int arr[] = new int[50000];
        int i = 0, c = 0, position = 0;
        arr[i] = ran.nextInt();

time t=new time();

       for (i= 0; i < 50000; i++) {
             arr[i]=ran.nextInt();
           System.out.println("array values "+arr[ i ]);

        }

       for (i=0;i<50000;i++) {

           if (arr[i] == key) {
               c = 1;
               position = i;
               break;

           }

       }
           if (c == 0) {
               System.out.println("Item not found");
           } else {

               System.out.println("found at index " + position);
           }
        t.timeset();

        }


}

