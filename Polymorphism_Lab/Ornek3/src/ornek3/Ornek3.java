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
public class Ornek3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course c1 = new Course("MIS 2201", "OOP", "Sermet Mir", DayOfWeek.THURSDAY, 8.0, "A");
        Course c2 = new Course("MIS 2203", "MIS", "Murat Komesli", DayOfWeek.THURSDAY, 9.0, "B");
        Course c3 = new Course ("MIS 3301", "DMS", "Murat Komesli", DayOfWeek.WEDNESDAY, 8.0, "A");
        Course c4 = new Course("MIS 2201", "OOP", "Sermet Mir", DayOfWeek.THURSDAY, 8.0, "F");
        Student s1 = new Student("123", "Esin", "Kaya", c1, c2, c3);
        Student s2 = new Student("234", "X", "Y", c4, c2, c3);
        System.out.println("GPA of 1st student is: " + s1.calculateSemesterGPA());
        System.out.println("GPA of 2nd student is: " + s2.calculateSemesterGPA());
    }
    
}
