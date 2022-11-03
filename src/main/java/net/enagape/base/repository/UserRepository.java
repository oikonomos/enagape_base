package net.enagape.base.repository;

import java.util.Optional;

import net.enagape.base.entity.EaUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<EaUser, Long> {
	
	Optional<EaUser> findByEmail(String email);
}
