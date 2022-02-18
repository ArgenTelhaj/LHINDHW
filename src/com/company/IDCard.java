package com.company;

public class IDCard extends IdDoc{
    String idName;
    String idLName;
    String nationality;
    String cityOfBirth;
    String personalIdNumber;

//    public IDCard(String idName, String idLName, String nationality, String cityOfBirth, String personalIdNumber) {
//        this.idName = idName;
//        this.idLName = idLName;
//        this.nationality = nationality;
//        this.cityOfBirth = cityOfBirth;
//        this.personalIdNumber = personalIdNumber;
//    }


    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public String getIdLName() {
        return idLName;
    }

    public void setIdLName(String idLName) {
        this.idLName = idLName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public String getPersonalIdNumber() {
        return personalIdNumber;
    }

    public void setPersonalIdNumber(String personalIdNumber) {
        this.personalIdNumber = personalIdNumber;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "idName='" + idName + '\'' +
                ", idLName='" + idLName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", cityOfBirth='" + cityOfBirth + '\'' +
                ", personalIdNumber='" + personalIdNumber + '\'' +
                '}';
    }
}
