package com.cloudbi.domain.dto;

import com.cloudbi.domain.enumeric.DatabaseType;

import java.util.Objects;

/**
 * ConnectorDTO: set the basic information to connect database
 *
 * @author marcos
 */
public class ConnectorDTO {

    private DatabaseType databaseType;

    private String userName;

    private String password;

    private String database;

    private String table;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(DatabaseType databaseType) {
        this.databaseType = databaseType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectorDTO that = (ConnectorDTO) o;
        return Objects.equals(databaseType, that.databaseType) &&
            Objects.equals(userName, that.userName) &&
            Objects.equals(password, that.password) &&
            Objects.equals(database, that.database) &&
            Objects.equals(table, that.table);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseType, userName, password, database, table);
    }

    @Override
    public String toString() {
        return "ConnectorDTO{" +
            "databaseType='" + databaseType + '\'' +
            ", userName='" + userName + '\'' +
            ", password='" + password + '\'' +
            ", database='" + database + '\'' +
            ", table='" + table + '\'' +
            '}';
    }
}
