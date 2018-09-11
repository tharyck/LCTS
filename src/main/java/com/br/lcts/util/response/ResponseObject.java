package com.br.lcts.util.response;

public class ResponseObject extends Response {

    private Object object;
    public ResponseObject(String message, Object object) {
        super(message);
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
