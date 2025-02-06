package com.capstone.poll_votes_service.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.poll_votes_service.entity.PollVotesEntity;

@Repository
public interface PollVotesRepository extends JpaRepository<PollVotesEntity, Integer> {
    List<PollVotesEntity> findByPollId(int pollId);

    Optional<PollVotesEntity> findByPollIdAndEmail(int pollId, String email);

}
