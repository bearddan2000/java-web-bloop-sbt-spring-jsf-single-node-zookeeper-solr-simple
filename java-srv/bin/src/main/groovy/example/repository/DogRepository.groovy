package example.repository;

import java.util.List;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import example.model.Dog;

public interface DogRepository extends SolrCrudRepository<Dog, String> {

    @Query("id:*?0*")
    public List<Dog> findByLikeId(String id);

}
