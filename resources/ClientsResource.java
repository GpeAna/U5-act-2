package fca.unam.mx.resources;

import fca.unam.mx.dal.StoreDal;
import fca.unam.mx.dto.ProductDto;
import fca.unam.mx.dto.ClientDto;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/clients")
public class ClientsResource {

    @Inject
    StoreDal storeDal;


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Get all clients")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON)),
    })
    public Response getClientes() {

        var responseCte = storeDal.getClientes();
        return Response.ok(responseCte).build();
    }

    @POST

    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Add a new cliente")
    @APIResponses(value = {
            @APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON)),
    })
    public Response registerUser(ClientDto clientDto) {
        var responseCte = storeDal.addProduct(clientDto);
        return Response.ok(responseCte).build();
    }


}