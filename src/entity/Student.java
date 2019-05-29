package entity;

public class Student {
    private String EnrolID;
    private String FistName;
    private String LastName;
    private String Age;

    public Student() {
    }

    public Student(String enrolID, String fistName, String lastName, String age) {
        EnrolID = enrolID;
        FistName = fistName;
        LastName = lastName;
        Age = age;
    }

    public String getEnrolID() {
        return EnrolID;
    }

    public void setEnrolID(String enrolID) {
        EnrolID = enrolID;
    }

    public String getFistName() {
        return FistName;
    }

    public void setFistName(String fistName) {
        FistName = fistName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }
}
