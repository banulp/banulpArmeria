package org.banulp;

import com.linecorp.armeria.common.*;
import com.linecorp.armeria.server.AbstractHttpService;
import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.ServerBuilder;
import com.linecorp.armeria.server.ServiceRequestContext;
import com.linecorp.armeria.server.annotation.*;
import com.linecorp.armeria.server.docs.DocService;
import com.linecorp.armeria.server.logging.LoggingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    static Server newServer(int port) {
        ServerBuilder sb = Server.builder();

        DocService docService = DocService.builder().exampleRequests(BlogService.class,
                                "createBlogPost", // Name of service method
                                "{\"title\":\"My first blog\", \"content\":\"Hello Armeria!\"}")
                        .build();

        return sb.http(port)
//                .service("/", (ctx, req) -> HttpResponse.of("Hello, Armeria!"))
                .annotatedService(new BlogService())
                .serviceUnder("/docs", docService)
//                .serviceUnder("/docs", new DocService())
                .build();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Server server = newServer(8080);
        server.closeOnJvmShutdown();
        server.start().join();

        logger.info("Server has been started. Serving dummy service at http://127.0.0.1:{}/docs",
                server.activeLocalPort());
    }
}