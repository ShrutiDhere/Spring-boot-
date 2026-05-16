package com.Spring;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/html")
	public String firstApi() {
		return "html stand For Hyper text Markup Language...!";
	}

	@PostMapping("/css")
	public String secondApi() {
		return "css stand For Cascading Style Sheet...!";
	}

	@PutMapping("/js")
	public String thirdApi() {
		return "js stand For javascript...!";
	}

	@DeleteMapping("/java")
	public String fourthApi() {
		return "Java is an High Level Language...!";
	}

	@GetMapping("/mysql")
	public String fifthApi() {
		return " MySql is a Relational Database Language...!";
	}

	@DeleteMapping("/deleteEmployee")
	public String deleteEmployee() {
		return "Employee deleted successfully.";
	}

	@PutMapping("/updatePassword")
	public String updatePassword() {
		return "Password updated successfully.";
	}

	@PostMapping("/hibernate")
	public String postHibernate() {
		return "Hibernate is an ORM framework in Java.";
	}

	
	@GetMapping("/api")
	public String getApi() {
		return "API stands for Application Programming Interface.";
	}

	@PostMapping("/json")
	public String postJson() {
		return "JSON stands for JavaScript Object Notation.";
	}

	@PutMapping("/updateCourse")
	public String updateCourse() {
		return "Course updated successfully.";
	}

	@DeleteMapping("/deleteCourse")
	public String deleteCourse() {
		return "Course deleted successfully.";
	}

	@GetMapping("/spring")
	public String getSpring() {
		return "Spring Boot is used to build Java applications quickly.";
	}

	@PostMapping("/backend")
	public String postBackend() {
		return "Backend handles server-side logic and database operations.";
	}

	@PutMapping("/updateEmail")
	public String updateEmail() {
		return "Email updated successfully.";
	}

	@DeleteMapping("/deleteRecord")
	public String deleteRecord() {
		return "Record deleted successfully.";
	}
	
	@GetMapping("/name")
    public String getName() {
        return "Student name is Shruti.";
    }

    @GetMapping("/course")
    public String getCourse() {
        return "Course is Java Full Stack.";
    }
    
    @PostMapping("/login")
    public String loginStudent() {
        return "Student login successful.";
    }

    @PostMapping("/addCourse")
    public String addCourse() {
        return "Course added successfully.";
    }
    
    @PutMapping("/updateAddress")
    public String updateAddress() {
        return "Address updated.";
    }
    
    @DeleteMapping("/removeAccount")
    public String removeAccount() {
        return "Account removed successfully.";
    }

    @DeleteMapping("/removeData")
    public String removeData() {
        return "Data removed successfully.";
    }
    

}
