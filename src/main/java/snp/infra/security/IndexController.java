package snp.infra.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <br/>개정이력<br/>
 */
@Controller
public class IndexController {
    @RequestMapping(value={"/", "/index", "/app/*", "/app/*/*", "/app/*/*/*"})
    public String userId() {
        if (Security.userId() == null){
            return "/login.html";
        }else if(Security.userId().equals("self")) {
        	return "/selfmain.html";
        }else{ 	
            return "/main.html";
        }
    }
}
