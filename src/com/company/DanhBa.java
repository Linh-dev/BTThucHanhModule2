package com.company;

import java.io.Serializable;

public class DanhBa implements Serializable {
    private String ten;
    private int sdt;
    public String gioiTinh;
    private String diaChi;
    private String email;

    public DanhBa(){}

    public DanhBa(String ten, int sdt, String gioiTinh, String diaChi, String email) {
        this.ten = ten;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.email = email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "DanhBa{" +
                "ten='" + ten + '\'' +
                ", sdt=" + sdt +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
