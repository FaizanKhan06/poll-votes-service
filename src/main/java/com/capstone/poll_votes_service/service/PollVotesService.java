package com.capstone.poll_votes_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.poll_votes_service.entity.PollVotesEntity;
import com.capstone.poll_votes_service.pojo.PollVotesInputPojo;
import com.capstone.poll_votes_service.repository.PollVotesRepository;

@Service
public class PollVotesService {
    @Autowired
    PollVotesRepository pollVotesRepository;

    public List<PollVotesEntity> getAllPollVotesByPollId(int pollId) {
        return pollVotesRepository.findByPollId(pollId);
    }

    public PollVotesEntity addOrUpdatePollVote(PollVotesInputPojo newPollVote) {
        PollVotesEntity pollVotesEntity = pollVotesRepository
                .findByPollIdAndEmail(newPollVote.getPollId(), newPollVote.getEmail()).orElse(null);
        if (pollVotesEntity == null) {
            pollVotesEntity = new PollVotesEntity();
            pollVotesEntity.setPollId(newPollVote.getPollId());
            pollVotesEntity.setEmail(newPollVote.getEmail());
        }
        pollVotesEntity.setVotedEmail(newPollVote.getVotedEmail());
        return pollVotesRepository.saveAndFlush(pollVotesEntity);
    }

    public void deletePollVote(int pollVoteId) {
        pollVotesRepository.deleteById(pollVoteId);
    }
}
