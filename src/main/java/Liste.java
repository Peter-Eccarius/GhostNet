import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.text.SimpleDateFormat;
import java.text.ParseException;

@Named
@SessionScoped
public class Liste implements Serializable
{
    private List<Net> netze = new ArrayList<Net>();

    public Liste() throws ParseException
    {    
        netze.add(new Net("XL", "gemeldet", "Peter", "Längengrad1", "Breitengrad1"));
        netze.add(new Net("S", "Bergung bevorstehend", "Jens", "Längengrad2", "Breitengrad2"));
        netze.add(new Net("XS", "verschollen", "", "Längengrad3", "Breitengrad3"));
    }

    public List<Net> getListe()
    {
        return netze;
    }
}