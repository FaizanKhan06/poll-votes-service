package com.capstone.poll_votes_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.poll_votes_service.entity.PollVotesEntity;
import com.capstone.poll_votes_service.pojo.PollVotesInputPojo;
import com.capstone.poll_votes_service.service.PollVotesService;

@RestController
@RequestMapping("/api/poll-vote")
public class PollVotesController {

    @Autowired
    PollVotesService pollVotesService;

    @GetMapping("/{pollId}")
    public ResponseEntity<List<PollVotesEntity>> getAllPollVotesByPollId(@PathVariable int pollId) {
        return new ResponseEntity<>(pollVotesService.getAllPollVotesByPollId(pollId), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<PollVotesEntity> addAPollVote(@RequestBody PollVotesInputPojo newpollVote) {
        return new ResponseEntity<>(pollVotesService.addOrUpdatePollVote(newpollVote), HttpStatus.OK);
    }

    @DeleteMapping("/{pollVoteId}")
    public ResponseEntity<Void> deletePollVote(@PathVariable int pollVoteId) {
        pollVotesService.deletePollVote(pollVoteId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
