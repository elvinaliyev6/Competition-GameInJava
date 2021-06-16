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
public class MenuUtil {
    public static void login(){
        MenuLoginService m=new MenuLoginService();
        m.process();
    }
    
    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            System.out.println(menus[i]);
        }
    }

    public static void showMenu() {
        showAllMenu();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1) {
            MenuService m = new MenuRegisterService();
            m.process();
            showMenu();
        } else if (num == 2) {
            MenuService m = new MenuStartService();
            m.process();
        } else if (num == 3) {
            MenuService m = new MenuLoginService();
            m.process();
        } else if(num==4){
            System.exit(0);
        }

    }
}
