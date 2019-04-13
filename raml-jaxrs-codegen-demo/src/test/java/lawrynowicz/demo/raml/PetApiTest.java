package lawrynowicz.demo.raml;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import lawrynowicz.demo.raml.api.model.PetImpl;
import lawrynowicz.demo.raml.api.resource.Pet;
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

public class PetApiTest {
    private Pet api;
    private org.apache.cxf.jaxrs.client.Client client;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://petstore.swagger.io/v2", Pet.class, providers);

        client = WebClient.client(api);
        client.accept(MediaType.APPLICATION_JSON_TYPE);

        ClientConfiguration config = WebClient.getConfig(client);
        config.getOutInterceptors().add(new LoggingOutInterceptor(new PrintWriter(System.out)));
        config.getInInterceptors().add(new LoggingInInterceptor(new PrintWriter(System.out)));
    }

    @Test
    public void addPetTest() {
        PetImpl body = new PetImpl();
        String name = "reksio";
        body.setName(name);
        api.postPet(new PetImpl(), null);
        Response response = client.getResponse();
        assertThat(response.getStatus()).isEqualTo(200);
//        Pet petResult = response.readEntity(Pet.class);
//        assertThat(petResult.getName()).isEqualTo(name);


    }
}
