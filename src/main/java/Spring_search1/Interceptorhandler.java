package Spring_search1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Interceptorhandler
{
	
	
	

	@RequestMapping("/interform")
	public String gointerceptorform() 
	{
		System.out.println("interform is process");
		
		return "intercepter";

	}
	
	@RequestMapping("/welcome")
	public String prossessform(@RequestParam("user") String name ,Model model) 
	{
		System.out.println(name);
		model.addAttribute("name" ,name);
		return "welcominterceptor";

	}
}
