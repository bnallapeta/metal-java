/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.packet.client.api;

import net.packet.client.model.Error;
import net.packet.client.model.MetalGateway;
import net.packet.client.model.MetalGatewayInput;
import net.packet.client.model.MetalGatewayList;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetalGatewaysApi
 */
@Ignore
public class MetalGatewaysApiTest {

    private final MetalGatewaysApi api = new MetalGatewaysApi();

    
    /**
     * Create a metal gateway
     *
     * Create a metal gateway in a project
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createMetalGatewayTest() throws Exception {
        UUID projectId = null;
        MetalGatewayInput metalGateway = null;
        Integer page = null;
        Integer perPage = null;
        MetalGateway response = api.createMetalGateway(projectId, metalGateway, page, perPage);

        // TODO: test validations
    }
    
    /**
     * Deletes the metal gateway
     *
     * Deletes a specific metal gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteMetalGatewayTest() throws Exception {
        UUID id = null;
        api.deleteMetalGateway(id);

        // TODO: test validations
    }
    
    /**
     * Returns the metal gateway
     *
     * Returns a specific metal gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findMetalGatewayByIdTest() throws Exception {
        UUID id = null;
        MetalGateway response = api.findMetalGatewayById(id);

        // TODO: test validations
    }
    
    /**
     * Returns all metal gateways for a project
     *
     * Return all metal gateways for a project
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findMetalGatewaysByProjectTest() throws Exception {
        UUID projectId = null;
        Integer page = null;
        Integer perPage = null;
        MetalGatewayList response = api.findMetalGatewaysByProject(projectId, page, perPage);

        // TODO: test validations
    }
    
}
