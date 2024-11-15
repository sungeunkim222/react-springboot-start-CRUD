package com.kimcho.backend.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Test_tableController {

    @Autowired
    private Test_tableService test_tableService;

    @ResponseBody
    @GetMapping("/test")
    public List<Test_table> test_tableApi() {

        return test_tableService.getTest_tableApi();
    }
}