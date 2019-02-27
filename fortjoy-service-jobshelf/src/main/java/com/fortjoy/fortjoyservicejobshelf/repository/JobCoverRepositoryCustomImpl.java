package com.fortjoy.fortjoyservicejobshelf.repository;

import org.springframework.stereotype.Component;

@Component("JobCoverRepositoryCustom")
public class JobCoverRepositoryCustomImpl implements JobCoverRepositoryCustom {
    private String collectionName = "ok";

    @Override
    public String getCollectionName() {
        return collectionName;
    }

    @Override
    public void setCollectionName(String city, String keyword) {
        collectionName = keyword + "_" + city;
    }
}
