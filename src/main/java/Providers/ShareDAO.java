package Providers;

import org.springframework.data.repository.CrudRepository;
import Models.Share;
import javax.transaction.Transactional;

/**
 * Created by nsamachipalo on 8/23/15.
 */
@Transactional
public interface ShareDAO extends CrudRepository<Share, Long>{

    Share findByName(String name);

    Share findBySymbol(String symbol);

}
