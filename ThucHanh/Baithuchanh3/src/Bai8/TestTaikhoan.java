/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class TestTaikhoan {
    public static void menu()
    {
        System.out.println("1.Them Tai Khoan");
        System.out.println("2.Hien Tai khoan");
        System.out.println("3.Gui tien vao tai khoan");
        System.out.println("4.Rut tien tu tai khoan");
        System.out.println("5.Tinh dao han");
    }
    public static void main(String[] args)
    {
        int tiep;
        menu();
        Taikhoan TK = new Taikhoan();
        Scanner nhap = new Scanner(System.in);
        tiep = nhap.nextInt();
        do
        {
            switch(tiep)
            {   
                case 1:
                    TK.nhaptt();
                    break;
                case 2:
                    TK.hientt();
                    break;
                case 3:
                    TK.guitien();
                    break;
                case 4:
                    TK.ruttien();
                    break;
                case 5:
                    TK.daohan();
                    break;
                default:
                    break;
            }
            System.out.println("Chon 1 de tiep tuc them tai khoan hoac chon chuc nang khac");
            tiep= new Scanner(System.in).nextInt();
        }
        while(tiep!=0);
    }

}
