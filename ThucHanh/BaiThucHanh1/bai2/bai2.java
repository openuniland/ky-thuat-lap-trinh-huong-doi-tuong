
package bai2;

import java.util.*;

public class bai2 {
    public static void main(String [] arg)
    {
        int a[];
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N: ");
        n = sc.nextInt();
        a = new int[n];
        a[0]=1;
        a[1]=1;
        for(i=2;i<n;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        System.out.printf("\nChuoi FIBONACI:  ");
        for(i=0;i<n;i++)
        {
            System.out.printf("  %d",a[i]);
        }
        System.out.printf("\n");
    } 
}
