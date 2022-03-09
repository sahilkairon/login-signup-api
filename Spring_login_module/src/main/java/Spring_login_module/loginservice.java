package Spring_login_module;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginservice {
	
	@Autowired
	public loginrepo r;
	
	public enum Status {
	    SUCCESS,
	    USER_ALREADY_EXISTS,
	    FAILURE
	}
	
	public void  authentication(user u ) {
		
		List<user> users = (List<user>) r.findAll();
		for(user x : users) {
			if(x.equals(u)) {
				 System.out.println("logged in");
				 
				 
			}else {
				System.out.println("not logged in");
			}
			
			 
		}
		 
			}
	
	
	public void setuser(user u) {
		r.save(u);
	}
	
	

}
