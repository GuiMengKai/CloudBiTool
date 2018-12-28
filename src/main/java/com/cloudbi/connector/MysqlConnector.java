package com.cloudbi.connector;

import com.cloudbi.connector.base.BaseConnector;
import com.cloudbi.domain.dto.ConnectorDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author marcos
 */
public class MysqlConnector extends BaseConnector {

    private ConnectorDTO connectorDTO;

    public MysqlConnector(ConnectorDTO connectorDTO) {
        this.connectorDTO = connectorDTO;
    }

    @Override
    public String getConnectUrl() {
        return "jdbc:mysql:localhost://3306/"+this.connectorDTO.getDatabase()+"";
    }

    @Override
    public Connection getConnectionObject() throws SQLException {
        return DriverManager.getConnection(getConnectUrl(),this.connectorDTO.getUserName(),this.connectorDTO.getPassword());
    }
}
