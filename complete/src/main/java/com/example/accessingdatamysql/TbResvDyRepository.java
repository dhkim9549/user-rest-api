package com.example.accessingdatamysql;

import java.util.Optional;
import javax.persistence.LockModeType;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import com.example.accessingdatamysql.TbResvDy;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TbResvDyRepository extends CrudRepository<TbResvDy, String> {

	@Modifying
        @Query(
		value = "UPDATE tb_resv_dy set resv_cnt = resv_cnt + :delta where resv_dy = :resvDy",
		nativeQuery = true
	)
        void updateResvDyNative(@Param("resvDy") String resvDy, @Param("delta") int delta);

	@Lock(LockModeType.PESSIMISTIC_WRITE)
        public Optional<TbResvDy> findById(String resvDy);

}
