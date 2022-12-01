package org.banulp;

import com.linecorp.armeria.client.ClientBuilder;
import com.linecorp.armeria.client.Clients;
import com.linecorp.armeria.client.grpc.GrpcClients;
import com.linecorp.armeria.client.logging.LoggingClient;
import com.linecorp.armeria.common.HttpData;
import io.grpc.StatusRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class BlogClient {
    private static final Logger logger = LoggerFactory.getLogger(BlogClient.class);
    static BlogServiceGrpc.BlogServiceBlockingStub client;

    public static void main(String[] args) throws Exception {
//        client = GrpcClients.newClient("http://127.0.0.1:8080/",
//                BlogServiceGrpc.BlogServiceBlockingStub.class);

        ////////////

//        ClientBuilder cb = Clients.builder("http");
//        cb.decorator((delegate, ctx, req) -> {
//            final AtomicBoolean initialHttpData = new AtomicBoolean(true);
//
//            return delegate
//                    .execute(ctx, req)
//                    .mapHeaders(headers -> headers.toBuilder().add("x-foo", "foobar").build())
//                    .mapData((httpData) -> {
//                HttpData result = httpData;
//                if (initialHttpData.get()) {
//                    initialHttpData.set(false);
//                    byte[] ascii = "{\"foo\": \"foobar\",".getBytes(StandardCharsets.US_ASCII);
//                    byte[] combined = Arrays.copyOf(ascii, ascii.length + httpData.length() - 1);
//                    System.arraycopy(httpData.array(), 1, combined, ascii.length, httpData.length());
//                    result = HttpData.wrap(combined);
//                }
//                return result;
//            });
//        });

        ////////////


        client = GrpcClients.builder("http://127.0.0.1:8080/")
                .decorator(LoggingClient.newDecorator())  // add this
                .build(BlogServiceGrpc.BlogServiceBlockingStub.class);

        BlogClient blogClient = new BlogClient();

        // post
        blogClient.createBlogPost("banulp", "is smart.");
        blogClient.createBlogPost("banulp", "is kind.");
        blogClient.createBlogPost("banulp", "is holly.");
        blogClient.createBlogPost("banulp", "is good.");
        blogClient.createBlogPost("banulp", "is fair.");

        // get 1
        blogClient.getBlogPost(1);

        // list
        blogClient.listBlogPosts();

        // update
        blogClient.updateBlogPost(1, "THE GREAT BANULP", "IS WONDERFUL.");
        blogClient.getBlogPost(1);

        // make exception
        blogClient.updateBlogPost(100, "THE GREAT BANULP", "IS WONDERFUL.");
        blogClient.getBlogPost(100);

        // delete
        blogClient.deleteBlogPost(2);
        blogClient.listBlogPosts();
    }

    void createBlogPost(String title, String content) {
        final CreateBlogPostRequest request =
                CreateBlogPostRequest.newBuilder()
                        .setTitle(title)
                        .setContent(content)
                        .build();
        final BlogPost response = client.createBlogPost(request);
        logger.info("[Create response] Title: {} Content: {}",
                response.getTitle(), response.getContent());
    }

    void getBlogPost(int id){
        final BlogPost blogPost = client.getBlogPost(GetBlogPostRequest.newBuilder().setId(id).build());
        logger.info("[getBlogPost]  Title: {} Content: {}", blogPost.getTitle(), blogPost.getContent());
    }

    void listBlogPosts() {
        final ListBlogPostsResponse
                response = client.listBlogPosts(ListBlogPostsRequest.newBuilder().setDescending(false).build());

        final List<BlogPost> blogs = response.getBlogsList();

        logger.info("[listBlogPosts] blogs: {}", blogs.size());

    }

    void updateBlogPost(Integer id, String newTitle, String newContent){
        final UpdateBlogPostRequest request = UpdateBlogPostRequest.newBuilder()
                .setId(id)
                .setTitle(newTitle)
                .setContent(newContent)
                .build();
        final BlogPost updated = client.updateBlogPost(request);

        logger.info("[updateBlogPost] updated: {}", updated.getTitle(), updated.getContent());
    }

    void deleteBlogPost(int id) {
        final DeleteBlogPostRequest request = DeleteBlogPostRequest.newBuilder().setId(id).build();
        try {
            client.deleteBlogPost(request);
        } catch (StatusRuntimeException statusException) {
            // Handle exception
        }
    }
}
