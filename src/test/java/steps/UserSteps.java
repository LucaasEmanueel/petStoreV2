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

    @Given("que tenho os dados do usuario para cadastro")
    public void queTenhoOsDadosDoUsuarioParaCadastro() {
        UserMaps.initUser();
    }

    @When("que faco a requisicao com o metodo POST")
    public void queFacoARequisicaoComOMetodoPOST() {
        Utils.post(UserMaps.getUsuario(),"user", ContentType.JSON);
    }

    @Then("verifico se esta retornando {int} na requisicao da API")
    public void verificoSeEstaRetornandoNaRequisicaoDaAPI(int statusCode) {
        Assert.assertEquals(statusCode, Utils.getResponse().statusCode());
    }
}
