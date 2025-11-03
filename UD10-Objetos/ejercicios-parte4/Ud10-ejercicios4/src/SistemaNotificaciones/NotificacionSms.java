package SistemaNotificaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotificacionSms extends Notificacion{
    private String numeroTelefono;

    @Override
    public void enviar(String mensaje) {
        System.out.println("Mensaje enviado al numero de telefono: " + numeroTelefono);
    }

    public boolean validarTelefono(String telefono){
        String regex = "\\b\\s{3} \\s{2} \\s{2} \\s{2}\\b";
        Pattern patron = Pattern.compile(regex);
        Matcher matcher = patron.matcher(telefono);

        return matcher.matches();
    }
}
