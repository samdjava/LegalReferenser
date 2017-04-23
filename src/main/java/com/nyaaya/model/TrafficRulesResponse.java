package com.nyaaya.model;

import java.util.List;

/**
 * Created by root on 22/4/17.
 */
public class TrafficRulesResponse {

    int count;
    String next;
    String previous;
    List<TrafficRules> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<TrafficRules> getResults() {
        return results;
    }

    public void setResults(List<TrafficRules> results) {
        this.results = results;
    }
}
