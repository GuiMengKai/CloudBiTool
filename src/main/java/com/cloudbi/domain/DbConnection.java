package com.cloudbi.domain;

import javax.persistence.Entity;
import java.util.Map;
import java.util.Objects;

@Entity
public class DbConnection {

    private Long id;

    private String name;

    private String description;

    private Map connectionDetails;

    private Boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map getConnectionDetails() {
        return connectionDetails;
    }

    public void setConnectionDetails(Map connectionDetails) {
        this.connectionDetails = connectionDetails;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DbConnection that = (DbConnection) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(description, that.description) &&
            Objects.equals(connectionDetails, that.connectionDetails) &&
            Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, connectionDetails, status);
    }

    @Override
    public String toString() {
        return "DbConnection{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", connectionDetails=" + connectionDetails +
            ", status=" + status +
            '}';
    }
}
