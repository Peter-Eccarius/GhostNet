import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.text.ParseException;

@Named
@SessionScoped
public class _Liste implements Serializable
{
    private List<Net> netze = new ArrayList<Net>();

    public _Liste() throws ParseException{    
    }

    public List<Net> getListe()
    {
        return netze;
    }
}