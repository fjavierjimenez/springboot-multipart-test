package com.sngular.model;

public class Metadata {
    private String ip;
    private String browserMetadata;

    public Metadata() {
    }

    public Metadata(String ip, String browserMetadata) {
        this.ip = ip;
        this.browserMetadata = browserMetadata;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBrowserMetadata() {
        return browserMetadata;
    }

    public void setBrowserMetadata(String browserMetadata) {
        this.browserMetadata = browserMetadata;
    }
}
