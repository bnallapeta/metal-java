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
import net.packet.client.model.Port;
import net.packet.client.model.PortAssignInput;
import net.packet.client.model.PortVlanAssignment;
import net.packet.client.model.PortVlanAssignmentBatch;
import net.packet.client.model.PortVlanAssignmentBatchCreateInput;
import net.packet.client.model.PortVlanAssignmentBatchList;
import net.packet.client.model.PortVlanAssignmentList;
import java.util.UUID;
import net.packet.client.model.VirtualNetwork;
import net.packet.client.model.VirtualNetworkCreateInput;
import net.packet.client.model.VirtualNetworkList;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VlaNsApi
 */
@Ignore
public class VlaNsApiTest {

    private final VlaNsApi api = new VlaNsApi();

    
    /**
     * Assign a native VLAN
     *
     * Sets a virtual network on this port as a \&quot;native VLAN\&quot;. The VLAN must have already been assigned using the using the \&quot;Assign a port to a virtual network\&quot; operation.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void assignNativeVlanTest() throws Exception {
        UUID id = null;
        String vnid = null;
        Port response = api.assignNativeVlan(id, vnid);

        // TODO: test validations
    }
    
    /**
     * Assign a port to virtual network
     *
     * Assign a port for a hardware to virtual network.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void assignPortTest() throws Exception {
        UUID id = null;
        PortAssignInput vnid = null;
        Port response = api.assignPort(id, vnid);

        // TODO: test validations
    }
    
    /**
     * Create a new Port-VLAN Assignment management batch
     *
     * Create a new asynchronous batch request which handles adding and/or removing the VLANs to which the port is assigned.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createPortVlanAssignmentBatchTest() throws Exception {
        UUID id = null;
        PortVlanAssignmentBatchCreateInput vlanAssignments = null;
        PortVlanAssignmentBatch response = api.createPortVlanAssignmentBatch(id, vlanAssignments);

        // TODO: test validations
    }
    
    /**
     * Create a virtual network
     *
     * Creates an virtual network.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createVirtualNetworkTest() throws Exception {
        UUID id = null;
        VirtualNetworkCreateInput virtualNetwork = null;
        VirtualNetwork response = api.createVirtualNetwork(id, virtualNetwork);

        // TODO: test validations
    }
    
    /**
     * Remove native VLAN
     *
     * Removes the native VLAN from this port
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteNativeVlanTest() throws Exception {
        UUID id = null;
        Port response = api.deleteNativeVlan(id);

        // TODO: test validations
    }
    
    /**
     * Delete a virtual network
     *
     * Deletes a virtual network.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteVirtualNetworkTest() throws Exception {
        UUID id = null;
        VirtualNetwork response = api.deleteVirtualNetwork(id);

        // TODO: test validations
    }
    
    /**
     * Retrieve a VLAN Assignment Batch&#39;s details
     *
     * Returns the details of an existing Port-VLAN Assignment batch, including the list of VLANs to assign or unassign, and the current state of the batch.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findPortVlanAssignmentBatchByPortIdAndBatchIdTest() throws Exception {
        UUID id = null;
        UUID batchId = null;
        PortVlanAssignmentBatch response = api.findPortVlanAssignmentBatchByPortIdAndBatchId(id, batchId);

        // TODO: test validations
    }
    
    /**
     * List the VLAN Assignment Batches for a port
     *
     * Show all the VLAN assignment batches that have been created for managing this port&#39;s VLAN assignments
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findPortVlanAssignmentBatchesTest() throws Exception {
        UUID id = null;
        PortVlanAssignmentBatchList response = api.findPortVlanAssignmentBatches(id);

        // TODO: test validations
    }
    
    /**
     * Show a particular Port VLAN assignment&#39;s details
     *
     * Show the details of a specific Port-VLAN assignment, including the current state and if the VLAN is set as native.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findPortVlanAssignmentByPortIdAndAssignmentIdTest() throws Exception {
        UUID id = null;
        UUID assignmentId = null;
        List<String> include = null;
        List<String> exclude = null;
        PortVlanAssignment response = api.findPortVlanAssignmentByPortIdAndAssignmentId(id, assignmentId, include, exclude);

        // TODO: test validations
    }
    
    /**
     * List Current VLAN assignments for a port
     *
     * Show the port&#39;s current VLAN assignments, including if this VLAN is set as native, and the current state of the assignment (ex. &#39;assigned&#39; or &#39;unassigning&#39;)
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findPortVlanAssignmentsTest() throws Exception {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        PortVlanAssignmentList response = api.findPortVlanAssignments(id, include, exclude);

        // TODO: test validations
    }
    
    /**
     * Retrieve all virtual networks
     *
     * Provides a list of virtual networks for a single project.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findVirtualNetworksTest() throws Exception {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        String facility = null;
        String metro = null;
        VirtualNetworkList response = api.findVirtualNetworks(id, include, exclude, facility, metro);

        // TODO: test validations
    }
    
    /**
     * Get a virtual network
     *
     * Get a virtual network.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVirtualNetworkTest() throws Exception {
        UUID id = null;
        VirtualNetwork response = api.getVirtualNetwork(id);

        // TODO: test validations
    }
    
    /**
     * Unassign a port
     *
     * Unassign a port for a hardware.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unassignPortTest() throws Exception {
        UUID id = null;
        PortAssignInput vnid = null;
        Port response = api.unassignPort(id, vnid);

        // TODO: test validations
    }
    
}
