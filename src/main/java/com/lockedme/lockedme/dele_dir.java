/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lockedme.lockedme;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class dele_dir {

    String dir = "C:\\Users\\Dell\\OneDrive\\Desktop\\prac\\myDir\\";

    public void dele() {
        Scanner sc = new Scanner(System.in);
        System.err.print("Please Enter File Name:");
        String dir_name = sc.next();

        try {
            Files.deleteIfExists(Paths.get(dir+dir_name));
        } catch (NoSuchFileException e) {
            System.out.println(
                    "No such file/directory exists");
        } catch (IOException e) {
            System.out.println("Invalid permissions.");
        }

        System.out.println("Deletion successful.");
    }
}
