package com.stackroute;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) throws SQLException {
       JdbcDemo jdbcDemo = new JdbcDemo();
       jdbcDemo.getEmployeeDetailsInReverse();
       jdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
       jdbcDemo.getEmployeeDetailsByNameAndGender("lavanya","female");
    }
}
