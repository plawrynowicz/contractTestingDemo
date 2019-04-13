package lawrynowicz.demo.swagger;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import io.swagger.api.UserApi;
import io.swagger.model.User;
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

public class UserApiTest {

    private UserApi api;
    private org.apache.cxf.jaxrs.client.Client client;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://petstore.swagger.io/v2", UserApi.class, providers);
        client = WebClient.client(api);
        client.accept(MediaType.APPLICATION_JSON_TYPE);

        ClientConfiguration config = WebClient.getConfig(client);
        config.getOutInterceptors().add(new LoggingOutInterceptor(new PrintWriter(System.out)));
        config.getInInterceptors().add(new LoggingInInterceptor(new PrintWriter(System.out)));
    }

    /**
     * Create user
     * <p>
     * This can only be done by the logged in user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() {
        User body = null;
        //api.createUser(body);

        // TODO: test validations


    }

    /**
     * Creates list of users with given input array
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUsersWithArrayInputTest() {
        List<User> body = null;
        //api.createUsersWithArrayInput(body);

        // TODO: test validations


    }

    /**
     * Creates list of users with given input array
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUsersWithListInputTest() {
        List<User> body = null;
        //api.createUsersWithListInput(body);

        // TODO: test validations


    }

    /**
     * Delete user
     * <p>
     * This can only be done by the logged in user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserTest() {
        String username = null;
        //api.deleteUser(username);

        // TODO: test validations


    }

    /**
     * Get user by user name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserByNameTest() {
        String username = null;
        //User response = api.getUserByName(username);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Logs user into the system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loginUserTest() {
        String username = null;
        String password = null;
        //String response = api.loginUser(username, password);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Logs out current logged in user session
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logoutUserTest() {
        //api.logoutUser();

        // TODO: test validations


    }

    /**
     * Updated user
     * <p>
     * This can only be done by the logged in user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserTest() {
        User body = null;
        String username = null;
        //api.updateUser(body, username);

        // TODO: test validations


    }


}
