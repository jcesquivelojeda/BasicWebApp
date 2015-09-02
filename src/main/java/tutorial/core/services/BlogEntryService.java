package tutorial.core.services;

import tutorial.core.entities.BlogEntry;

/**
 * Created by nick on 2/09/15.
 */
public interface BlogEntryService {
    public BlogEntry find(Long id);
}
