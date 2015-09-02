package tutorial.core.services.util;

import tutorial.core.entities.BlogEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nick on 2/09/15.
 */
public class BlogEntryList {
    private Long blogId;
    private List<BlogEntry> entries = new ArrayList<BlogEntry>();

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public List<BlogEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<BlogEntry> entries) {
        this.entries = entries;
    }
}
