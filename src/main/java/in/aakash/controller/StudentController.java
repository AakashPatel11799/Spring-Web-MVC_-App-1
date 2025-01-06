package in.aakash.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.aakash.binding.Student;
import in.aakash.entity.StudentEntity;
import in.aakash.repository.StudentEntityRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentEntityRepository studentRepo;

	// method to load student registration form

	@GetMapping("/")
	public String loadRegistrationForm(Model model) {
		loadFormData(model);
		return "register";
	}

	// load form data extract method
	private void loadFormData(Model model) {
		List<String> courseList = new ArrayList<>();
		courseList.add("Java");
		courseList.add("SBMS");
		courseList.add("Python");
		courseList.add("React");
		courseList.add("AWS");

		List<String> timingsList = new ArrayList<>();
		timingsList.add("Morning");
		timingsList.add("Afternoon");
		timingsList.add("Evening");

		model.addAttribute("courses", courseList);
		model.addAttribute("timings", timingsList);

		Student stud = new Student();
		model.addAttribute("student", stud);
	}

	// method to save student data in database table.

	@PostMapping("/save")
	public String handleSubmit(Student student, Model model) {
		//System.out.println(student);

		                   							
		StudentEntity studentEntity = new StudentEntity();
		
		// copy data from binding class object to entity class object
		// BeanUtils.copyProperties(source, target)
		BeanUtils.copyProperties(student, studentEntity);
		
		//convert string array timings to string 
		//String greet = Arrays.toString(student.getTimings());
		//System.out.println(greet);
		studentEntity.setTimings(Arrays.toString(student.getTimings()));

		// save into database table
		studentRepo.save(studentEntity);

		model.addAttribute("msg", "Data Saved");

		loadFormData(model);

		return "register";
	}

	// method to display registered student data
}
