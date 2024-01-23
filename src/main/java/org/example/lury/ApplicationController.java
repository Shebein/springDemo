package org.example.lury;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@Log4j2
public class ApplicationController {

    @RequestMapping(value = "/getDocument", method = RequestMethod.GET)
    public String test() {
        log.info("===================================");
        Object[] aa = new Object[]{"AA"};
        return "/documentation.html";
    }


}
