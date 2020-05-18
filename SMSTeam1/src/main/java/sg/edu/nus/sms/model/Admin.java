package sg.edu.nus.sms.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
@DiscriminatorValue("ADM")
public class Admin extends User{

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(@NotEmpty String userName, String passWord, boolean active) {
		super(userName, passWord, active);
		this.setRoles("ROLE_ADMIN");
		this.setPassWord("1");
	}
	

}
