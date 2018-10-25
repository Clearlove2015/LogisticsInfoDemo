package com.odbpo.fenggou.logisticsinfodemo.bean;

public class LogisticsInfoBean {
    private String status;
    private String acceptTime;
    private String acceptStation;

    public LogisticsInfoBean() {
    }

    public LogisticsInfoBean(String status, String acceptTime, String acceptStation) {
        this.status = status;
        this.acceptTime = acceptTime;
        this.acceptStation = acceptStation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(String acceptTime) {
        this.acceptTime = acceptTime;
    }

    public String getAcceptStation() {
        return acceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation;
    }
}
