package com.capstone.poll_votes_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.poll_votes_service.entity.PollVotesEntity;
import com.capstone.poll_votes_service.service.PollVotesService;

@RestController
@RequestMapping("/api/poll-vote")
public class PollVotesController {

    @Autowired
    PollVotesService pollVotesService;

    @GetMapping("")
    public ResponseEntity<List<PollVotesEntity>> getAllPollVotes(){
        return new ResponseEntity<>(pollVotesService.getAllPollVotes(),HttpStatus.OK);
    }

    @GetMapping("/{pvid}")
    public ResponseEntity<PollVotesEntity>getAPollVote(@PathVariable("pvid")int pollVoteId){
        return new ResponseEntity<>(pollVotesService.getAPollVote(pollVoteId),HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<PollVotesEntity>addAPollVote(@RequestBody PollVotesEntity newpollVote){
        return new ResponseEntity<>(pollVotesService.addAPollVote(newpollVote),HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<PollVotesEntity>updatePollVote(PollVotesEntity editedPollVote){
        return new ResponseEntity<>(pollVotesService.updatePollVote(editedPollVote),HttpStatus.OK);
    }

    @DeleteMapping("/{pvid}")
    public ResponseEntity<Void> deletePollVote(@PathVariable("pvid")int pollVoteId){
        pollVotesService.deletePollVote(pollVoteId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
