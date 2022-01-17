package org.acme.mongodb;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("/fruits")
public class FruitResource {

    @Inject
    FruitService fruitService;

    @POST
    public void add(Fruit fruit) {
        fruitService.add(fruit);
    }
}