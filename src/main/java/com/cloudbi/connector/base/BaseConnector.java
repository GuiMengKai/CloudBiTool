package com.cloudbi.connector.base;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Marcos
 */
public abstract class BaseConnector {

    String dbName;

    String hostName;

    String port;

    String userName;

    String password;

    public abstract String getConnectUrl();

    public abstract Connection getConnectionObject() throws SQLException;

    String getDbName() {
        return this.dbName;
    }

}
