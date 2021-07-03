package Spring_search1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Pathvariable_controller
{
	@RequestMapping("/pathvar/{userid}/{username}")
	 public String pathvariable(@PathVariable("userid") int uid  ,@PathVariable("username") String username)
	 {
		System.out.println(uid);
		System.out.println(username);
		return "home";
		 
		 
	 }
}
