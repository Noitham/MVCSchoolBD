/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdmvcschool.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author dmora
 */
public class Model extends Observable {

    // Observers list to implement Observer/Observable pattern.
    private List<Observer> observers;

    // Data
    private List<Student> students;
    private List<Group> groups;

    // Constructors.
    public Model() {
        this.observers = new LinkedList<>();
        this.students = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    // Methods to implement Observer/Observable pattern.
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(Object o) {
        for (Observer obs : observers) {
            obs.update(this, o);
        }
    }

    // Methods to manage data.
    
    /**
     * Method for listing all groups.
     * This method will be called by the controller.
     * It will manipulate the data, and return it to the view, which
     * will be the one that will show it to the user.
     * 
     */
    public void listAllGroups() {

    }

    /**
     * Method for creating a new group.
     * This method will be called by the controller.
     * It will manipulate the data, and return it to the view, which
     * will be the one that will show it to the user.
     *
     * @param group to add
     */
    public void createNewGroup(Group group) {

    }

    /**
     * Method for modifying a existing group.
     * This method will be called by the controller.
     * It will manipulate the data, and return it to the view, which
     * will be the one that will show it to the user.
     *
     * @param group to be modified
     */
    public void modifyGroup(Group group) {

    }

    /**
     * Method for removing an existing group.
     * This method will be called by the controller.
     * It will manipulate the data, and return it to the view, which
     * will be the one that will show it to the user.
     *
     * @param group to modify
     */
    public void deleteGroup(Group group) {
           
    }

    /**
     * Method listing all students.
     * This method will be called by the controller.
     * It will manipulate the data, and return it to the view, which
     * will be the one that will show it to the user.
     */
    public void listAllStudents() {

    }

    /**
     * Method for listing all students in a group.
     * This method will be called by the controller.
     * It will manipulate the data, and return it to the view, which
     * will be the one that will show it to the user.
     *
     * @param group to be searched
     */
    public void listAllStudentsInAGroup(Group group) {

    }

    /**
     * Method for creating a new student.
     * This method will be called by the controller.
     * It will manipulate the data, and return it to the view, which
     * will be the one that will show it to the user.
     *
     * @param student to add
     */
    public void createNewStudent(Student student) {

    }

    /**
     * Method for modifying a existing student.
     * This method will be called by the controller.
     * It will manipulate the data, and return it to the view, which
     * will be the one that will show it to the user.
     *
     * @param student to add
     */
    public void modifyStudent(Student student) {

    }

    /**
     * Method for removing a existing student.
     * This method will be called by the controller.
     * It will manipulate the data, and return it to the view, which
     * will be the one that will show it to the user.
     *
     * @param student to add
     */
    public void deleteStudent(Student student) {

    }

    /**
     * Method for enrolling a existing student in a group.
     * This method will be called by the controller.
     * It will manipulate the data, and return it to the view, which
     * will be the one that will show it to the user.
     *
     * @param student to enroll
     * @param group where we'll add the student
     */
    public void enrollStudentInGroup(Student student, Group group) {

    }

    /**
     * Method for unenrolling a existing student from a group.
     * This method will be called by the controller.
     * It will manipulate the data, and return it to the view, which
     * will be the one that will show it to the user.
     *
     * @param student to unenroll
     * @param group where we will unenroll student from
     */
    public void unEnrollStudentInGroup(Student student, Group group) {

    }

}
