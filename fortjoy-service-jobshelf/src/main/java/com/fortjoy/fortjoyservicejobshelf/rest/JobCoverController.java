package com.fortjoy.fortjoyservicejobshelf.rest;

import com.fortjoy.fortjoyservicejobshelf.domain.JobCover;
import com.fortjoy.fortjoyservicejobshelf.repository.JobCoverRepositoryCustom;
import com.fortjoy.fortjoyservicejobshelf.service.JobCoverService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;

@RestController
public class JobCoverController {

    @Resource
    public JobCoverService jobCoverService;

    @Resource
    private JobCoverRepositoryCustom jobCoverRepositoryCustom;

    @GetMapping("/jobCover/{city}/{keyword}")
    public Flux<JobCover> getJobCovers(@PathVariable String city, @PathVariable String keyword) {
        jobCoverRepositoryCustom.setCollectionName(city,keyword);
        return jobCoverService.findAll();
    }
}
