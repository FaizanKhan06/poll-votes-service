package com.capstone.poll_votes_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.poll_votes_service.entity.PollVotesEntity;
import com.capstone.poll_votes_service.repository.PollVotesRepository;

@Service
public class PollVotesService {
    @Autowired
    PollVotesRepository pollVotesRepository;

    public List<PollVotesEntity> getAllPollVotes(){
        return pollVotesRepository.findAll();
    }

    public PollVotesEntity getAPollVote(int pollVoteId){
        PollVotesEntity pollVotesEntity = pollVotesRepository.findById(pollVoteId).orElse(null);
        return pollVotesEntity;
    }

    public PollVotesEntity addAPollVote(PollVotesEntity newPollVote){
        return pollVotesRepository.saveAndFlush(newPollVote);
    }

    public PollVotesEntity updatePollVote(PollVotesEntity editedPollVote){
        return pollVotesRepository.save(editedPollVote);
    }

    public void deletePollVote(int pollVoteId){
        pollVotesRepository.deleteById(pollVoteId);
    }
}

