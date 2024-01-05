package org.example.lury;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ApplicationController {

    @GetMapping("/getDocument")
    public String test(@RequestBody Object testDTO) {
        return "/documentation.html";
    }
}
