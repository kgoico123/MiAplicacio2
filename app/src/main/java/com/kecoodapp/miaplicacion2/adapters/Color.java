package com.kecoodapp.miaplicacion2.adapters;

public class Color {
    private String name;
    private int color;

    public Color(String name, int tel) {
        this.name = name;
        this.color=tel;
    }
    public Color() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return color;
    }

    public void setTel(int tel) {
        this.color = tel;
    }
}
