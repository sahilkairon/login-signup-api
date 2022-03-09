package Spring_login_module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@Autowired
	public loginservice s;
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public void verifyuser(@RequestBody user u ) {
		s.authentication(u);
	
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/signup")
	public void setuserdata(@RequestBody   user u) {
		s.setuser(u);
	}

}
