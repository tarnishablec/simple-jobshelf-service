package com.fortjoy.fortjoyservicejobshelf.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "#{@JobCoverRepositoryCustom.getCollectionName()}")
public class JobCover {
    @Id
    private String id;
    @Indexed
    private Integer jobId;
    private String href;
    private String jobTitle;
    private String salary;
    private String addrSimple;
    private String experience;
    private String education;
    private String companyName;
    private String industry;
    private String date;
}
