package com.cloudbi.connector.util;

import com.cloudbi.connector.MysqlConnector;
import com.cloudbi.connector.base.BaseConnector;
import com.cloudbi.domain.dto.ConnectorDTO;
import com.cloudbi.domain.enumeric.DatabaseType;

/**
 * Factory class to get the instance of different type of database connector
 *
 * @author Marcos
 */
public class ConnectorFactory {
    public static BaseConnector getConnectorInstance(ConnectorDTO connectorDTO) {
        DatabaseType databaseType = connectorDTO.getDatabaseType();
        BaseConnector instance = null;
        switch (databaseType) {
            case MYSQL:
                instance = new MysqlConnector(connectorDTO);
                break;
            case POSTGRESQL:
                break;
            case SQLSERVER:
                break;
            default:
                break;
        }
        return instance;
    }
}
