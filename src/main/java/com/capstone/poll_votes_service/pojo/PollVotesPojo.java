package com.capstone.poll_votes_service.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PollVotesPojo {
    private int pollVoteId;
    private String email;
    private int pollId;
    private String votedEmail;

}
