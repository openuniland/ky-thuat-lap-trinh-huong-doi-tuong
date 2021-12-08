/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.S;

/**
 *
 * @author Admin
 */
public class DanhSachCongNhan {
    CongNhan dsCongNhan[];
    float Luong=0;
    int SoCN;
    float S;
    public void DanhSachCongNhan()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("So cong nhan can nhap:");
        SoCN = nhap.nextInt();
        dsCongNhan = new CongNhan[SoCN];
    }
    public void NhapDanhSachCongNhan()
    {
        for(int i=0;i<SoCN;i++)
        {
            dsCongNhan[i] = new CongNhan();
            dsCongNhan[i].NhapCongNhan();
        }
    }
    public void HienDanhSachCongNhan()
    {
        for(int i=0;i<SoCN;i++)
        {
            dsCongNhan[i].HienCongNhan();
        }
    }
    public void HienCongNhanCoLuongLonHonS()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap Luong:");
        S = nhap.nextFloat();
        System.out.println("Danh Sach Cong Nhan Co Luong Lon Hon "+S+" la:");
        for(int i=0;i<SoCN;i++)
        {
            Luong = 1150*dsCongNhan[i].hsl;
            if(Luong>S)
            {
                dsCongNhan[i].HienCongNhan();
            }
        }
    }
}
