package org.banulp;

import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.grpc.GrpcService;
import com.linecorp.armeria.server.logging.LoggingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    static Server newServer(int port) throws Exception {
        final GrpcService grpcService =
                GrpcService.builder()
                        .addService(new BlogService())
                        .exceptionMapping(new GrpcExceptionHandler())
                        // All service methods will be run within
                        // the blocking executor.
                        // 이러면 grpc 쓰는 의미가 있나
                        .useBlockingTaskExecutor(true)
                        .build();
        return Server.builder()
                .http(port)
                .service(grpcService)
                .decorator(LoggingService.newDecorator())
                .build();
    }
    public static void main(String[] args) throws Exception {
        final Server server = newServer(8080);

        server.closeOnJvmShutdown().thenRun(() -> {
            logger.info("Server has been stopped.");
        });

        server.start().join();
    }
}