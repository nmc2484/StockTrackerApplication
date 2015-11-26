package Providers;

import org.springframework.data.repository.CrudRepository;
import Models.Account;

/**
 * Created by nsamachipalo on 8/25/15.
 */
public interface AccountDAO extends CrudRepository<Account, Long>{
}
