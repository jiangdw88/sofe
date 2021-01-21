package com.example.demo.bean;

public class Sort {
    private String sortId;
    private String sortName;

    @Override
    public String toString() {
        return "Sort{" +
                "sortId='" + sortId + '\'' +
                ", sortName='" + sortName + '\'' +
                '}';
    }

    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public Sort() {
    }

    public Sort(String sortId, String sortName) {
        this.sortId = sortId;
        this.sortName = sortName;
    }
}
