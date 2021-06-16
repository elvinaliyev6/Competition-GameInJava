/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Config;
import bean.Competitor;
import static bean.Config.competitors;
import java.util.Scanner;

/**
 *
 * @author Elvin Aliyev
 */
public class MenuRegisterService extends MenuService {

    public Competitor[] register() {

        System.out.println("How many competitors will participate in the competition?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Config.competitors = new Competitor[n];
        String name;
        String surname;
        for (int i = 0; i < competitors.length; i++) {
            sc = new Scanner(System.in);
            System.out.println("Enter a name:");
            name = sc.nextLine();
            System.out.println("Enter a surname:");
            surname = sc.nextLine();
            Competitor c = new Competitor(name, surname);
            competitors[i] = c;
        }
        System.out.println("Competitors have been registered successfully!");
        return competitors;
    }

   @Override
    public void process() {
        Competitor[] arr = register();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

}
