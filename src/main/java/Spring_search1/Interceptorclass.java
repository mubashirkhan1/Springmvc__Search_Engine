package Spring_search1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptorclass extends HandlerInterceptorAdapter
{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception
	{
	  System.out.println("this is pre handler"); //its call before  welcom form
		
		String name= request.getParameter("user");
		    if(	name.startsWith("s"))
		    {
		    	response.setContentType("text/html");
		    	response.getWriter().write("<h1>invalid please do not startt with s<h1>");
		    	return false;
		    }
			  return true;
	
	
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("this is post handler");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("after complitoin");
	
	}
	
	

	
}
