import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by erikjakubowski on 10/21/17.
 */
@RestController
@RequestMapping(value = "/post")
public class Controller {

    @Autowired
    FirstRepository firstRepository;


}
