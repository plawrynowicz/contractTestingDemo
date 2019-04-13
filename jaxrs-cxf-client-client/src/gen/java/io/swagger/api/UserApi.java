package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * Swagger Petstore
 *
 * <p>This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
 */
@Path("/")
@Api(value = "/", description = "")
public interface UserApi {

    /**
     * Create user
     * <p>
     * This can only be done by the logged in user.
     */
    @POST
    @Path("/user")
    @Produces({"application/xml", "application/json"})
    @ApiOperation(value = "Create user", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation")})
    void createUser(User body);

    /**
     * Creates list of users with given input array
     */
    @POST
    @Path("/user/createWithArray")
    @Produces({"application/xml", "application/json"})
    @ApiOperation(value = "Creates list of users with given input array", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation")})
    void createUsersWithArrayInput(List<User> body);

    /**
     * Creates list of users with given input array
     */
    @POST
    @Path("/user/createWithList")
    @Produces({"application/xml", "application/json"})
    @ApiOperation(value = "Creates list of users with given input array", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation")})
    void createUsersWithListInput(List<User> body);

    /**
     * Delete user
     * <p>
     * This can only be done by the logged in user.
     */
    @DELETE
    @Path("/user/{username}")
    @Produces({"application/xml", "application/json"})
    @ApiOperation(value = "Delete user", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid username supplied"),
            @ApiResponse(code = 404, message = "User not found")})
    void deleteUser(@PathParam("username") String username);

    /**
     * Get user by user name
     */
    @GET
    @Path("/user/{username}")
    @Produces({"application/xml", "application/json"})
    @ApiOperation(value = "Get user by user name", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = User.class),
            @ApiResponse(code = 400, message = "Invalid username supplied"),
            @ApiResponse(code = 404, message = "User not found")})
    User getUserByName(@PathParam("username") String username);

    /**
     * Logs user into the system
     */
    @GET
    @Path("/user/login")
    @Produces({"application/xml", "application/json"})
    @ApiOperation(value = "Logs user into the system", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = String.class),
            @ApiResponse(code = 400, message = "Invalid username/password supplied")})
    String loginUser(@QueryParam("username") String username, @QueryParam("password") String password);

    /**
     * Logs out current logged in user session
     */
    @GET
    @Path("/user/logout")
    @Produces({"application/xml", "application/json"})
    @ApiOperation(value = "Logs out current logged in user session", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation")})
    void logoutUser();

    /**
     * Updated user
     * <p>
     * This can only be done by the logged in user.
     */
    @PUT
    @Path("/user/{username}")
    @Produces({"application/xml", "application/json"})
    @ApiOperation(value = "Updated user", tags = {})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid user supplied"),
            @ApiResponse(code = 404, message = "User not found")})
    void updateUser(@PathParam("username") String username, User body);
}

