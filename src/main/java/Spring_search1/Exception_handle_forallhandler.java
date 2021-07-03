package Spring_search1;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice // this annotation for all handler class
public class Exception_handle_forallhandler
{

	
	@ExceptionHandler(NullPointerException.class)
	public  String exceptionhandlernull(Model model)
	{
		model.addAttribute("msg" ,"nullpoint exception ocuured");
		return "nullpage";
		
	}
	//its for all exception
	@ExceptionHandler(Exception.class)
	public  String exceptionhandlgeneric(Model model)
	{
		System.out.println("this is exception page");
		model.addAttribute("msg" ,"nullpoint exception ocuured");
		model.addAttribute("msg2" , "this is generic exception handler method");
		return "nullpage";
		
	}
}
