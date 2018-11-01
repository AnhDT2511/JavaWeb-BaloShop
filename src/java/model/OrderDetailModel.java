/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.MSSQLConnection;
import entity.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Shado
 */
public class OrderDetailModel {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public boolean addOrderDetail(OrderDetail orderDetail) {
        int isCheck = 0;
        String query = "INSERT INTO Order_Detail(Order_Id, Product_Id, Product_Name, "
                + "Product_Quantity, Product_Price) VALUES(?, ?, ?, ?, ?)";
        try {
            connection = MSSQLConnection.getConnection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, orderDetail.getOrderId());
            ps.setInt(2, orderDetail.getProductId());
            ps.setString(3, orderDetail.getProductName());
            ps.setInt(4, orderDetail.getQuantity());
            ps.setDouble(5, orderDetail.getProductPrice());
            isCheck = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            MSSQLConnection.closeResultSet(rs);
            MSSQLConnection.closePreparedStatement(ps);
            MSSQLConnection.closeConnection(connection);
        }
        return isCheck > 0;
    }
}
