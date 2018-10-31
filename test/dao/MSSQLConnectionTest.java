/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.MSSQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Shado
 */
public class MSSQLConnectionTest {
    private static Connection connection = null;
    
    public MSSQLConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        connection = MSSQLConnection.getConnection();
    }
    
    @After
    public void tearDown() {
        connection = null;
    }

    /**
     * Test of getConnection method, of class MSSQLConnection.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        assertTrue(connection != null);
    }

    /**
     * Test of closeConnection method, of class MSSQLConnection.
     * @throws java.sql.SQLException
     */
    @Test
    public void testCloseConnection() throws SQLException {
        System.out.println("closeConnection");
        MSSQLConnection.closeConnection(connection);
        assertTrue(connection.isClosed());
    }

    /**
     * Test of closePreparedStatement method, of class MSSQLConnection.
     */
    @Ignore
    @Test
    public void testClosePreparedStatement() {
        System.out.println("closePreparedStatement");
        PreparedStatement ps = null;
        MSSQLConnection.closePreparedStatement(ps);
    }

    /**
     * Test of closeResultSet method, of class MSSQLConnection.
     */
    @Ignore
    @Test
    public void testCloseResultSet() {
        System.out.println("closeResultSet");
        ResultSet rs = null;
        MSSQLConnection.closeResultSet(rs);
    }
    
}
