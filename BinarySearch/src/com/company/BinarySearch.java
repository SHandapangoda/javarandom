package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch extends time {
    public void arr(int key){
        //array definition
Random ra=new Random();
int arr[]=new int[50000];
        int  c = 0, position = 0;

        for (int i = 0; i <50000 ; i++) {
            arr[i]=ra.nextInt();
            System.out.println("array "+arr[i]);
        }
     Arrays.binarySearch(arr,key);
        time t=new time();
        t.timeset();
    }

}
