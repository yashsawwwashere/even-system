package com.Bootcoding.Spring.filehandiling;

import com.Bootcoding.Spring.filehandiling.FileGenerator;
import com.Bootcoding.Spring.filehandiling.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
@Component
public class CsvFIleWrite {

    @Autowired
    FileGenerator fileGenerator;
    @Value("${path}")
    String path;
    public void writeCSV(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name to create New ");
         path +=scanner.next();

        File file = new File(path);
        FileWriter fileWriter;
        try {
            if (file.exists()) {
                fileWriter = new FileWriter(file, true); // append data to the existing file

                List<Patient> list =fileGenerator.setData();
                for(int i = 0; i < list.size(); i++) {
                    Patient objectPatient =list.get(i);
                    fileWriter.write(objectPatient.getName()+","+objectPatient.getDateOfAdmission()+","+objectPatient.getDisease()+","+objectPatient.getDischargeDate()+","+objectPatient.getBill()+"\n");
                }
            } else {
                file.createNewFile(); // create a new file
                fileWriter = new FileWriter(file);

                List<Patient> list =fileGenerator.setData();
                for(int i = 0; i < list.size(); i++) {
                    Patient objectPatient =list.get(i);
                    fileWriter.write(objectPatient.getName()+","+objectPatient.getDateOfAdmission()+","+objectPatient.getDisease()+","+objectPatient.getDischargeDate()+","+objectPatient.getBill()+"\n");
                }
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public Date generatDate() {
//        Date date = new Date();
//        date.getTime();
//    }

}
