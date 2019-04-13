package lawrynowicz.demo.swagger;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import io.swagger.api.PetApi;
import io.swagger.model.Pet;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//import static org.assertj.core.api.Assertions.assertThat;
public class PetApiTest {


    private PetApi api;
    private org.apache.cxf.jaxrs.client.Client client;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://petstore.swagger.io/v2", PetApi.class, providers);

        client = WebClient.client(api);
        client.accept(MediaType.APPLICATION_JSON_TYPE);

        ClientConfiguration config = WebClient.getConfig(client);
        config.getOutInterceptors().add(new LoggingOutInterceptor(new PrintWriter(System.out)));
        config.getInInterceptors().add(new LoggingInInterceptor(new PrintWriter(System.out)));
    }

    /**
     * Add a new pet to the store
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addPetTest() {
        Pet body = new Pet();
        String name = "reksio";
        body.setName(name);
        api.addPet(body);
        Response response = client.getResponse();
        assertThat(response.getStatus()).isEqualTo(200);
        Pet petResult = response.readEntity(Pet.class);
        assertThat(petResult.getName()).isEqualTo(name);



    }

    /**
     * Deletes a pet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePetTest() {
        Long petId = null;
        String apiKey = null;
        //api.deletePet(petId, apiKey);

        // TODO: test validations


    }

    /**
     * Finds Pets by status
     * <p>
     * Multiple status values can be provided with comma separated strings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findPetsByStatusTest() {
        List<String> status = null;
        //List<Pet> response = api.findPetsByStatus(status);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Finds Pets by tags
     * <p>
     * Muliple tags can be provided with comma separated strings. Use         tag1, tag2, tag3 for testing.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findPetsByTagsTest() {
        List<String> tags = null;
        //List<Pet> response = api.findPetsByTags(tags);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Find pet by ID
     * <p>
     * Returns a single pet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPetByIdTest() {
        Long petId = null;
        //Pet response = api.getPetById(petId);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Update an existing pet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePetTest() {
        Pet body = null;
        //api.updatePet(body);

        // TODO: test validations


    }

    /**
     * Updates a pet in the store with form data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePetWithFormTest() {
        Long petId = null;
        String name = null;
        String status = null;
        //api.updatePetWithForm(petId, name, status);

        // TODO: test validations


    }

    /**
     * uploads an image
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadFileTest() {
        Long petId = null;
        String additionalMetadata = null;
        org.apache.cxf.jaxrs.ext.multipart.Attachment file = null;
        //ModelApiResponse response = api.uploadFile(petId, additionalMetadata, file);
        //assertNotNull(response);
        // TODO: test validations


    }


}
