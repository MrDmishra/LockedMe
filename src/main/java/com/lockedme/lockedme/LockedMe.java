/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.lockedme.lockedme;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class LockedMe {

    public static void main(String[] args) {
        System.out.println("        FileManager         ");
        System.out.println("        Deepesh Mishra      ");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        firstloop:
        while (true) {
            System.out.println("Please choose option");
            System.out.println("1. Root Directories");
            System.out.println("2. Root Directory Option");
            System.out.println("3. Exit");
            int opt = sc.nextInt();
            if (opt == 1) {
                root_directory root = new root_directory();
                root.dir();
            } else if (opt == 2) {
                secondloop:
                while (true) {
                    System.out.println("Please choose option");
                    System.out.println("1. Add Directories");
                    System.out.println("2. Delete Directory");
                    System.out.println("3. Search Directory");
                    System.out.println("Press any key for Previous Option");
                    int opt1 = sc.nextInt();
                    if (opt1 == 1) {
                        add_dir add = new add_dir();
                        add.add();
                    } else if (opt1 == 2) {
                        dele_dir dele = new dele_dir();
                        dele.dele();
                    } else if (opt1 == 3) {
                        search_dir search = new search_dir();
                        search.search();
                    } else {
                        continue firstloop;
                    }
                }
            } else if (opt == 3) {
                break;
            } else {
                continue firstloop;
            }
        }
    }
}
