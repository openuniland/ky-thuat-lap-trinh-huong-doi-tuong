
package bai1;

import java.util.*;

public class bai1 {
    public static void main (String [] arg)
    {
        int n,i,tong = 0,min,t=0;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        n = sc.nextInt();
            a = new int[n];
        for(i=0;i<n;i++)
        {
            System.out.printf("Nhap phan tu thu %d: ",i+1);
            a[i] = sc.nextInt();
        }
        System.out.printf("Mang da nhap la:");
        for(i=0;i<n;i++)
        {
            System.out.printf("   a[%d]:%d     ",i,a[i]);
        }
        for(i=0;i<n;i++)
        {
            tong = tong +a[i];
        }
        System.out.println("\nTong cac phan tu cua mang la: "+tong);
        System.out.printf("\nCac phan tu le co trong mang la: ");
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
                System.out.printf("   a[%d]:%d    ",i,a[i]);
        }
        min=a[0];
        for(i=0;i<n;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.printf("\nGia tri nho nhat trong mang la: %d ",min);
        for ( i = 0; i < n; i++) {
            if (a[i]==min) {
                System.out.printf("o vi tri thu %d ",i+1);
            }
        }
        
    }
}
