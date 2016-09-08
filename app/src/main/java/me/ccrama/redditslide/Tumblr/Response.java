
package me.ccrama.redditslide.Tumblr;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "blog",
    "posts",
    "total_posts"
})
public class Response {

    @JsonProperty("blog")
    private Blog blog;
    @JsonProperty("posts")
    private List<Post> posts = new ArrayList<Post>();
    @JsonProperty("total_posts")
    private Integer totalPosts;

    /**
     * 
     * @return
     *     The blog
     */
    @JsonProperty("blog")
    public Blog getBlog() {
        return blog;
    }

    /**
     * 
     * @param blog
     *     The blog
     */
    @JsonProperty("blog")
    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    /**
     * 
     * @return
     *     The posts
     */
    @JsonProperty("posts")
    public List<Post> getPosts() {
        return posts;
    }

    /**
     * 
     * @param posts
     *     The posts
     */
    @JsonProperty("posts")
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    /**
     * 
     * @return
     *     The totalPosts
     */
    @JsonProperty("total_posts")
    public Integer getTotalPosts() {
        return totalPosts;
    }

    /**
     * 
     * @param totalPosts
     *     The total_posts
     */
    @JsonProperty("total_posts")
    public void setTotalPosts(Integer totalPosts) {
        this.totalPosts = totalPosts;
    }

}