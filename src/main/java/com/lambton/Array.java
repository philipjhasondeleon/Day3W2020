package com.lambton;

public class Array
{
    public static void main(String[] args)
    {
        int a[];
        int[] b;
        int c[] = new int[5];

        c[0] = 10;
        c[1] = 20;
        c[2] = 30;
        c[3] = 40;
        c[4] = 50;

        //c[5] = 60;

        int d[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Length of Array: " +d.length);

        for(int i = 0; i < d.length; i++)
        {
            System.out.println(d[i]);
        }

        int [] x,y; //Both are array
        int x2, y2[]; // 1 - int, 2 - array
        int x3[], y3; //1 - array, 2 - int
        int[] x4, y4[]; //x4 - 1D array, y4 - 2D array

        y4 = new int [3] [3];

        System.out.println("Using Compact for(:)");
        for (int p:d)
        {
            System.out.println(p);
        }

        findArray();
        stringArrayHandling();

    }

    /*
        Create and array of n integer element
        and find the sum, average, min and max
     */
    public static void findArray()
    {
        int p[] = {1,2,3,4,5,6,7,8,9,10};

        int max, min, sum;
        float avg;

        sum = 0;
        max = p[0];
        min = p[0];
        avg = 0;
        for(int x:p)
        {
            sum+=x;
        }

        for(int y=0; y<p.length; y++)
        {
            if (p[y] < min)
            {
                min = p[y];
            }
        }

        for(int z=0;z<p.length;z++)
        {
            if(p[z]>=max)
            {
                max=p[z];
            }
        }
            System.out.println("Sum of array is: " + sum);
            System.out.println("Minimum of array is: " + min);
            System.out.println("Maximum of array is: " + max);
        }

    public static void stringArrayHandling()
    {
        String car[];
        car = new String[10];
        car[0] = "Honda";
        car[1] = "BMW";
        car[2] = "Mitsubishi";
        car[3] = "Ford";
        car[4] = "Ferari";
        car[5] = "Chevrolet";
        car[6] = "Audi";
        car[7] = "Mercedez";
        car[8] = "f";
        car[9] = "g";

        for(int i=0; i < car.length; i++)
        {
            System.out.println(car[i]);
        }
    }

}



