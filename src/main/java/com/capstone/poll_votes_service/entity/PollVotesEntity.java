package com.capstone.poll_votes_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="poll_votes")
public class PollVotesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="poll_vote_id")
    private int pollVoteId;

    @Column(name="email")
    private String email;

    @Column(name="poll_id")
    private int pollId;

    @Column(name="user_vote")
    private int userVote;

}
