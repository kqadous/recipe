package hero.spring5framework.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"" , "/" , "/index" , "/index.html"})
    public String goIndex() {
        return "index";
    }
}
