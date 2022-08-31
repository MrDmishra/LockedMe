/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lockedme.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class search_dir {
    String dir = "C:\\Users\\Dell\\OneDrive\\Desktop\\prac\\myDir\\";
    public void search(){
        try {
            Scanner sc = new Scanner(System.in);
            System.err.print("Please Enter File Name:");
            String dir_name = sc.next();
            File file = new File(dir + dir_name);
            if(file.exists() && file.getCanonicalPath().equals(dir+dir_name)){
                System.err.println("File is Present");
            }else{
                // file is not exist
                System.err.println("File is not Found");
            }       } catch (IOException ex) {
            Logger.getLogger(search_dir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
