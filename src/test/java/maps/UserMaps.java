package maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMaps {
    private static Map<String, Object> usuario;
    private static Map<String, String> usuarioInvalido;
    private static List<Map<String, Object>> listOfUser;

    public static List<Map<String, Object>> getListOfUser() {return listOfUser;}
    public static Map<String, Object> getUsuario() {return usuario;}
    public static Map<String, String> getUsuarioInvalido() {return usuarioInvalido;}

    public static void initUser(){
        usuario = new HashMap<>();
    }

    public static void initUserInvalido(){
        usuarioInvalido = new HashMap<>();
    }



}
