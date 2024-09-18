package com.workconnect.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ComunityDetailsDTO {

    private Integer id;
    private String name;

    private String description;
    private Integer membersCount;
    private Boolean isPrivate;
    private LocalDateTime createdDate;

}
