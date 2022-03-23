package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import maps.UserMaps;
import org.junit.Assert;
import utils.Utils;

import java.util.Map;

public class UserSteps {

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

    @Then("verifico se esta retornando {int} na requisicao da API")
    public void verificoSeEstaRetornandoNaRequisicaoDaAPI(int statusCode) {
        Assert.assertEquals(statusCode, Utils.getResponse().statusCode());
    }

    @When("faco uma requisicao com o metodo GET para um usuario")
    public void facoUmaRequisicaoComOMetodoGETParaUmUsuario() {
        Utils.get("user/login",ContentType.JSON,UserMaps.getUsuario());
    }
}
