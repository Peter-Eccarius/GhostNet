import java.io.Serializable;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("login")
@ViewScoped
public class LoginController implements Serializable {

	String name;
	String telnr;

	public String melderLogin() {
		User user = new User(name, telnr);
		if (user.fullLogin())
			return "melderMenu";
		else if (user.anonymLogin())
			return "anonymNewNet";
		else 
			return "index";
	}
	
	public String bergerLogin() {
		User user = new User(name, telnr);
		if (user.fullLogin())
			return "bergerMenu";
		else 
			return "fehler";		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelnr() {
		return telnr;
	}

	public void setTelnr(String telnr) {
		this.telnr = telnr;
	}
	
}
