package dev.vicky.docker.Docker_demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoController {
    @GetMapping("/dockerDemo")
    public String getDemo(){
        return "Spring boot app is dockrized Successfully";
    }
}
