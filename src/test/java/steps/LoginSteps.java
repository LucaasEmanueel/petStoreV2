package steps;

import io.cucumber.java.en.Given;
import maps.UserMaps;
import java.util.Map;

public class LoginSteps {

    @Given("que tenho os dados do usuario:")
    public void queTenhoOsDadosDoUsuario(Map<String,Object> map) {
        UserMaps.initUser();
        UserMaps.getUsuario().putAll(map);
    }

    @Given("que tenho os dados do usuario para cadastro invalido:")
    public void queTenhoOsDadosDoUsuarioInvalidosParaCadastro(Map<String, String> map) {
        UserMaps.initUserInvalido();
        UserMaps.getUsuarioInvalido().putAll(map);
    }
}
