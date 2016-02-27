package info.davidcalleja.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/")
    public String hello() {
    	return "Spring Boot!";
    }

	/**
	 * Controller de ejemplo para Spring Boot y además de ello, para realizar
	 * expresiones lambda.
	 * 
	 * <b>
	 * 	Ejemplo de llamada:
	 * 	http://localhost:8080/lambda/"Sara","David","Titin",
	 * </b>
	 * 
	 * @param list de elementos string
	 * @param calcula numero impar segun su posicion
	 * @return resultado en forma de saludo :)
	 */
    @RequestMapping("/lambda/{list}")
    public String lambda(@PathVariable("list") List<String> list) {
    	StringBuilder sb = new StringBuilder();
    	list.forEach((name) -> addGretting(name, sb)); // LAMBDA EXPRESION!! :)
    	
    	return sb.toString();
    }
    
	private void addGretting(String name, StringBuilder sb) {
		sb.append("<h1>Hello ").append(name).append(", you are welcome :)</h1>");
	}

}