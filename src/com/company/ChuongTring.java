package com.company;

import java.util.Scanner;

public class ChuongTring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        ListDanhBa listDanhBa = new ListDanhBa();
        DocGhi docghi = new DocGhi();
        do {
            System.out.println("___ Chuong Trinh Quan Ly Danh Ba ___");
            System.out.println("Chon chuc nang theo so(de tiep tuc):");
            System.out.println("1. Xem danh sach");
            System.out.println("2. Them moi");
            System.out.println("3. Xoa");
            System.out.println("4. Cap Nhat");
            System.out.println("5. Tim kiem");
            System.out.println("6. Doc tu file");
            System.out.println("7. Ghi vao file");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    listDanhBa.hienThi();
                    break;
                case 2:
                    DanhBa db = menu.themMoiorCapNhap();
                    listDanhBa.them(db);
                    break;
                case 3:
                    System.out.println("Nhap so dien thoai nguoi can xoa");
                    int sdtXoa = Integer.parseInt(sc.nextLine());
                    listDanhBa.timkiem(sdtXoa);
                    System.out.print("Nhap 'Y' de dong y: ");
                    String y = sc.nextLine();
                    if (y.equals("y")||y.equals("Y")){
                        listDanhBa.xoa(sdtXoa);
                        System.out.println("Xoa thanh cong!");
                    }else {
                        System.out.println("Nhap sai chua xoa!");
                    }
                    break;
                case 4:
                    System.out.println("Nhap sdt cua nguoi can thay doi thong tin");
                    int sdtThayDoi = Integer.parseInt(sc.nextLine());
                    boolean checkThayDoi = false;
                    for (DanhBa dbThayDoi : listDanhBa.getDsDanhBa()){
                        if (dbThayDoi.getSdt() == sdtThayDoi){
                            checkThayDoi = true;
                            break;
                        }
                    }
                    if (checkThayDoi){
                        listDanhBa.xoa(sdtThayDoi);
                        listDanhBa.them(menu.themMoiorCapNhap());
                    }else {
                        System.out.println("Nhap sdt khong chinh sac!");
                    }
                    break;
                case 5:
                    System.out.println("Nhap so dien thoai nguoi can tim");
                    int sdtTimKiem = Integer.parseInt(sc.nextLine());
                    if (listDanhBa.tim(sdtTimKiem)!=null){
                        listDanhBa.timkiem(sdtTimKiem);
                    }else {
                        System.out.println("khong tim thay!");
                    }

                    break;
                case 6:
                    listDanhBa.setDsDanhBa(docghi.doc());
                    System.out.println("Doc thanh cong!");
                    break;
                case 7:
                    docghi.ghi(listDanhBa.getDsDanhBa());
                    System.out.println("Ghi thanh cong!");
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);
    }
}
