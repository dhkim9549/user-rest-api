package com.example.accessingdatamysql;

import java.util.Collection;
import java.util.Optional;
import javax.persistence.LockModeType;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;
import com.example.accessingdatamysql.TbUser;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TbUserRepository extends CrudRepository<TbUser, String> {

	@Lock(LockModeType.PESSIMISTIC_READ)
        public Optional<TbUser> findById(String mbno);

}
