import java.util.ResourceBundle;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

@FacesValidator()
public class TelValidator implements Validator<String> {

    private static final String REGEX = "0\\d{6,14}";

    @Override
    public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
        if (value == null || value.trim().isEmpty()) {
            return;
        }

        if (!value.matches(REGEX)) {
            ResourceBundle bundle = ResourceBundle.getBundle("nachrichten", context.getViewRoot().getLocale());
            String msg = bundle.getString("tel.invalid");
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, null));
        }
    }
}