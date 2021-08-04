/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;
import service.MenuLoginService;
import service.MenuRegisterService;
import service.MenuService;
import service.MenuStartService;

/**
 *
 * @author Elvin Aliyev
 */
public enum Menu {
    REGISTER(1, "Register Contestants"),
    START(2, "Start competing"),
    LOGOUT(3, "Logout"),
    EXIT(4, "Exit");

    private int number;
    private String label;

    Menu(int number, String label) {
        this.number = number;
        this.label = label;
    }

    @Override
    public String toString() {
        return number + " " + label;
    }

    

}
