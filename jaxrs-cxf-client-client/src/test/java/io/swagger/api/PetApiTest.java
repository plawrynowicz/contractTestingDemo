/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
 * <p>
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.api;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import io.swagger.model.Category;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import org.apache.cxf.jaxrs.client.Client;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


/**
 * Swagger Petstore
 *
 * <p>This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
 * <p>
 * API tests for PetApi
 */
public class PetApiTest {


    private PetApi api;
    private Client client;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://petstore.swagger.io/v2", PetApi.class, providers);
        client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }


    /**
     * Add a new pet to the store
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addPetTest() {
        ModelApiResponse modelApiResponse = new ModelApiResponse();
        Pet body = new Pet();
        body.setName("oki");
        Category category = new Category();
        category.setName("x");
        category.setId(1L);
        body.setCategory(category);


        api.addPet(body);
        Response response = client.getResponse();


        // TODO: test validations


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
