package net.enagape.base.repository;

import java.util.List;

import net.enagape.base.entity.EaTaxonomy;
import org.springframework.data.repository.CrudRepository;

public interface TaxonomyRepository extends CrudRepository<EaTaxonomy, Long> {
}
