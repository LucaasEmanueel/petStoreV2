package maps;

import java.util.HashMap;
import java.util.Map;

public class UserMaps {
    private static Map<String, Object> usuario;
    private static Map<String, String> usuarioInvalido;
    public static Map<String, Object> getUsuario() {return usuario;}
    public static Map<String, String> getUsuarioInvalido() {return usuarioInvalido;}

    public static void initUser(){
        usuario = new HashMap<>();
    }

    public static void initUserInvalido(){
        usuarioInvalido = new HashMap<>();
    }



}
