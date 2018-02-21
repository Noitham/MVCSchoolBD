package bdmvcschool.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import bdmvcschool.EventMessage;
import bdmvcschool.control.Controller;
import bdmvcschool.model.Group;
import bdmvcschool.model.Model;
import bdmvcschool.model.Student;

public class View implements Observer {

    private Controller control;
    private Model model;
    private Menu menu;

    private boolean exit;

//    private List<Article> data;
//    private Article datum;
    public View(Controller control, Model model) {
        this.control = control;
        this.model = model;
        this.model.addObserver(this);
        menu = buildMenu();
        doControl();
    }

    @Override
    public void update(Observable source, Object obj) {
        if (obj instanceof EventMessage) {
            EventMessage evm = (EventMessage) obj;
            switch (evm.getAction()) {
                case INSERT:
                    if (evm.getType() == EventMessage.EventType.OK) {
                        alert("Successfull insertion: " + evm.getData().toString() + "\n");
                    } else {
                        alert("Error in insertion: " + evm.getData().toString() + "\n");
                    }
                    break;
                case FIND_MULTIPLE:
                    if (evm.getType() == EventMessage.EventType.OK) {
                        displayList((List) evm.getData());
                    } else {
                        alert("Error searching " + evm.getData().toString() + "\n");
                    }
                    break;
                case REMOVE:
                    if (evm.getType() == EventMessage.EventType.OK) {
                        alert("Successfull removed: " + evm.getData().toString() + "\n");
                    } else {
                        alert("Error removing: " + evm.getData().toString() + "\n");
                    }
                    break;
                case UPDATE:
                    if (evm.getType() == EventMessage.EventType.OK) {
                        alert("Successfull updated: " + evm.getData().toString() + "\n");
                    } else {
                        alert("Error updating: " + evm.getData().toString() + "\n");
                    }
                    break;
                default:
                    alert("Unknown error\n");
                    break;
            }
        }
    }

    private Menu buildMenu() {
        Menu mnu = new Menu("Menu");
        mnu.add(new Option("Exit"));
        mnu.add(new Option("List groups"));
        mnu.add(new Option("Add group"));
        mnu.add(new Option("Modify group"));
        mnu.add(new Option("Delete group"));
        mnu.add(new Option("List all students"));
        mnu.add(new Option("List students of a group"));
        mnu.add(new Option("Add student"));
        mnu.add(new Option("Modify student"));
        mnu.add(new Option("Delete student"));
        mnu.add(new Option("Enroll student in a group"));
        mnu.add(new Option("Unenroll student from a group"));
        return mnu;
    }

    private void doControl() {
        boolean exit = false;
        do {
            menu.show();
            int optNumber = menu.choose();
            switch (optNumber) {
                case 0: // Exit
                    exit = true;
                    break;
                case 1: // List groups
                    break;
                case 2: // Add group
                    break;
                case 3: // Modify group
                    break;
                case 4: // Delete group
                    break;
                case 5: // List all students
                    break;
                case 6: // List students of a group
                    break;
                case 7: // Add student
                    break;
                case 8: // Modify student
                    break;
                case 9: // Delete student
                    break;
                case 10: // Enroll student in a group
                    break;
                case 11: // Unenroll student from a group
                    break;
                default:
                    break;
            }

        } while (!exit);
        System.exit(0);
    }

    private void alert(String s) {
        System.out.print(s);
    }

    private void displayList(List lst) {
        for (Object o : lst) {
            System.out.println(o.toString());
        }
    }

    private String inputString(String msg) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        alert(msg);
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * List all groups
     * 
     * uses {@link bdmvcschool.control.Controller#listAllGroups() }
     * 
     */
    public void listAllGroups() {
        control.listAllGroups();
    }

    /**
     * Method that will ask user the needed data for creating a new group. We
     * will comprove that a group with the given id doesn't exists. If it does,
     * we will show error. If it doesn't, we will send the data to the
     * controller. Which will use model for creating the new group.
     * 
     * uses {@link bdmvcschool.control.Controller#createNewGroup(bdmvcschool.model.Group) }
     * 
     */
    public void createNewGroup() {
        //model.createNewGroup(group);
    }

    /**
     * Method that will ask user the id of the group to modify. If the group
     * exists, we will show it. If not, we will show error message. We will ask
     * for user for confirmation. If confirm, we will send the data to the
     * controller. Which will use the model for modifying the group.
     * 
     * uses {@link bdmvcschool.control.Controller#modifyGroup(bdmvcschool.model.Group) }
     * 
     */
    public void modifyGroup() {
        //model.modifyGroup(group);
    }

    /**
     * Method that will ask user the id of the group to delete. If the group
     * exists, we will show it. If not, we will show error message. We will ask
     * for user for confirmation. If confirm, we will send the data to the
     * controller. Which will use the model for removing the group.
     * 
     * uses {@link bdmvcschool.control.Controller#deleteGroup(bdmvcschool.model.Group) }
     * 
     */
    public void deleteGroup() {
        //model.deleteGroup(id);
    }

    /**
     * List all students
     * 
     * uses {@link bdmvcschool.control.Controller#listAllStudents() }
     * 
     */
    public void listAllStudents() {
        //model.listAllStudents();
    }

    /**
     * Method that will ask user the id of the group to show(its students). If a
     * group with the given id exists, we will show it. If not, we will show
     * error message. We will ask for user for confirmation. If confirm, we will
     * send the data to the controller. Which will use the model for modifying
     * the student.
     * 
     * uses {@link bdmvcschool.control.Controller#listAllStudentsInAGroup(bdmvcschool.model.Group) }
     * 
     */
    public void listAllStudentsInAGroup() {
        //model.listAllStudentsInAGroup(id);
    }

    /**
     * Method that will ask user the needed data for creating a new student. We
     * will comprove that a student with the given id doesn't exists. If it
     * does, we will show error, if it doesn't, we will send the data to the
     * controller. Which will use model for creating the new student.
     * 
     * uses {@link bdmvcschool.control.Controller#createNewStudent(bdmvcschool.model.Student) }
     * 
     */
    public void createNewStudent() {
        //model.createNewStudent();
    }

    /**
     * Method that will ask user the id of the student to modify. If the student
     * exists, we will show it. If not, we will show error message. We will ask
     * for user for confirmation. If confirm, we will send the data to the
     * controller. Which will use the model for modifying the student.
     * 
     * uses {@link bdmvcschool.control.Controller#modifyStudent(bdmvcschool.model.Student) }
     * 
     */
    public void modifyStudent() {
        //model.modifyStudent(student);
    }

    /**
     * Method that will ask user the id of the student to delete. If the student
     * exists, we will show it. If not, we will show error message. We will ask
     * for user for confirmation. If confirm, we will send the data to the
     * controller. Which will use the model for removing the student.
     * 
     * uses {@link bdmvcschool.control.Controller#deleteStudent(bdmvcschool.model.Student) }
     * 
     */
    public void deleteStudent() {
        //model.deleteStudent(student);
    }

    /**
     * Method that will ask user the id of the student to enroll into a group.
     * If the student exists, we will show it. If not, we will show error
     * message. We will ask for user for confirmation. If confirm, we will send
     * the data to the controller. Which will use model for enrolling the
     * student to the group.
     * 
     * uses {@link bdmvcschool.control.Controller#enrollStudentInGroup(bdmvcschool.model.Student, bdmvcschool.model.Group) }
     * 
     */
    public void enrollStudentInGroup() {
        //model.enrollStudentInGroup(student);
    }

    /**
     * Method that will ask user the id of the student to unenroll from a group.
     * If the student exists, we will show it. If not, we will show error
     * message. We will ask for user for confirmation. If confirm, we will send
     * the data to the controller. Which will use model for unenrolling the
     * student to the group.
     * 
     * uses {@link bdmvcschool.control.Controller#unEnrollStudentInGroup(bdmvcschool.model.Student, bdmvcschool.model.Group) }
     * 
     */
    public void unEnrollStudentInGroup() {
        //model.unEnrollStudentInGroup(student);
    }

    public void studentForm() {

    }

    public void groupForm() {

    }

}
