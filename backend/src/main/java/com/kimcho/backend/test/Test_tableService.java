package com.kimcho.backend.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test_tableService {
    @Autowired
    private Test_tableRepository test_tableRepository;
    
    public List<Test_table> getTest_tableApi() {

        return test_tableRepository.findAll();
    }
}
