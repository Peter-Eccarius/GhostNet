import jakarta.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import jakarta.inject.Named;

@Named("navigation")
@ApplicationScoped
public class NavigationController implements Serializable
{	
	public NavigationController(){ 
    }
    public String bergerMenu(){
        return "bergerMenu";
    }
    public String bergerLost() {
    	return "bergerLost";
    }
    public String bergerTodo() {
    	return "bergerTodo";
    }
    public String bergerDone() {
    	return "bergerDone";
    }
    public String bergerLogin() {
    	return "bergerLogin";
    }
    public String melderLost() {
    	return "melderLost";
    }
    public String melderLogin() {
    	return "melderLogin";
    }
    public String melderMenu() {
    	return "melderMenu";
    }    
    public String melderNewNet() {
    	return "melderNewNet";
    }
    public String start() {
    	return "index";
    }
}
