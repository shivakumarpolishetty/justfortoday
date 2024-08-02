package com.example.demo;

import com.example.demo.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private StudentDao studentDao;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

    /*
   this.studentDao.createTable();
	*/
		//this.studentDao.insertData("shiva", "hyderabad");
		//this.studentDao.insertData("ravi","usa");
		this.studentDao.insertData("kumar","texas");
		this.studentDao.insertData("PSk","hyderabad");
	}
}