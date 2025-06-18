import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import jakarta.inject.Named;

@Named("navigation")
@SessionScoped
public class NavigationController implements Serializable
{	
	public NavigationController(){ 
    }

    public String weiter(){
        return "meldung";
    }
    
    public String zurueck(){
        return "index";
    }
    public String editPerson() {
    	return "editPerson";
    }
    
    public String newNet() {
    	return "newNet";
    }
    public String lost() {
    	return "lost";
    }
    
    public String loginAnonym() {
    	return "/login/loginAnonym";
    }
    
    public String loginMelder() {
    	return "loginMelder";
    }
    public String loginBerger() {
    	return "loginBerger";
    }
}
