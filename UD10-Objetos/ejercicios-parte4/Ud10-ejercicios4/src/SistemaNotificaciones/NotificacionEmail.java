package SistemaNotificaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotificacionEmail extends Notificacion{
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Correo enviado al email: " + email);
    }

    public boolean validarEmail(String email){
        String regex = "^\\w[^@%$#]+@\\w[^@%$#]+\\.[a-zA-Z]{2,}$";
        Pattern patron = Pattern.compile(regex);
        Matcher matcher = patron.matcher(email);

        return matcher.matches();
    }
}