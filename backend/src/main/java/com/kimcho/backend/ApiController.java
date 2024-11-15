package com.kimcho.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ApiController {
    @GetMapping("/api/test")
    public List<String> Test() {
        return Arrays.asList("테스트합니다.", "테스트테스트", "테스트테스트22");
    }

}