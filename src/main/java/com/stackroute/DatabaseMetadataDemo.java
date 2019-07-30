package com.stackroute;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public abstract class DatabaseMetadataDemo{
    DatabaseMetaData databaseMetaData;
//    public DatabaseMetadataDemo() throws SQLException {
//        databaseMetaData = .getMetaData
//    }

    public String getDriverName() throws SQLException {
       return databaseMetaData.getDriverName();
    }

    public String getDriverVersion() throws SQLException {
        return databaseMetaData.getDriverVersion();
    }

    public String getUserName() throws SQLException {
        return databaseMetaData.getUserName();
    }

    public String getDatabaseProductName() throws SQLException {
        return databaseMetaData.getDatabaseProductName();
    }

    public String getDatabaseProductVersion() throws SQLException {
        return databaseMetaData.getDatabaseProductVersion();
    }
}
