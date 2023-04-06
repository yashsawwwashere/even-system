package com.Bootcoding.Spring.filehandiling;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class DataWriter {



    public String diseaseGenerator(){
        String [] disease = {"Fiver","TB","Cancer","Diabities","DenGue","chickenFox","Sugar","Brain Stock"};

        Random random = new Random();

        return disease[random.nextInt(disease.length)];
    }
    public int randomBillGenerator(){
        int MaxN=100000;
        int MINN=1000;
        Random random = new Random();

        return random.nextInt(MaxN-MINN) + MINN;
    }

    public String nameGenerator(){
        String [] name = {"rav","Komal","suresh","ajay","jayant","khan","jivan","arun","suman","wasim","harshal"};

        Random random = new Random();

        return name[random.nextInt(name.length)];
    }


    public String randomDateGenerator(){

        int MaxN=31;
        int MINN=1;
        Random random = new Random();
        return String.valueOf(random.nextInt(MaxN-MINN)+MINN)+"-";
    }

    public String randomMonthGenerator(){
        String [] month={"01","02","03","04","05","06","07","08","09","10","11","12"};
        Random random = new Random();

        return month[random.nextInt(month.length)]+"-";
    }

    public String randomYearGenerator(){
        return "2023";
    }
}
