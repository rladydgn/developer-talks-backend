package com.dtalks.dtalks.qna.answer.service;

import com.dtalks.dtalks.qna.answer.dto.AnswerDto;
import com.dtalks.dtalks.qna.answer.dto.AnswerResponseDto;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface AnswerService {

    List<AnswerResponseDto> getAnswersByQuestionId(Long questionId);

    Long createAnswer(AnswerDto answerDto, Long questionId, UserDetails userDetails);

    Long updateAnswer(Long answerId, AnswerDto answerDto, UserDetails userDetails);
    void deleteAnswer(Long id, UserDetails userDetails);

}