package org.example;

import java.util.Date;

public class Project {
    private long clientId;
    private String startDate;
    private String endDate;

    public Project() {
    }

    public Project(long clientId, String startDate, String endDate) {
        this.clientId = clientId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Project{" +
                "clientId=" + clientId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
