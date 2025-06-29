import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;
import java.util.ResourceBundle;

@FacesValidator()
public class LonValidator implements Validator<Double> {

    // Format: optional -, 1–3 Ziffern vor Punkt, genau ein Punkt, 1–6 Nachkommastellen
    private static final String REGEX = "^-?\\d{1,3}\\.\\d{1,6}$";

    @Override
    public void validate(FacesContext context, UIComponent component, Double value) throws ValidatorException {
        if (value == null) {
            return; // leer ist erlaubt, ggf. mit required separat behandeln
        }

        ResourceBundle bundle = ResourceBundle.getBundle("nachrichten", context.getViewRoot().getLocale());
        String stringValue = String.valueOf(value);

        if (!stringValue.matches(REGEX)) {
            throw new ValidatorException(new FacesMessage(
                FacesMessage.SEVERITY_ERROR,
                bundle.getString("lon.invalid.format"),
                null
            ));
        }

        if (value < -180.0 || value > 180.0) {
            throw new ValidatorException(new FacesMessage(
                FacesMessage.SEVERITY_ERROR,
                bundle.getString("lon.invalid.range"),
                null
            ));
        }
    }
}