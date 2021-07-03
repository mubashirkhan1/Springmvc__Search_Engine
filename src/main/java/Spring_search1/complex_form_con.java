package Spring_search1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class complex_form_con 
{   
	@RequestMapping("/complex1")
	public String complex()
	{
		// jaan ke excepyion laya q ki page chalan tha exception wala
		String name =null;
		System.out.println(name.length());
		String name1="mubashirkhan";
		Integer.parseInt(name);
//		
		System.out.println("complex form is running");
		return "complex";
		
	}
	@RequestMapping(path="/handleform", method= RequestMethod.POST)
	public String handleform(@ModelAttribute("student1" )Student1 student1 , BindingResult biresult)
//		@RequestParam("name") String name1,
//		@RequestParam("id") Long id,
//		@RequestParam("dob") String dob,
//		@RequestParam("courses") String courses
		
			
	{
		
		if(biresult.hasErrors())
		{
			return"complex";
		}
		System.out.println(student1.getAddress());
		System.out.println(student1);
		return "Success2";
		
	}
	//handlng exception onlu ull point exception
//	@ExceptionHandler(NullPointerException.class)
//	public  String exceptionhandlernull(Model model)
//	{
//		model.addAttribute("msg" ,"nullpoint exception ocuured");
//		return "nullpage";
//		
//	}
//	//its for all exception
//	@ExceptionHandler(Exception.class)
//	public  String exceptionhandlgeneric(Model model)
//	{
//		System.out.println("this is exception page");
//		model.addAttribute("msg" ,"nullpoint exception ocuured");
//		model.addAttribute("msg2" , "this is generic exception handler method");
//		return "nullpage";
//		
//	}
}
