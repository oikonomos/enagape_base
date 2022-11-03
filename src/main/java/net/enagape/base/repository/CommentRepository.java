package net.enagape.base.repository;

import java.util.List;

import net.enagape.base.entity.EaComment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<EaComment, Long> {
	
}
