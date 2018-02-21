/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdmvcschool.model;

/**
 *
 * @author dmora
 */
public class Student {

    long id;
    String name;
    int age;

    //Constructors
    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //ToString
    @Override
    public String toString() {
        return "Student{" + "id=" + id
                + ", name=" + name
                + ", age=" + age
                + '}';
    }

}
