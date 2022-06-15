package com.sapient.asde.ui;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Integer n=scanner.nextInt();
        Runnable task= () -> {
            try
            {
                Long f = 1L;
                for(Integer i = 2;i<=n;i++)
                {
                    f*=i;
                }
                System.out.print("Factorial of "+n+" is : "+f);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        };
        new Thread(task).start();
    }
}
