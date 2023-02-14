package com.test.databinding;

import java.awt.ItemSelectable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

//@JsonIgnoreProperties(ignoreUnknown = true)

public class parent {
    private List<test_suites> test_suites  = new ArrayList<test_suites>();
    public List<test_suites> getTestSuites() {
        return test_suites;
    }
    public void setTestSuites(List<test_suites> test_suites) {
        this.test_suites = test_suites;
    }
}