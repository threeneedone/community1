package com.example.community1.community1.controller;

import com.example.community1.community1.dto.CommentDTO;
import com.example.community1.community1.dto.QuestionDTO;
import com.example.community1.community1.enums.CommentTypeEnum;
import com.example.community1.community1.service.CommentService;
import com.example.community1.community1.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    @Autowired
    private CommentService commentService;
    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Long id,
                           Model model){
        QuestionDTO questionDTO=questionService.getById(id);
        List<QuestionDTO> relatedQuestions=questionService.selectRelated(questionDTO);
        List<CommentDTO> comments=commentService.listByTargetId(id, CommentTypeEnum.QUESTION);
        //增加阅读数
        questionService.incView(id);
        model.addAttribute("question",questionDTO);
        model.addAttribute("comments",comments);
        model.addAttribute("relatedQuestions",relatedQuestions);
        return "question";
    }
}
