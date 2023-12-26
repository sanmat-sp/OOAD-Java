package com.example.jspdemo.controller;

import com.example.jspdemo.model.Student;
import com.example.jspdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class StudentController {

    @Autowired
    StudentService StudentService;

    @GetMapping({"/", "/viewStudentList"})
    public String viewStudentList(@ModelAttribute("message") String message, Model model) {
        model.addAttribute("StudentList", StudentService.getAllStudent());
        model.addAttribute("message", message);

        return "ViewStudentList";
    }

    @GetMapping("/addStudent")
    public String addStudent(@ModelAttribute("message") String message, Model model) {
        model.addAttribute("Student", new Student());
        model.addAttribute("message", message);

        return "AddStudent";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(Student Student, RedirectAttributes redirectAttributes) {
        if (StudentService.saveOrUpdateStudent(Student)) {
            redirectAttributes.addFlashAttribute("message", "Save Success");
            return "redirect:/viewStudentList";
        }

        redirectAttributes.addFlashAttribute("message", "Save Failure");
        return "redirect:/addStudent";
    }

    @GetMapping("/editStudent/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        model.addAttribute("Student", StudentService.getStudentById(id));

        return "EditStudent";
    }

    @PostMapping("/editSaveStudent")
    public String editSaveStudent(Student Student, RedirectAttributes redirectAttributes) {
        if (StudentService.saveOrUpdateStudent(Student)) {
            redirectAttributes.addFlashAttribute("message", "Edit Success");
            return "redirect:/viewStudentList";
        }

        redirectAttributes.addFlashAttribute("message", "Edit Failure");
        return "redirect:/editStudent/" + Student.getId();
    }

    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        if (StudentService.deleteStudent(id)) {
            redirectAttributes.addFlashAttribute("message", "Delete Success");
        } else {
            redirectAttributes.addFlashAttribute("message", "Delete Failure");
        }

        return "redirect:/viewStudentList";
    }

}
