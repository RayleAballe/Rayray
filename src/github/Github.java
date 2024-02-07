/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World" ); 
        int a = 1;
        System.out.println(a);
               Scanner scn = new Scanner(System.in);
               System.out.println("Name nako?: ");
               String name = scn.nextLine();
               
               System.out.println("Akoang name kay:" + name);
    }
    
}
