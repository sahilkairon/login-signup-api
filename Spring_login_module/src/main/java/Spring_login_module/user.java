package Spring_login_module;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user {
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String status;
	
	
	public user() {}
	
	public user(int id, String username, String password, String firstname, String lastname, String status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
//	@Override    
//	public boolean equals(Object o) {
//		user j = (user)o;
//		if(this.username == j.username && this.password == j.password) {
//			return true;
//		}else return false;
//	
//		}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof user)) return false;
        user k  = (user) o;
        return Objects.equals(username, k.username) &&
                Objects.equals(password, k.password);
    }

	
	@Override
	public int hashCode() {
		return Objects.hash(id, username, password);
	}
	
	@Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password ; };
    
	
	
}
