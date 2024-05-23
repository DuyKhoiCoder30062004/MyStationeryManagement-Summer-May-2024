/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import DBconnection.DBconnection;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.Customer;
import entity.PhoneNumber;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author HELLO
 */
public class LoadDAO {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet resultSet = null;
    //bên này khi ko dùng try catch ( try catch thì dùng khi bug nhưng ko giết app => vẫn chạy bth
    //có lỗi thì catch hứng, store lỗi => thực thi block code bên trong
    // mà đằng này ko bị lỗi => khỏi cần dùng chi (rườm rà code).
    
    public List<Customer> getAllCustomer() throws ClassNotFoundException, SQLException{
        String query = "select * from KHACHHANG";
        List<Customer> list = new ArrayList<>();
            list = new ArrayList<>();
            con = new DBconnection().getConnection();
            ps = con.prepareStatement(query);
            resultSet = ps.executeQuery();
            while(resultSet.next())
            {
                list.add(new Customer(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4), 
                        resultSet.getString(5), 
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getDate(8)));
            }
            return list;
    }
    public List<PhoneNumber> getAllPhoneNumber() throws ClassNotFoundException, SQLException{
        String query = "select DIACHI from KHACHHANG";
        List<PhoneNumber> list = new ArrayList<>();
            list = new ArrayList<>();
            con = new DBconnection().getConnection();
            ps = con.prepareStatement(query);
            resultSet = ps.executeQuery();
            while(resultSet.next())
            {
                list.add(new PhoneNumber(resultSet.getString(1)));
            }
            return list;
    }
}
