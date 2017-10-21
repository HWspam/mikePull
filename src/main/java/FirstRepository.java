import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by erikjakubowski on 10/21/17.
 */
@Repository
public interface FirstRepository extends CrudRepository<Test, Integer> {

}
