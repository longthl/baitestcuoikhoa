package com.example.baitestcuoikhoa.model.respon;

public class Respon<T> {
    private int statur;
    private String error;
    private T data;

    public int getStatur() {
        return statur;
    }

    public void setStatur(int statur) {
        this.statur = statur;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
