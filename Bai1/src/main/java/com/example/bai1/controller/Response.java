package com.example.bai1.controller;

public class Response {
    private int x;
    private int y;

    private int result;

    public Response(int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Response{" +
                "x=" + x +
                ", y=" + y +
                ", result=" + result +
                '}';
    }
}
