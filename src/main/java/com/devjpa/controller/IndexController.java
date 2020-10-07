
package com.devjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author hallef.bruno
 */
@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String paginaIndex() {
        return "Index";
    }
    
}
