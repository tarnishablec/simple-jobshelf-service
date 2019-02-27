package com.fortjoy.fortjoyservicejobshelf.service;

import com.fortjoy.fortjoyservicejobshelf.domain.JobCover;
import com.fortjoy.fortjoyservicejobshelf.repository.JobCoverRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;

@Service
public class JobCoverService {
    @Resource
    private JobCoverRepository jobCoverRepository;

    public Flux<JobCover> findAll(){
        return jobCoverRepository.findAll();
    }
}
