package org.banulp;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: blog.proto")
public final class BlogServiceGrpc {

  private BlogServiceGrpc() {}

  public static final String SERVICE_NAME = "org.banulp.BlogService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.banulp.CreateBlogPostRequest,
      org.banulp.BlogPost> METHOD_CREATE_BLOG_POST =
      io.grpc.MethodDescriptor.<org.banulp.CreateBlogPostRequest, org.banulp.BlogPost>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.banulp.BlogService", "CreateBlogPost"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.banulp.CreateBlogPostRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.banulp.BlogPost.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.banulp.GetBlogPostRequest,
      org.banulp.BlogPost> METHOD_GET_BLOG_POST =
      io.grpc.MethodDescriptor.<org.banulp.GetBlogPostRequest, org.banulp.BlogPost>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.banulp.BlogService", "GetBlogPost"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.banulp.GetBlogPostRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.banulp.BlogPost.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.banulp.ListBlogPostsRequest,
      org.banulp.ListBlogPostsResponse> METHOD_LIST_BLOG_POSTS =
      io.grpc.MethodDescriptor.<org.banulp.ListBlogPostsRequest, org.banulp.ListBlogPostsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.banulp.BlogService", "ListBlogPosts"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.banulp.ListBlogPostsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.banulp.ListBlogPostsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.banulp.UpdateBlogPostRequest,
      org.banulp.BlogPost> METHOD_UPDATE_BLOG_POST =
      io.grpc.MethodDescriptor.<org.banulp.UpdateBlogPostRequest, org.banulp.BlogPost>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.banulp.BlogService", "UpdateBlogPost"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.banulp.UpdateBlogPostRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.banulp.BlogPost.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.banulp.DeleteBlogPostRequest,
      com.google.protobuf.Empty> METHOD_DELETE_BLOG_POST =
      io.grpc.MethodDescriptor.<org.banulp.DeleteBlogPostRequest, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.banulp.BlogService", "DeleteBlogPost"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.banulp.DeleteBlogPostRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlogServiceStub newStub(io.grpc.Channel channel) {
    return new BlogServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BlogServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BlogServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BlogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createBlogPost(org.banulp.CreateBlogPostRequest request,
        io.grpc.stub.StreamObserver<org.banulp.BlogPost> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_BLOG_POST, responseObserver);
    }

    /**
     */
    public void getBlogPost(org.banulp.GetBlogPostRequest request,
        io.grpc.stub.StreamObserver<org.banulp.BlogPost> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BLOG_POST, responseObserver);
    }

    /**
     */
    public void listBlogPosts(org.banulp.ListBlogPostsRequest request,
        io.grpc.stub.StreamObserver<org.banulp.ListBlogPostsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_BLOG_POSTS, responseObserver);
    }

    /**
     */
    public void updateBlogPost(org.banulp.UpdateBlogPostRequest request,
        io.grpc.stub.StreamObserver<org.banulp.BlogPost> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_BLOG_POST, responseObserver);
    }

    /**
     */
    public void deleteBlogPost(org.banulp.DeleteBlogPostRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_BLOG_POST, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_BLOG_POST,
            asyncUnaryCall(
              new MethodHandlers<
                org.banulp.CreateBlogPostRequest,
                org.banulp.BlogPost>(
                  this, METHODID_CREATE_BLOG_POST)))
          .addMethod(
            METHOD_GET_BLOG_POST,
            asyncUnaryCall(
              new MethodHandlers<
                org.banulp.GetBlogPostRequest,
                org.banulp.BlogPost>(
                  this, METHODID_GET_BLOG_POST)))
          .addMethod(
            METHOD_LIST_BLOG_POSTS,
            asyncUnaryCall(
              new MethodHandlers<
                org.banulp.ListBlogPostsRequest,
                org.banulp.ListBlogPostsResponse>(
                  this, METHODID_LIST_BLOG_POSTS)))
          .addMethod(
            METHOD_UPDATE_BLOG_POST,
            asyncUnaryCall(
              new MethodHandlers<
                org.banulp.UpdateBlogPostRequest,
                org.banulp.BlogPost>(
                  this, METHODID_UPDATE_BLOG_POST)))
          .addMethod(
            METHOD_DELETE_BLOG_POST,
            asyncUnaryCall(
              new MethodHandlers<
                org.banulp.DeleteBlogPostRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BLOG_POST)))
          .build();
    }
  }

  /**
   */
  public static final class BlogServiceStub extends io.grpc.stub.AbstractStub<BlogServiceStub> {
    private BlogServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlogServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BlogServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlogServiceStub(channel, callOptions);
    }

    /**
     */
    public void createBlogPost(org.banulp.CreateBlogPostRequest request,
        io.grpc.stub.StreamObserver<org.banulp.BlogPost> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_BLOG_POST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlogPost(org.banulp.GetBlogPostRequest request,
        io.grpc.stub.StreamObserver<org.banulp.BlogPost> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BLOG_POST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBlogPosts(org.banulp.ListBlogPostsRequest request,
        io.grpc.stub.StreamObserver<org.banulp.ListBlogPostsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_BLOG_POSTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBlogPost(org.banulp.UpdateBlogPostRequest request,
        io.grpc.stub.StreamObserver<org.banulp.BlogPost> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BLOG_POST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBlogPost(org.banulp.DeleteBlogPostRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_BLOG_POST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BlogServiceBlockingStub extends io.grpc.stub.AbstractStub<BlogServiceBlockingStub> {
    private BlogServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlogServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BlogServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.banulp.BlogPost createBlogPost(org.banulp.CreateBlogPostRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_BLOG_POST, getCallOptions(), request);
    }

    /**
     */
    public org.banulp.BlogPost getBlogPost(org.banulp.GetBlogPostRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BLOG_POST, getCallOptions(), request);
    }

    /**
     */
    public org.banulp.ListBlogPostsResponse listBlogPosts(org.banulp.ListBlogPostsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_BLOG_POSTS, getCallOptions(), request);
    }

    /**
     */
    public org.banulp.BlogPost updateBlogPost(org.banulp.UpdateBlogPostRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_BLOG_POST, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteBlogPost(org.banulp.DeleteBlogPostRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_BLOG_POST, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BlogServiceFutureStub extends io.grpc.stub.AbstractStub<BlogServiceFutureStub> {
    private BlogServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlogServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BlogServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.banulp.BlogPost> createBlogPost(
        org.banulp.CreateBlogPostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_BLOG_POST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.banulp.BlogPost> getBlogPost(
        org.banulp.GetBlogPostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BLOG_POST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.banulp.ListBlogPostsResponse> listBlogPosts(
        org.banulp.ListBlogPostsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_BLOG_POSTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.banulp.BlogPost> updateBlogPost(
        org.banulp.UpdateBlogPostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BLOG_POST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBlogPost(
        org.banulp.DeleteBlogPostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_BLOG_POST, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BLOG_POST = 0;
  private static final int METHODID_GET_BLOG_POST = 1;
  private static final int METHODID_LIST_BLOG_POSTS = 2;
  private static final int METHODID_UPDATE_BLOG_POST = 3;
  private static final int METHODID_DELETE_BLOG_POST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BlogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BlogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BLOG_POST:
          serviceImpl.createBlogPost((org.banulp.CreateBlogPostRequest) request,
              (io.grpc.stub.StreamObserver<org.banulp.BlogPost>) responseObserver);
          break;
        case METHODID_GET_BLOG_POST:
          serviceImpl.getBlogPost((org.banulp.GetBlogPostRequest) request,
              (io.grpc.stub.StreamObserver<org.banulp.BlogPost>) responseObserver);
          break;
        case METHODID_LIST_BLOG_POSTS:
          serviceImpl.listBlogPosts((org.banulp.ListBlogPostsRequest) request,
              (io.grpc.stub.StreamObserver<org.banulp.ListBlogPostsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BLOG_POST:
          serviceImpl.updateBlogPost((org.banulp.UpdateBlogPostRequest) request,
              (io.grpc.stub.StreamObserver<org.banulp.BlogPost>) responseObserver);
          break;
        case METHODID_DELETE_BLOG_POST:
          serviceImpl.deleteBlogPost((org.banulp.DeleteBlogPostRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class BlogServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.banulp.Blog.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BlogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlogServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE_BLOG_POST)
              .addMethod(METHOD_GET_BLOG_POST)
              .addMethod(METHOD_LIST_BLOG_POSTS)
              .addMethod(METHOD_UPDATE_BLOG_POST)
              .addMethod(METHOD_DELETE_BLOG_POST)
              .build();
        }
      }
    }
    return result;
  }
}
