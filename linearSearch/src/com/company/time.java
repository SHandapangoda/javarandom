package com.company;

import java.util.*;
public class time extends linearSearch {
    public void timeset() {

        try {
            long Start = System.nanoTime();


            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

          long end =System.nanoTime();
long diff=(end -Start)/1000;
            System.out.println(new Date() + "\n" + diff);

        } catch (Exception e) {
            System.out.println("error");

        }

    }
}