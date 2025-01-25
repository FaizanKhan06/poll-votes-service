package com.capstone.poll_votes_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.poll_votes_service.entity.PollVotesEntity;

@Repository
public interface PollVotesRepository extends JpaRepository<PollVotesEntity,Integer> {

}
