package com.frontier.repository;

import org.springframework.stereotype.Repository;

import com.frontier.model.CustomSet;
import com.frontier.repository.base.BaseSetRepository;

import java.util.List;

@Repository
public interface CustomSetRepository extends BaseSetRepository<CustomSet> {

    List<CustomSet> findByIv(Integer[] iv);

}
