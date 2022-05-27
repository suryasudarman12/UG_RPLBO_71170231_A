package com.ug12.aplikasistockbit;

import java.util.HashMap;

public class Investor extends Saham {
    private String username;
    private String password;
    private String nama;
    private HashMap <Saham, Integer> portofolio = new HashMap<Saham, Integer>();

    Investor(){
        super("ANTM", 2530);
        this.username = username;
        this.password = password;
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public HashMap<Saham, Integer> getPortofolio() {
        return portofolio;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }
}
