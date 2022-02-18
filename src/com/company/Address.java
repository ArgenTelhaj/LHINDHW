package com.company;

public class Address {

    String qyteti;
    String rruga;
    int pallati= -1;
    int hyrja = -1;

//    public Address(String qyteti, String rruga, int pallati, int hyrja) {
//        this.qyteti = qyteti;
//        this.rruga = rruga;
//        this.pallati = pallati;
//        this.hyrja = hyrja;
//    }

    public String getQyteti() {
        return qyteti;
    }

    public void setQyteti(String qyteti) {
        this.qyteti = qyteti;
    }

    public String getRruga() {
        return rruga;
    }

    public void setRruga(String rruga) {
        this.rruga = rruga;
    }

    public int getPallati() {
        return pallati;
    }

    public void setPallati(int pallati) {
        this.pallati = pallati;
    }

    public int getHyrja() {
        return hyrja;
    }

    public void setHyrja(int hyrja) {
        this.hyrja = hyrja;
    }

    @Override
    public String toString() {
        return "Address{" +
                "qyteti='" + qyteti + '\'' +
                ", rruga='" + rruga + '\'' +
                ", pallati=" + pallati +
                ", hyrja=" + hyrja +
                '}';
    }
}
