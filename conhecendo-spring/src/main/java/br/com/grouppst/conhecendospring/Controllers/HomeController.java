package br.com.grouppst.conhecendospring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

        @RequestMapping (name = "/", method = RequestMethod.GET)
        public String home() {
            return "home1";
        }

        @GetMapping("/modelmap")
        public String home2(ModelMap modelMap) {
            modelMap.addAttribute("nome", "Spring");
            return "home";
        }
     }

