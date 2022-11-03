package net.enagape.base.repository;

import java.util.List;

import net.enagape.base.entity.EaPost;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<EaPost, Long> {
}
