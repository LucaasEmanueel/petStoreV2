package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import utils.Data;
import utils.Utils;

import java.io.IOException;

public class PetSteps {

    //Data data;
    String json;

    @Given("que tenho os dados do usuario da pet")
    public void queTenhoOsDadosDoUsuarioDaPet() throws IOException {
        json = new Data().lerJson("db/pet.json");
    }
    @When("que faco a requisicao com o metodo POST no store do pet")
    public void queFacoARequisicaoComOMetodoPOSTNoStoreDoPet() {
        Utils.post(json,"/pet", ContentType.JSON);
    }

}
