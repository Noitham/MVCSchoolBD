/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdmvcschool.control;

import bdmvcschool.model.Student;
import bdmvcschool.model.Group;
import bdmvcschool.model.Model;
import bdmvcschool.view.View;

/**
 *
 * @author dmora
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model) {
        this.model = model;
        this.view = new View(this, model);
    }

    /**
     * Method calling Model method for listing all groups.
     *
     * uses {@link bdmvcschool.model.Model#listAllGroups() }
     *
     */
    public void listAllGroups() {
        model.listAllGroups();
    }

    /**
     * Method calling Model method for creating a new group.
     *
     * uses {@link bdmvcschool.model.Model#createNewGroup(bdmvcschool.model.Group)
     * }
     *
     * @param group to add
     *
     */
    public void createNewGroup(Group group) {
        model.createNewGroup(group);
    }

    /**
     * Method calling Model method for modifying a existing group.
     *
     * uses {@link bdmvcschool.model.Model#modifyGroup(bdmvcschool.model.Group)
     * }
     *
     * @param group to modify
     */
    public void modifyGroup(Group group) {
        model.modifyGroup(group);
    }

    /**
     * Method calling Model method for removing a existing group.
     *
     * uses {@link bdmvcschool.model.Model#deleteGroup(bdmvcschool.model.Group)
     * }
     *
     *
     * @param group to be modified
     */
    public void deleteGroup(Group group) {
        model.deleteGroup(group);
    }

    /**
     * Method calling Model method listing all students.
     *
     * uses {@link bdmvcschool.model.Model#listAllStudents() }
     */
    public void listAllStudents() {
        model.listAllStudents();
    }

    /**
     * Method calling Model method for listing all students in a group.
     *
     * uses {@link bdmvcschool.model.Model#listAllStudentsInAGroup(bdmvcschool.model.Group)
     * }
     *
     * @param group to be searched
     */
    public void listAllStudentsInAGroup(Group group) {
        model.listAllStudentsInAGroup(group);
    }

    /**
     * Method calling Model method for creating a new student.
     *
     * uses {@link bdmvcschool.model.Model#createNewStudent(bdmvcschool.model.Student)
     * }
     *
     * @param student to add
     */
    public void createNewStudent(Student student) {
        model.createNewStudent(student);
    }

    /**
     * Method calling Model method for modifying a existing student.
     *
     * uses {@link bdmvcschool.model.Model#modifyStudent(bdmvcschool.model.Student)
     * }
     *
     * @param student to add
     */
    public void modifyStudent(Student student) {
        model.modifyStudent(student);
    }

    /**
     * Method calling Model method for removing a existing student.
     *
     * uses {@link bdmvcschool.model.Model#deleteStudent(bdmvcschool.model.Student)
     * }
     *
     * @param student to add
     */
    public void deleteStudent(Student student) {
        model.deleteStudent(student);
    }

    /**
     * Method calling Model method for enrolling a existing student in a group.
     *
     * uses {@link bdmvcschool.model.Model#enrollStudentInGroup(bdmvcschool.model.Student, bdmvcschool.model.Group)
     * }
     *
     * @param student to add
     * @param group where we'll add the student
     */
    public void enrollStudentInGroup(Student student, Group group) {
        model.enrollStudentInGroup(student, group);
    }

    /**
     * Method calling Model method for unenrolling a existing student from a
     * group.
     *
     * uses {@link bdmvcschool.model.Model#unEnrollStudentInGroup(bdmvcschool.model.Student, bdmvcschool.model.Group)
     * }
     *
     * @param student to add
     * @param group where we'll add the student
     */
    public void unEnrollStudentInGroup(Student student, Group group) {
        model.unEnrollStudentInGroup(student, group);
    }
    
    
    /**
     * Search group by code.
     * @param id 
     */
    public void searchGroupById(String id) {

    }

}
