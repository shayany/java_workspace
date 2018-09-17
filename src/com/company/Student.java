package com.company;

public class Student implements Comparable<Student>{

    private String firstname;
    private  String lastname;
    private int yearOfBorn;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYearOfBorn() {
        return yearOfBorn;
    }

    public void setYearOfBorn(int yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }

    @Override
    public int compareTo(Student o) {
        if(yearOfBorn < o.getYearOfBorn()){
            return -1;
        } else if (yearOfBorn > 1){
            return 1;
        }
        return 0;
    }
}
