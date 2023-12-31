package com.acegreencemt.tms.enumeration;

public enum Status {
    ACTIVE("ACTIVE"),
    DELETED("DELETED");

    private final String status;

    Status(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }

}
