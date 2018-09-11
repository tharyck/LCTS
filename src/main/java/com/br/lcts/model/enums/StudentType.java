package com.br.lcts.model.enums;

public enum StudentType {
    VOLUNTARY("VOLUNTARY"),
    SCHOLARSHIP("SCHOLARSHIP");

    private String type;

    StudentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
