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
}