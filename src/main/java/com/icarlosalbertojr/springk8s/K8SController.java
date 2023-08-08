package com.icarlosalbertojr.springk8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/k8s")
public class K8SController {

    @GetMapping
    public Map<String, String> test() {
        System.out.println("Hello, K8S!!!");
        return Map.of("test", "running");
    }

}
