package swd20.hh.fi.filmpic.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PhotographRepository extends CrudRepository<Photograph, Long> {
	
	List<Photograph>findByTitle(String title);
	
	@Query(value = "SELECT * from Photograph p WHERE CONCAT(p.title, ' ', p.description) LIKE %?1%",
			nativeQuery=true)
	public List<Photograph> search(String keyword);
}
