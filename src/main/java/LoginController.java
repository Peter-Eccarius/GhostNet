import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.component.UIInput;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.ComponentSystemEvent;
import jakarta.faces.validator.ValidatorException;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("login")
@ViewScoped
public class LoginController implements Serializable {

	String name;
	String telnr;

	public String loginMelder() {
		User user = new User(name, telnr);
		if (user.fullLogin())
			return "menu";
		else if (user.anonymLogin())
			return "newNet";
		else
			return "fehler";		
	}
	
	public String loginBerger() {
		User user = new User(name, telnr);
		if (user.fullLogin())
			return "fullMenu";
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
