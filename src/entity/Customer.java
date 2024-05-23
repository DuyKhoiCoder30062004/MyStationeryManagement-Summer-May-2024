/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HELLO
 */
public class Customer {
    private String code;
    private String name;
    private String pass;
    private String ho;
    private String ten;
    private String address;
    private String sdt;
    private Date ngaysinh;

    public Customer() {
    }

    public Customer(String code, String name, String pass, String ho, String ten, String address, String sdt, Date ngaysinh) {
        this.code = code;
        this.name = name;
        this.pass = pass;
        this.ho = ho;
        this.ten = ten;
        this.address = address;
        this.sdt = sdt;
        this.ngaysinh = ngaysinh;
    }

    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    //simpleDateFormat
    public String getNgaysinh() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return df.format(ngaysinh);
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
    
}
