
package bai3;

import java.util.*;

public class bai3 {
    public static void main(String [] arg)
    {
        int a,b,c,i;
        float s,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        a = sc.nextInt();
        System.out.println("Nhap canh b: ");
        b = sc.nextInt();
        System.out.println("Nhap canh c: ");
        c = sc.nextInt();
        p =(float)((a+b+c)/2);
        s = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("\nDien tich tam giac la: %f",s);
        System.out.printf("\n");
    }
}
