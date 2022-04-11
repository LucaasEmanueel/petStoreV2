package steps;

import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import maps.UserMaps;
import utils.Utils;

public class StoreSteps {

    @When("que faco a requisicao na store com o metodo POST")
    public void queFacoARequisicaoComOMetodoPOST() {
        Utils.post(UserMaps.getUsuario(),"store/order", ContentType.JSON);
    }

    @When("faco uma requisicao na store com o metodo DELETE para o pedido que tem id {int}")
    public void facoUmaRequisicaoComOMetodoDELETEParaOPedidoQueTemId(int status) {
        Utils.delete("store/order/"+status+"", ContentType.JSON);
    }



}
