/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek3;

import java.util.HashMap;

/**
 *
 * @author STUDENT
 */
public class Student {
    private String StudentNumber;
    private String Name;
    private String Surname;
    private Course FirstCourse;
    private Course SecondCourse;
    private Course ThirdCourse;

    public Student(String StudentNumber, String Name, String Surname, Course FirstCourse, Course SecondCourse, Course ThirdCourse) {
        this.StudentNumber = StudentNumber;
        this.Name = Name;
        this.Surname = Surname;
        this.FirstCourse = FirstCourse;
        this.SecondCourse = SecondCourse;
        this.ThirdCourse = ThirdCourse;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(String StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public Course getFirstCourse() {
        return FirstCourse;
    }

    public void setFirstCourse(Course FirstCourse) {
        this.FirstCourse = FirstCourse;
    }

    public Course getSecondCourse() {
        return SecondCourse;
    }

    public void setSecondCourse(Course SecondCourse) {
        this.SecondCourse = SecondCourse;
    }

    public Course getThirdCourse() {
        return ThirdCourse;
    }

    public void setThirdCourse(Course ThirdCourse) {
        this.ThirdCourse = ThirdCourse;
    }
    
    public double calculateSemesterGPA(){
        double ECTS_total = this.FirstCourse.getECTS()+ this.SecondCourse.getECTS()+
                this.ThirdCourse.getECTS();
        double GPA = 0.0;
        HashMap<String,Double> hmap = new HashMap<String,Double>();
        hmap.put("A", 4.0);
        hmap.put("A-", 3.7);
        hmap.put("B+", 3.3);
        hmap.put("B", 3.0);
        hmap.put("B-", 2.7);
        hmap.put("C+", 2.3);
        hmap.put("C", 2.0);
        hmap.put("C-", 1.7);
        hmap.put("D+", 1.3);
        hmap.put("D", 1.0);
        hmap.put("F", 0.0);
        
        String letterGrade = this.FirstCourse.getLetterGrade();
        String letterGrade2 = this.SecondCourse.getLetterGrade();
        String letterGrade3 = this.ThirdCourse.getLetterGrade();
        
        double val = hmap.get(letterGrade);
        double val2 = hmap.get(letterGrade2);
        double val3 = hmap.get(letterGrade3);
        
        GPA = val * this.FirstCourse.getECTS() + val2 * this.SecondCourse.getECTS() + 
                val3 * this.ThirdCourse.getECTS();
        GPA = GPA /ECTS_total;
        return GPA;
    }
}
