package com.fortjoy.fortjoyservicejobshelf.repository;

import com.fortjoy.fortjoyservicejobshelf.domain.JobCover;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobCoverRepository extends ReactiveMongoRepository<JobCover,String> {
}
