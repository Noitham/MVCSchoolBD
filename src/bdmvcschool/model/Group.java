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
public class Group {

    long id;
    String code;
    String grade;
    int level;

    //Constructor
    public Group(long id, String code, String grade, int level) {
        this.id = id;
        this.code = code;
        this.grade = grade;
        this.level = level;
    }

    //Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCoe() {
        return code;
    }

    public void setCoe(String coe) {
        this.code = coe;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //ToString
    @Override
    public String toString() {
        return "Group{" + "id=" + id
                + ", coe=" + code
                + ", grade=" + grade
                + ", level=" + level
                + '}';
    }

}
