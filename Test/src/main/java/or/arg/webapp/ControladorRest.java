
package or.arg.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {
   
	
    @GetMapping("/")
   public String inicio(){
       return "Hola Mundo Spring Boot";
   }
}
