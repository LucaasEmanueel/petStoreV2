package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MethodsSteps {

    @Then("verifico se esta retornando {int} na requisicao da API")
    public void verificoSeEstaRetornandoNaRequisicaoDaAPI(int statusCode) {
        Assert.assertEquals(statusCode, utils.Utils.getResponse().statusCode());
    }

//    @And("verifico se esta com o status {string} na aplicacao do pet")
//    public void verificoSeEstaComOStatusNaAplicacaoDoPet(String){
//
//    }
}
