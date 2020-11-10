package com.company;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public DanhBa themMoiorCapNhap(){
        System.out.println("Nhap Ten");
        String ten = sc.nextLine();
        System.out.println("Nhap so dien thoai");
        int sdt = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gioi tinh");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhap dia chi");
        String diaChi = sc.nextLine();
        System.out.println("Nhap email");
        String email = sc.nextLine();

        DanhBa db = new DanhBa(ten, sdt, gioiTinh, diaChi, email);
        return db;
    }

}
