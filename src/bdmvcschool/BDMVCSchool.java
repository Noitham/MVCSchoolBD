/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdmvcschool;

import bdmvcschool.control.Controller;
import bdmvcschool.model.Model;

/**
 *
 * @author dmora
 */
public class BDMVCSchool {

    public static void main(String[] args) {
        Model model = new Model();
        Controller control = new Controller(model);
    }

}
