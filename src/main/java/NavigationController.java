import jakarta.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import jakarta.inject.Named;

@Named("navigation")
@ApplicationScoped
public class NavigationController implements Serializable
{	
	public NavigationController(){ 
    }

    public String menu(){
        return "menu";
    }
    
    public String fullMenu(){
        return "fullMenu";
    }
    
    public String newNet() {
    	return "newNet";
    }
    public String lost() {
    	return "lost";
    }
    
    public String todo() {
    	return "todo";
    }
    public String done() {
    	return "done";
    }
    
    public String login() {
    	return "login";
    }
    
    public String loginMelder() {
    	return "loginMelder";
    }
    public String loginBerger() {
    	return "loginBerger";
    }
}
