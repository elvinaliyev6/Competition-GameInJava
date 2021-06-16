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
    REGISTER(1, "Register Competitors"),
    START(2, "Start competition"),
    LOGOUT(3, "log out"),
    EXIT(4, "exit");

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
