/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Scanner;
import util.MenuUtil;

/**
 *
 * @author Elvin Aliyev
 */
public class MenuLoginService extends MenuService {

    @Override
    public void process() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please login ");
            System.out.println("Enter username");
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();

            System.out.println("enter password");
            sc = new Scanner(System.in);
            String password = sc.nextLine();
            if (!(username.equals("Elvin") && password.equals("12345"))) {
                count++;
            } else {
                System.out.println("Successfully login");
                break;
            }
        }

        if (count == 3) {
            System.out.println("You banned");
            System.exit(0);
        }
        while (true) {
            MenuUtil.showMenu();

        }
    }

}
