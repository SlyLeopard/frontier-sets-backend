package com.frontier.repository;

// Imports
import org.springframework.stereotype.Repository;
import com.frontier.model.CustomSet;
import com.frontier.repository.base.BaseSetRepository;
import java.util.List;


// Annotations
@Repository

// Class
public interface CustomSetRepository extends BaseSetRepository<CustomSet> {

    List<CustomSet> findByIv(Integer[] iv);

}
