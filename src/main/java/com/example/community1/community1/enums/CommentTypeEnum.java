package com.example.community1.community1.enums;

import org.apache.ibatis.annotations.Param;

public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);
    CommentTypeEnum(Integer type){
        this.type=type;
    }

    private Integer type;

    public Integer getType() {
        return type;
    }

    public static boolean isExit(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if(commentTypeEnum.getType()==type){
                return true;
            }
        }
        return false;
    }
}
