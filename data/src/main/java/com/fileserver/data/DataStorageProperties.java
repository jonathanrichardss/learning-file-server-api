package com.fileserver.data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "file")
public class DataStorageProperties {
    private String upLoadDir;
    public DataStorageProperties() {
    }
    public String getUpLoadDir() {
        return upLoadDir;
    }
    public void setUpLoadDir(String upLoadDir) {
        this.upLoadDir = upLoadDir;
    }
}
