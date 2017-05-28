/**
 * Created by root on 5/28/17.
 */
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

/**
 * Created by MANGOCOOL on 2015/10/14.
 */
public class HelloTest {

    public static void main(String[] args)
    {
        try {
            //创建RESTful WebService服务
            HttpServer server = HttpServerFactory.create("http://localhost:8888/");
            //启动服务，这会导致新开一个线程
            server.start();
            //输出服务的一些提示信息到控制台
            System.out.println("Restful WebService服务已经启动...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
