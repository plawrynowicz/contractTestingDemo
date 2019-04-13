package lawrynowicz.demo.swagger;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import io.swagger.api.StoreApi;
import io.swagger.model.Order;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class StoreApiTest {


    private StoreApi api;
    private org.apache.cxf.jaxrs.client.Client client;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://petstore.swagger.io/v2", StoreApi.class, providers);
        client = WebClient.client(api);
        client.accept(MediaType.APPLICATION_JSON_TYPE);

        ClientConfiguration config = WebClient.getConfig(client);
        config.getOutInterceptors().add(new LoggingOutInterceptor(new PrintWriter(System.out)));
        config.getInInterceptors().add(new LoggingInInterceptor(new PrintWriter(System.out)));
    }

    /**
     * Delete purchase order by ID
     * <p>
     * For valid response try integer IDs with positive integer value.         Negative or non-integer values will generate API errors
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrderTest() {
        Long orderId = null;
        //api.deleteOrder(orderId);

        // TODO: test validations


    }

    /**
     * Returns pet inventories by status
     * <p>
     * Returns a map of status codes to quantities
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInventoryTest() {
        //Map<String, Integer> response = api.getInventory();
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Find purchase order by ID
     * <p>
     * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10.         Other values will generated exceptions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderByIdTest() {
        Long orderId = null;
        //Order response = api.getOrderById(orderId);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Place an order for a pet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void placeOrderTest() {
        Order body = null;
        //Order response = api.placeOrder(body);
        //assertNotNull(response);
        // TODO: test validations


    }


}
