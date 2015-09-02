package tutorial.rest.resources;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by nick on 2/09/15.
 */
public class BlogEntryResource extends ResourceSupport{

    private Long id;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public void setId(Long id) {
        this.id = id;
    }


}
