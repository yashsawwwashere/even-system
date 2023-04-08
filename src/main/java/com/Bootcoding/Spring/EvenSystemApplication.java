package com.Bootcoding.Spring;

import com.Bootcoding.Spring.College.College;
import com.Bootcoding.Spring.Hospital.Hospital;
import com.Bootcoding.Spring.SwitchBoard.SwitchBoard;
import com.Bootcoding.Spring.SwitchBoard.ValuesExample;
import com.Bootcoding.Spring.filehandiling.CsvFIleWrite;
import com.Bootcoding.Spring.marker.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class EvenSystemApplication implements ApplicationRunner {
	@Autowired
	CsvFIleWrite csvFIleWrite;
	public static void main(String[] args) {
		SpringApplication.run(EvenSystemApplication.class, args);
	}
	public void run(ApplicationArguments args) throws Exception{
		csvFIleWrite.writeCSV();
	}

}
