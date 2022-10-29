package updatePro;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	public static int id;
	
	@RequestMapping("/search")
	public ModelAndView search(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		id=Integer.parseInt(request.getParameter("eid"));
		User u=ac.getBean(User.class);
		UserDao udao=ac.getBean(UserDao.class);
		//User u1=udao.getByUserid(id);
		List<User> elist=udao.getalluser();
		System.out.println(elist);
		mv.setViewName("display.jsp");
		mv.addObject("list", elist);
		mv.addObject("i", id);
		
		return mv;

	
	}
	
	
	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		User e=ac.getBean(User.class);
		UserDao edao=ac.getBean(UserDao.class);
		
		e.setUname(request.getParameter("ename"));
		e.setEmail(request.getParameter("eemail"));
		e.setUid(Integer.parseInt(request.getParameter("eid")));
		
	
		int row=edao.update(e);
		if(row>0) {
			mv.setViewName("index.jsp");
	
		}
		
		return mv;

	}
}
		
		