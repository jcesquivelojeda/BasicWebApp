package tutorial.core.services;

import tutorial.core.entities.Blog;
import tutorial.core.entities.BlogEntry;
import tutorial.core.services.util.BlogEntryList;
import tutorial.core.services.util.BlogList;

/**
 * Created by nick on 2/09/15.
 */
public interface BlogService {

    public BlogEntry createBlogEntry(Long id,BlogEntry data);
    public BlogList findAllBlogs();
    public BlogEntryList findAllBlogEntries(Long blogId);
    public Blog findBlog(Long id);
}
