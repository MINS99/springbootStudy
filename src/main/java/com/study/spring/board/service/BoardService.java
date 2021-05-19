package com.study.spring.board.service;

import com.study.spring.board.repository.Board;
import com.study.spring.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository repository;

    public List<Board> getBoardList() {
        return repository.findAll();
    }
}