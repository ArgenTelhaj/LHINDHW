package com.company;

public class Contact {

    String email;
    String number;
    String facebook;
    String instagram;
    String linkedIn;

//    public Contact(String email, String number, String facebook, String instagram, String linkedIn) {
//        this.email = email;
//        this.number = number;
//        this.facebook = facebook;
//        this.instagram = instagram;
//        this.linkedIn = linkedIn;
//    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", facebook='" + facebook + '\'' +
                ", instagram='" + instagram + '\'' +
                ", linkedIn='" + linkedIn + '\'' +
                '}';
    }
}
