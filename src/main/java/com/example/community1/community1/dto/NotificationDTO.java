package com.example.community1.community1.dto;

import com.example.community1.community1.model.User;
import lombok.Data;

@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private String notifier;
    private String notifierName;
    private String outterTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
