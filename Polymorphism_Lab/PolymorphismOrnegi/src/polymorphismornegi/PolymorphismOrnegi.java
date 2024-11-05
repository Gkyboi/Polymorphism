/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismornegi;

/**
 *
 * @author STUDENT
 */
public class PolymorphismOrnegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instructor ins1 = new Instructor(123456, "MIS", "Sermet Mir", 35, "Male");
        Student s1 = new Student(456789, "MIS", "Mehmet Akın", 18, "Male");
        Person p1 = new Person("Elif Aydın", 25, "Female") {

            @Override
            public void work() {
                System.out.println("I am unemployed. I don't have a salary");
            }
        };
        s1.work();
        p1.work();
        ins1.work();
        ins1.work(15000);
    }
    
}
