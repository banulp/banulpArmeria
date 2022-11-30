package org.banulp;

import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.common.HttpStatus;
import com.linecorp.armeria.server.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BlogService {
    private final Map<Integer, BlogPost> blogPosts = new ConcurrentHashMap<>();

    @Post("/blogs")
    @RequestConverter(BlogPostRequestConverter.class)
    public HttpResponse createBlogPost(BlogPost blogPost) {
        blogPosts.put(blogPost.getId(), blogPost);
        return HttpResponse.ofJson(blogPost);
    }

    @Get("/blogs/:id")
    public HttpResponse getBlogPost(@Param int id) {
        BlogPost blogPost = blogPosts.get(id);
        return HttpResponse.ofJson(blogPost);
    }

    @Put("/blogs/:id")
    public HttpResponse updateBlogPost(@Param int id, @RequestObject BlogPost blogPost) {
        BlogPost oldBlogPost = blogPosts.get(id);
        // Check if the given blog post exists
        if (oldBlogPost == null) {
            // Return a Not Found error. See the next section for instructions
            return HttpResponse.of(HttpStatus.NOT_FOUND);
        }
        BlogPost newBlogPost = new BlogPost(id, blogPost.getTitle(),
                blogPost.getContent(),
                oldBlogPost.getCreatedAt(),
                blogPost.getCreatedAt());
        blogPosts.put(id, newBlogPost); // Update the info in the map
        return HttpResponse.ofJson(newBlogPost);
    }

    @Blocking
    @Delete("/blogs/:id")
    @ExceptionHandler(BadRequestExceptionHandler.class)
    public HttpResponse deleteBlogPost(@Param int id) {
        BlogPost removed = blogPosts.remove(id);
        if (removed == null) {
            throw new IllegalArgumentException("The blog post does not exist. id: " + id);
        }
        return HttpResponse.of(HttpStatus.NO_CONTENT);
    }
}
