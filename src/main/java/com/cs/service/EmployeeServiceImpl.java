package com.cs.service;

import com.cs.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getEmployees() {
        // This is for demo purpose only, ideally this data should come from a data-source.
        return Arrays.asList(new Employee[]{new Employee(1, "Bob", "Marley"),
                new Employee(2, "Cindy", "Breakspeare"),
                new Employee(3, "Tom", "Finson"),
                new Employee(4, "Rupert", "Bent")});
    }
}
