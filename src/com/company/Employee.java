package com.company;

public class Employee {

    IDCard id= new IDCard();
    Contact contact= new Contact();
    Education educationUn= new University();
    Education educationHs= new HighSchool();
    Experience experience = new Experience();
    Address address= new Address();

//    public Employee(IDCard id, Contact contact, Education education, Experience experience, Address address) {
//        this.id = id;
//        this.contact = contact;
//        this.education = education;
//        this.experience = experience;
//        this.address = address;
//    }
//
//    public IDCard getId() {
//        return id;
//    }
//
//    public void setId(IDCard id) {
//        this.id = id;
//    }
//
//    public Contact getContact() {
//        return contact;
//    }
//
//    public void setContact(Contact contact) {
//        this.contact = contact;
//    }
//
//    public Education getEducation() {
//        return education;
//    }
//
//    public void setEducation(Education education) {
//        this.education = education;
//    }
//
//    public Experience getExperience() {
//        return experience;
//    }
//
//    public void setExperience(Experience experience) {
//        this.experience = experience;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "  \nid=" + id +
                ", \ncontact=" + contact.toString() +
                ", \neducation=" + educationHs.toString() +
                ", \neducation=" + educationUn.toString() +
                ", \nexperience=" + experience.toString() +
                ", address=" + address.toString() +
                "\n}";
    }
}

