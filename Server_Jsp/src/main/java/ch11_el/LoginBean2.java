package ch11_el;

import java.io.Serializable;

public class LoginBean2 implements Serializable {
	private static final long serialVersionUID = 155L;
	
	private String id;
	private String passwd;

	public LoginBean2() {
		super();
	}

	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
