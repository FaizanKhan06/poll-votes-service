package com.capstone.poll_votes_service.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PollVotesInputPojo {
    int pollId;
    String email;
    String votedEmail;
}
