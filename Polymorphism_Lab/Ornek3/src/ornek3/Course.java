/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek3;

import java.time.DayOfWeek;

/**
 *
 * @author STUDENT
 */
public class Course {
    private String CourseID;
    private String CourseName;
    private String InstructorName;
    private DayOfWeek time;
    private double ECTS;
    private String LetterGrade;

    public Course(String CourseID, String CourseName, String InstructorName, DayOfWeek time, double ECTS, String LetterGrade) {
        this.CourseID = CourseID;
        this.CourseName = CourseName;
        this.InstructorName = InstructorName;
        this.time = time;
        this.ECTS = ECTS;
        this.LetterGrade = LetterGrade;
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String CourseID) {
        this.CourseID = CourseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getInstructorName() {
        return InstructorName;
    }

    public void setInstructorName(String InstructorName) {
        this.InstructorName = InstructorName;
    }

    public DayOfWeek getTime() {
        return time;
    }

    public void setTime(DayOfWeek time) {
        this.time = time;
    }

    public double getECTS() {
        return ECTS;
    }

    public void setECTS(double ECTS) {
        this.ECTS = ECTS;
    }

    public String getLetterGrade() {
        return LetterGrade;
    }

    public void setLetterGrade(String LetterGrade) {
        this.LetterGrade = LetterGrade;
    }
    
    
}
