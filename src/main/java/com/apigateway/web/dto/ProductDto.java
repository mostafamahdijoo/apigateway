package com.apigateway.web.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductDto {
    String name;
    Double price;
    Boolean isCommentsEnabled;
    List<String> lastThreeComments;
    Integer totalNumberOfComments;
    Integer averageVoteScore;
    Boolean isVoteEnabled;
}

