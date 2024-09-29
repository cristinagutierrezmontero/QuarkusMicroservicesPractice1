package com.quarkuscourse;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.Duration;

@Path("/service-one")
public class ServiceOneResource {
    //Implementation of reactive asynchronous GET request that returns result after a
    //simulated delay (2 seconds).
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<String> delayedTwoSeconds() {
        return Uni.createFrom()
                .item("Delay 2 seconds")
                .onItem()
                .delayIt().by(Duration.ofSeconds(2));
    }
    //Implementation of reactive asynchronous POST request that accept a mocked request
    //body and return “success” string as a response
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/success")
    public Uni<String> success(String body){
        return Uni.createFrom().item("success");
    }
    //Implementation of reactive asynchronous POST request that throwing an exception
    //service-two microservice
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/error")
    public Uni<String> error(){
        return Uni.createFrom().failure(new RuntimeException("Simulated error"));
    }
}
