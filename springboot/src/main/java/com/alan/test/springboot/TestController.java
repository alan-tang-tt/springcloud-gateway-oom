package com.alan.test.springboot;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("test")
    public Map<String, Object> test(Map<String, Object> map) {
        Map<String, Object> result = new HashMap<>();
        result.putAll(map);
        result.put("result", "success");
        return result;
    }
}
