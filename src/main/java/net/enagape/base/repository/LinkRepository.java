package net.enagape.base.repository;

import java.util.List;

import net.enagape.base.entity.EaLink;
import org.springframework.data.repository.CrudRepository;

public interface LinkRepository extends CrudRepository<EaLink, Long> {
}
