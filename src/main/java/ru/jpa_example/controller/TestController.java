package ru.jpa_example.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.jpa_example.entity.Department;
import ru.jpa_example.entity.Employee;
import ru.jpa_example.entity.Person;
import ru.jpa_example.repo.DepartmentRepo;
import ru.jpa_example.repo.EmployeeRepo;
import ru.jpa_example.repo.PersonRepo;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {

    private final PersonRepo personRepo;
    private final EmployeeRepo employeeRepo;
    private final DepartmentRepo departmentRepo;

    @Operation(summary = "Получить список всех людей")
    @GetMapping("/person/all")
    public List<Person> getPersons() {
        return personRepo.findAll();
    }

    @Operation(summary = "Получить список всех сотрудников")
    @GetMapping("/employee/all")
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @Operation(summary = "Получить список всех департаментов")
    @GetMapping("/department/all")
    public List<Department> getDepartments() {
        return departmentRepo.findAll();
    }

    @PostMapping("/person/save")
    public Person savePerson(@RequestBody Person person) {
        return personRepo.save(person);
    }
}
