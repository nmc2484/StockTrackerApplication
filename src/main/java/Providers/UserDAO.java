package Providers;

import org.springframework.data.repository.CrudRepository;
import Models.Trader;

/**
 * Created by nsamachipalo on 8/23/15.
 */
public interface UserDAO extends CrudRepository<Trader, Long> {
}
