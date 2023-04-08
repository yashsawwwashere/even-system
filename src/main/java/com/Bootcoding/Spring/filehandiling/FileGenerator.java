package com.Bootcoding.Spring.filehandiling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class FileGenerator {

    @Value("${input.file.path}")
    String path;

    @Autowired
    DataWriter dataWriter;


    public void generateFile(){
        File file = new File(path);
        FileWriter fileWriter;
        try {
            if (file.exists()) {
                fileWriter = new FileWriter(file, true); // append data to the existing file

                List<Patient>list =setData();
                for(int i = 0; i < list.size(); i++) {
                    Patient objectPatient =list.get(i);
                    fileWriter.write(objectPatient.getName()+","+objectPatient.getDateOfAdmission()+","+objectPatient.getDisease()+","+objectPatient.getDischargeDate()+","+objectPatient.getBill()+"\n");
                }
            } else {
                file.createNewFile(); // create a new file
                fileWriter = new FileWriter(file);
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List setData() {

        List<Patient> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            Patient patient = new Patient();
            patient.setName(dataWriter.nameGenerator());
            patient.setDateOfAdmission(dataWriter.randomDateGenerator() + dataWriter.randomMonthGenerator() + dataWriter.randomYearGenerator());
            patient.setDisease(dataWriter.diseaseGenerator());
            patient.setDischargeDate(dataWriter.randomDateGenerator() + dataWriter.randomMonthGenerator() + dataWriter.randomYearGenerator());
            patient.setBill(dataWriter.randomBillGenerator());
            list.add(patient);
        }
        return list;
    }

}
