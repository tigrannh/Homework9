package model;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private double mark;

    public Student(String data) {
        String[] info = data.split(",");
        setFirstName(info[0]);
        setLastName(info[1]);
        setYear(Integer.parseInt(info[2]));
        setGender(info[3].charAt(0));
        setMark(Double.parseDouble(info[4]));
    }

    @Override
    public String toString() {
        return firstName + "," + lastName + "," + year + "," + gender + "," + mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public char getGender() {
        return gender;
    }

    public double getMark() {
        return mark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

}
