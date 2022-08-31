/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lockedme.lockedme;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class add_dir {
    String dir = "C:\\Users\\Dell\\OneDrive\\Desktop\\prac\\myDir\\";
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.err.print("Please Enter File Name:");
        String dir_name = sc.next();
            File file = new File(dir+dir_name);

    try {

      boolean value = file.createNewFile();
      if (value) {
        System.out.println("New File is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
    }
}
