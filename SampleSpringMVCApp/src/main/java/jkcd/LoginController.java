package jkcd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	
	@RequestMapping(value="login")
    public String returnLoginPage() {
        return "login"; 
    }
	
	@RequestMapping(value="ProcessLogin")
	@ResponseBody
	public String processLogin(){
		System.out.println("i got the password");
		return "this is login handler";
	}
	
	
	
	/*
	 * 
	 * this below could be used when you dont need 
	 * view resolver and you are given back 
	 * the actual content back to dispatcher 
	 * which sends it back to browser
	 * because we are using @ResponseBody annotation
	 * 
	 */
	
    @RequestMapping(value="NoView")
    @ResponseBody
    public String sayHello() {
        return "This is cool"; 
    }
    
}
