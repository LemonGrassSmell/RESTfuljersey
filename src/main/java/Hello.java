/**
 * Created by root on 5/28/17.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello()
    {
        String msg = "Hello!";
        return msg;
    }

    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello2Man(@PathParam("param") String msg)
    {
        String msg2Man = "Hello " + msg + "!";
        return msg2Man;
    }

}
