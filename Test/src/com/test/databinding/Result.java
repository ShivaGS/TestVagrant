package com.test.databinding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    private String test_name;
    private String time;
    private String status;
    
    public String gettest_name() {
        return test_name;
    }
    public void settest_name(String test_name) {
        this.test_name = test_name;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}