package com.br.lcts.util.response;

import java.util.List;

public class ResponseListObject<T> extends Response {
    private List<T> listObject;

    public ResponseListObject(String message, List<T> listObject) {
        super(message);
        this.listObject = listObject;
    }

    public List<T> getListObject() {
        return listObject;
    }

    public void setListObject(List<T> listObject) {
        this.listObject = listObject;
    }
}
