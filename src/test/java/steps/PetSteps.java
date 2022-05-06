package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import maps.UserMaps;
import utils.Data;
import utils.Utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PetSteps {

    String json;
    Map<String, Object> status;

    @Given("que tenho os dados do usuario da pet")
    public void queTenhoOsDadosDoUsuarioDaPet() throws IOException {
        json = new Data().lerJson("db/petNew.json");
    }

    @Given("que tenho novos dados do usuario da pet")
    public void queTenhoNovosDadosDoUsuarioDaPet() throws IOException {
        json = new Data().lerJson("db/petUpdate.json");
    }

    @Given("que escolho o status {string} para pesquisa no store do pet")
    public void queTenhoOsDadosDoUsuarioDaPet(String tipoDoStatus) throws IOException {
        status = new HashMap<>();
        status.put("status", tipoDoStatus);
    }

    @When("que faco a requisicao com o metodo {string} no store do pet")
    public void queFacoARequisicaoComOMetodoNoStoreDoPet(String metodo) {

        switch(metodo){

            case "POST": Utils.post(json,"/pet", ContentType.JSON); break;
            case "PUT": Utils.put(json,"/pet", ContentType.JSON); break;
            case "GET": Utils.get("/pet/findByStatus", ContentType.JSON,status); break;
            case "DELETE": Utils.delete("/pet/3209302939", ContentType.JSON); break;
        }
    }


}
