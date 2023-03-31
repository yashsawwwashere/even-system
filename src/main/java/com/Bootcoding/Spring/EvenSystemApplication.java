package com.Bootcoding.Spring;

import com.Bootcoding.Spring.College.College;
import com.Bootcoding.Spring.Hospital.Hospital;
import com.Bootcoding.Spring.SwitchBoard.SwitchBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class EvenSystemApplication {
	@Autowired
	private Marker marker;
	@Autowired
	private Hospital hospital;
	@Autowired
	private College college;
	@Autowired
	private SwitchBoard switchBoard;

	public static void main(String[] args) {
		SpringApplication.run(EvenSystemApplication.class, args);
	}

}
