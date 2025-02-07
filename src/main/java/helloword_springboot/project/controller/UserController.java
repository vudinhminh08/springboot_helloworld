package helloword_springboot.project.controller;

import helloword_springboot.project.dto.request.UserRequestDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @PostMapping("/user")
    public String addUser(@RequestBody UserRequestDTO userRequestDTO) {
        return "User Added Successfully";
    }
}
