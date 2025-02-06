CREATE TABLE poll_votes (
    poll_vote_id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    poll_id INT NOT NULL,
    user_vote VARCHAR(255)
);

-- Add any necessary indexes or constraints here, if required
