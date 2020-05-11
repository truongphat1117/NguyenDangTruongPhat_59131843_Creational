/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.Date;

/**
 *
 * @author phatc
 */
public class HoaDonHeader {
    String maHoaDon;
    Date ngayBan;
    String tenKH;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String maHoaDon, Date ngayBan, String tenKH) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "maHoaDon=" + maHoaDon + ", ngayBan=" + ngayBan + ", tenKH=" + tenKH + '}';
    }
    
    
}

