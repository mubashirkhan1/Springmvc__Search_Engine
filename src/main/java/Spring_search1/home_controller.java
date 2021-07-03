package Spring_search1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class home_controller 
{
	@RequestMapping("/home1")
	public String home()
	{
		System.out.println("first home controller ruunnin ");
		return "home";
	}
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("runquery") String qu) {
		
		RedirectView rdv=new RedirectView();//creatin object of redirect view for redirecy b pae
		rdv.setUrl("https://www.google.com/search?q="+qu);
		return rdv;
		
		
	}

}
