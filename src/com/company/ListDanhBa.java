package com.company;

import java.util.ArrayList;

public class ListDanhBa {
    private ArrayList<DanhBa> dsDanhBa = new ArrayList<>();

    public ArrayList<DanhBa> getDsDanhBa() {
        return dsDanhBa;
    }
    public void setDsDanhBa(ArrayList<DanhBa> dsDanhBa) {
        this.dsDanhBa = dsDanhBa;
    }

    public void them(DanhBa db){
        dsDanhBa.add(db);
        System.out.println("Da them thanh cong");
    }

    public void timkiem(int sdt){
        DanhBa db = tim(sdt);
        System.out.println(db);
    }

    public DanhBa tim(int sdt){
        for (DanhBa db : dsDanhBa){
            if (db.getSdt() == sdt){
                return db;
            }
        }
        return null;
    }

    public void xoa(int sdt){
        DanhBa db = tim(sdt);
        dsDanhBa.remove(db);
    }

    public void hienThi(){
        if (dsDanhBa.size()>0){
            for (DanhBa db : dsDanhBa){
                System.out.println(db);
            }
        }else {
            System.out.println("Danh sach trong");
        }
    }
}
