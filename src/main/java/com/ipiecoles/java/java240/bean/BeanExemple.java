package com.ipiecoles.java.java240.bean;

public class BeanExemple {
    private String msg;
    private String nom;

    public String getNom(String nom) {
        return nom;
    }

    public void setNom(String n) {
        nom = n;
    }

    public BeanExemple(String m) {
        msg = m;
    }

    public void init() {
    }

    public void cleanup() {
    }
}
