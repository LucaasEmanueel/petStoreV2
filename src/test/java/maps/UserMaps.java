package maps;

import java.util.HashMap;
import java.util.Map;

public class UserMaps {
    private static Map<String, Object> usuario;

    public static Map<String, Object> getUsuario() {return usuario;}

    public static void initUser(){
        usuario = new HashMap<>();
        usuario.put("id", 99);
        usuario.put("username", "lucasTesteAuto");
        usuario.put("firstName", "Lucaas");
        usuario.put("lastName", "Emanueel");
        usuario.put("email", "lucas.teste@email.com");
        usuario.put("password", "7010");
        usuario.put("phone", "222-222");
        usuario.put("userStatus", 89);


    }





}
