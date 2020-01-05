package com.example.community1.community1.mapper;

import com.example.community1.community1.model.Comment;
import com.example.community1.community1.model.CommentExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}