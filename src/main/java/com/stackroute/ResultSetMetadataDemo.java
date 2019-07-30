package com.stackroute;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetMetadataDemo {
  ResultSet resultSet;
  public ResultSetMetadataDemo()
  {
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
  }
  public int columnCount(ResultSet resultSet) throws SQLException {
      return resultSet.getMetaData().getColumnCount();
  }
  public String getColumnName(ResultSet resultSet,int columnNumber) throws SQLException {
      return  resultSet.getMetaData().getColumnName(columnNumber);
  }
    public int getColumnType(ResultSet resultSet,int columnNumber) throws SQLException {
        return resultSet.getMetaData().getColumnType(columnNumber);
    }

}
