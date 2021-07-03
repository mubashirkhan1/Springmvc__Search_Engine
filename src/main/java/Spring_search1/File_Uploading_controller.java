package Spring_search1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class File_Uploading_controller
{
	@RequestMapping("/fileform")
public String fileupload()
{
	return "fileform";
	
}
	@RequestMapping(path = "/imagehandler" , method =RequestMethod.POST)
	public String imagehandle(@RequestParam("fil1") CommonsMultipartFile file , HttpSession session,Model model)
	
	{
		System.out.println(file.getName());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getName());
		System.out.println("file handle methos calling");
		byte[] data= file.getBytes();
		//save this file to server
		String path=	session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+ file.getOriginalFilename() ;// we create hhtpsession obj because we need contaxt obj because contex have getrealpathmethod
		System.out.println(data);
		System.out.println(path); 
		try 
		{
			FileOutputStream fio= new FileOutputStream(path);
			fio.write(data);
			fio.close();
			System.out.println("file uploade");
			model.addAttribute("msg","file successfully uploaded");
			model.addAttribute("iname" +file.getOriginalFilename());
		} 
		catch (Exception e)
		{

          System.out.println("uploading error");
			e.printStackTrace();
		}
	
	
	return "imagedone";
		
		
	}
}
