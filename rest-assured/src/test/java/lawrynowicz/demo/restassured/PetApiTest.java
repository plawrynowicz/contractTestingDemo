package lawrynowicz.demo.restassured;

import io.swagger.client.model.Pet;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PetApiTest {

    public static String BASE_ADDRESS = "https://petstore.swagger.io/v2";


    @Test
    public void addPet() {
        Pet pet = new Pet();
        pet.setName("reksio");
        given().contentType("application/json")
                .body(pet)
                .when().post(BASE_ADDRESS + "/pet")
                .then().statusCode(200);
    }

    @Test
    public void deletePet() {
        Pet pet = new Pet();
        pet.setName("reksio");
        given().contentType("application/json")
                .body(pet)
                .when().post(BASE_ADDRESS + "/pet");

        given().when().delete(BASE_ADDRESS + "/pet/1").then().statusCode(200);

    }


    @Test
    public void findPetsByStatus() {
        List<String> status = new ArrayList<>();
        status.add("1");
        given().queryParam(String.valueOf(status)).when().get(BASE_ADDRESS + "/pet/findByStatus").then().statusCode(200);

    }

    @Test
    public void findPetsByTags() {
    }


    @Test
    public void getPetById() {
    }


    @Test
    public void updatePet() {
    }


    @Test
    public void updatePetWithForm() {
    }

    @Test
    public void uploadFile() {
    }
}
