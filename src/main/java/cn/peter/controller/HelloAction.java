package cn.peter.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/peter")
public class HelloAction {
	@RequestMapping(value="/helloworld")
	public String helloworld() {
		System.out.println("helloworld");
		return "login";
	}
	
	//@ResponseBody
	@RequestMapping(value="/login"/*,method=RequestMethod.POST*/)
	public String login(@RequestParam(value="username") String name,@RequestParam(value="password") String pwd) {
		System.out.println(name+"==========="+pwd);
		return "success";
	}
	
	@RequestMapping(value="/helloworld/**/user/{id}")
	public String pathVariable(@PathVariable("id") String cid, /*HttpServletRequest request*/ HttpSession session ) {
		/*System.out.println("id:"+cid);
		//request.setAttribute("id", cid);
		session.setAttribute("name",  cid);*/
		return "forward:success";
	}
	
	@RequestMapping(value="/lala")
	public String tosuccess() {
		System.out.println("=======我进来啦======");
		return "success";
	}
	
	/*@RequestMapping(value="/success",method=RequestMethod.POST)
	public String loginCheck() {
		
		return "success";
	}*/
}
