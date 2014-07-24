import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.webapp.WebAppContext;

public class Launcher {
    public static void main(String[] args) throws Exception {
        Server server = new Server();
        SelectChannelConnector connector = new SelectChannelConnector();
        connector.setPort(8081);
        server.addConnector(connector);

        WebAppContext context = new WebAppContext("webapp", "/");
        server.setHandler(context);
        server.start();
    }
}
