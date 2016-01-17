package org.kelley.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tkelley on 1/17/2016.
 */

@Controller
public class RootController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}


