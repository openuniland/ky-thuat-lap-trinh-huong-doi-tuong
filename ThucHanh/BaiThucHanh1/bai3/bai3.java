
package bai3;

import java.util.*;

public class bai3 {
    public static void main(String [] arg)
    {
        double a, b, c, s, p=0;
        Scanner sc=new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if ((a+b<=c)||(a+c<=b)||(b+c<=a)) {
            System.out.printf("\na, b, c khong phai 3 canh 1 tam giac");
        }
        else
            p=(a+b+c)/2;
            s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println(s);
    }
}
//minh luo`i nen moi nguoi them cac cau lenh nhap nhe' :> heh
