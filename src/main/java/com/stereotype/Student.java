package com.stereotype;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component - annotation for bean
//@Value - annotation for set value
@Component("obj")
public class Student {

    @Value("Tuhin")
    private String studentName;

    @Value("1342")
    private int rollNumber;

    //add standalone collection from xml file
    @Value("#{friends}")
    private List<String> freinds;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public List<String> getFreinds() {
        return freinds;
    }

    public void setFreinds(List<String> freinds) {
        this.freinds = freinds;
    }

    @Override
    public String toString() {
        return "Student{" + "studentName=" + studentName + ", rollNumber=" + rollNumber + ", freinds=" + freinds + '}';
    }
}
