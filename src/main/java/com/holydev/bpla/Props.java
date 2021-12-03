package com.holydev.bpla;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("main")
public class Props {


    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
