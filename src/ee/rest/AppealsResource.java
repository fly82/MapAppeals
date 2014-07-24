package ee.rest;

import ee.model.AppealsRepository;
import ee.model.Appeals;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("tmp")
@Produces("application/json")
public class AppealsResource extends SpringAwareResource {
    @Autowired AppealsRepository repo;

    @GET
    public List<Appeals> getAllAppeals() {
        return repo.getAll();
    }
}
