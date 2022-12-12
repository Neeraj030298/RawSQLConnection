package com.example.dpapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class StudentController {
    @Autowired
    DBManager dbManager;

    @PostMapping("/insert_info")
    public void insertinfo(@RequestBody() Student s) throws SQLException {
        dbManager.insert_info(s);
        return;
    }
    @GetMapping("/info")
    public void getInfo() throws SQLException {
        dbManager.getAllStudents();
    }
}
