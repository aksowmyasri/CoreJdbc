package com.stackroute;

import javax.sql.RowSet;
import java.sql.*;

public class JdbcDemo {
  private RowSetDemo rowSetDemo;
  public JdbcDemo() throws SQLException {
      rowSetDemo = new RowSetDemo();
      rowSetDemo.setUrl("jdbc:mysql://localhost:3306/employee");
      rowSetDemo.setUserNameAndPassword("root","root@123");
  }

    public void getEmployeeDetailsInReverse() {
        try(ResultSet resultSet= rowSetDemo.setCommand("select * from employeetbl");) {
            resultSet.afterLast();
            while (resultSet.previous()) {
                System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) +
                        "  " + resultSet.getInt(3) + "  " + resultSet.getString(4));

            }
            System.out.println();
        } catch (SQLException e) {
            e.printStackTrace();
        }

            }
            public void getEmployeeDetailsFromSecondRowInReverse()
        {

            try(ResultSet resultSet= rowSetDemo.setCommand("select * from employeetbl order by id desc");) {
                int rowCount = 0;
                if (resultSet.last()) {//make cursor to point to the last row in the ResultSet object
                    rowCount = resultSet.getRow();
                    resultSet.beforeFirst(); //make cursor to point to the front of the ResultSet object, just before the first row.
                }
                for(int i=0;i<rowCount-1;i++) {
                    if (resultSet.next()) {


                        System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) +
                                "  " + resultSet.getInt(3) + "  " + resultSet.getString(4));

                    }

                }
                System.out.println();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        public void getEmployeeDetailsByNameAndGender(String name,String gender) throws SQLException {

        String sqlStatement ="select * from employeetbl where name='"+name+"' and gender='"+gender+"'";
        try(ResultSet resultSet = rowSetDemo.setCommand(sqlStatement);){
            while (resultSet.next())
            {
                System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) +
                        "  " + resultSet.getInt(3) + "  " + resultSet.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        }


    }


