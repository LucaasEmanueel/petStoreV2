package steps;

import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import maps.UserMaps;
import utils.Utils;


public class UserSteps {
    public static String responseToken;

    @When("que faco a requisicao com o metodo POST de um usuario {string}")
    public void queFacoARequisicaoComOMetodoPOST(String user) {

        switch (user){
            case "valido":
               Utils.post(UserMaps.getUsuario(),"user", ContentType.JSON);
                break;
            case "invalido":
                Utils.post(UserMaps.getUsuarioInvalido(),"user", ContentType.JSON);
        }
    }

    @When("faco a requisicao com o metodo PUT de um usuario")
    public void facoARequisicaoComOMetodoPUTDeUmUsuario() {
        Utils.put(UserMaps.getUsuario(),"user/lucaasemanueel",ContentType.JSON);
    }

    @When("faco uma requisicao com o metodo GET para um usuario")
    public void facoUmaRequisicaoComOMetodoGETParaUmUsuario() {
        Utils.get("user/login",ContentType.JSON,UserMaps.getUsuario());
    }

    @When("faco uma requisicao com o metodo DELETE para um usuario")
    public void facoUmaRequisicaoComOMetodoDELETEParaUmUsuario() {
        Utils.delete("user/lucaasEditado",ContentType.JSON);
    }

}
