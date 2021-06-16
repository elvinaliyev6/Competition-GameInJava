/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Config;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Elvin Aliyev
 */
public class MenuStartService extends MenuService {

    @Override
    public void process() {
        
            Random random = new Random();
            int number = random.nextInt(1000) + 1;
           System.out.println("Who is the chosen partcipant?");
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();
            if (answer == number) {
                System.out.println("Congratulations you won!");
            } else {
                System.out.println("You failed");
            }
    }

}
