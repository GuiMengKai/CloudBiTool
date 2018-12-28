package com.cloudbi.connector;

import com.cloudbi.connector.base.BaseConnector;
import com.cloudbi.domain.dto.ConnectorDTO;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Provide Connection to the database of postgresql
 *
 * @author marcos
 */
public class PostgreSqlConnector extends BaseConnector {

    @Override
    public String getConnectUrl() {
        return "jdbc:postgresql://localhost:5432/";
    }

    @Override
    public Connection getConnectionObject() throws SQLException {
        return null;
    }
}
