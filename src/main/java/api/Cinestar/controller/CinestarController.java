package api.Cinestar.controller;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
@CrossOrigin
@Controller
@RequestMapping




public class CinestarController  extends WebMvcAutoConfiguration {
	
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
	
    @GetMapping("/index")
    public String cine() {
	return "pelicula";
     }


}
