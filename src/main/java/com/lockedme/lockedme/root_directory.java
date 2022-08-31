package com.lockedme.lockedme;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Dell
 */
public class root_directory {

    String dir = "C:\\Users\\Dell\\OneDrive\\Desktop\\prac\\myDir";

    public void dir() {
File folder = new File(dir);
            if(folder.isDirectory())
            {
                File[] fileList = folder.listFiles();

                Arrays.sort(fileList);

                System.out.println("Total number of items present in the directory: " + fileList.length );

                for(File file:fileList)
                {
                    file.getName();
                }

                FileFilter fileFilter = new FileFilter()
                {
                    @Override
                    public boolean accept(File file) {
                        return !file.isDirectory();
                    }
                };

                fileList = folder.listFiles(fileFilter);

                Arrays.sort(fileList, new Comparator()
                {
                    @Override
                    public int compare(Object f1, Object f2) {
                        return ((File) f1).getName().compareTo(((File) f2).getName());
                    }
                });
                for(File file:fileList)
                {
                    System.out.println(file.getName());
                    
                }

            } 
        
       
    }
}
