package com.test.databinding;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class test_suites {
    
	private String suite_name;
	
    private List<Result> results = new ArrayList<Result>();
    
    public String getsuite_name() {
        return suite_name;
    }
    public void setsuite_name(String suite_name) {
        this.suite_name = suite_name;
    }
    public List<Result> getResults() {
        return results;
    }
    public void setResults(List<Result> results) {
        this.results = results;
    }
}