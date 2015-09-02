package tutorial.rest.mvc;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tutorial.core.entities.BlogEntry;
import tutorial.core.services.BlogEntryService;
import tutorial.rest.resources.BlogEntryResource;
import tutorial.rest.resources.asm.BlogEntryResourceAsm;


@Controller
@RequestMapping("/rest/blog-entries/")
public class BlogEntryController {
private BlogEntryService service;

    public BlogEntryController(BlogEntryService service){
        this.service = service;
    }

    @RequestMapping(value = "/{blogEntryId}",method = RequestMethod.GET)
    public ResponseEntity<BlogEntryResource> getBlogEntry(@PathVariable Long blogEntryId){

        BlogEntry entry = service.find(blogEntryId);
        if(entry!=null){
            BlogEntryResource resource =new BlogEntryResourceAsm().toResource(entry);
            return new ResponseEntity<BlogEntryResource>(resource, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<BlogEntryResource>(HttpStatus.NOT_FOUND);
        }



    }


}
