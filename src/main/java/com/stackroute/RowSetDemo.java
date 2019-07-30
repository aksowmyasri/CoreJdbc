package com.stackroute;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RowSetDemo {

    JdbcRowSet rowSet;
    public RowSetDemo() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        }
        public void setUrl(String url) throws SQLException {
        rowSet.setUrl(url);
    }
    public void setUserNameAndPassword(String username,String password) throws SQLException {
        rowSet.setUsername(username);
        rowSet.setPassword(password);
    }

    public ResultSet setCommand(String command) throws SQLException {
       rowSet.setCommand(command);
       rowSet.execute();
       return rowSet;
    }

}
