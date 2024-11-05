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
public class Instructor extends Person {
    private int ID;
    private String department;

    public Instructor(int ID, String department, String name, int age, String gender) {
        super(name, age, gender);
        this.ID = ID;
        this.department = department;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println("Working as an instructor at "+ this.department+ " with a salary of 10000");
    }
    
    public void work(int salary){
        System.out.println("Working as an instructor at "+ this.department+ " with a salary of " + salary);
    }
}
