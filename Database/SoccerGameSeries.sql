/*You have a table scores that contains information about a series of soccer games. Your goal is to determine the winner of the series. A team is declared the winner if it won more games than the other team. If both teams had the same number of wins, then the winner is determined by the better goal difference (the difference between the goals that a team scores and the goals that the opposing team scores on them over all the games). If the goal differences are equal, the winner is the team that scored more goals during away games (i.e. games when it was not the host team). The result is the index of the winning team. If the above criteria are not sufficient for determining the winner, return 0.

The scores table contains the following columns:

match_id - the unique ID of the match;
first_team_score - the score of the 1st team in the current match;
second_team_score - the score of the 2nd team in the current match;
match_host - the team that is the host of the match (can be 1 or 2).
Your task is to write a select statement which returns a single column winner, which can contain 1, 2, or 0.

Example

For given table scores

match_id	first_team_score	second_team_score	match_host
1	3	2	1
2	2	1	2
3	1	2	1
4	2	1	2
the output should be

winner
1*/
CREATE PROCEDURE solution()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
	SELECT
    CASE
        WHEN team1_wins > team2_wins THEN 1
        WHEN team1_wins < team2_wins THEN 2
        WHEN team1_goal_diff > team2_goal_diff THEN 1
        WHEN team1_goal_diff < team2_goal_diff THEN 2
        WHEN team1_away_goals > team2_away_goals THEN 1
        WHEN team1_away_goals < team2_away_goals THEN 2
        ELSE 0
    END AS winner
	FROM
		(SELECT
			SUM(CASE WHEN first_team_score > second_team_score THEN 1 ELSE 0 END) AS team1_wins,
			SUM(CASE WHEN first_team_score < second_team_score THEN 1 ELSE 0 END) AS team2_wins,
			SUM(first_team_score - second_team_score) AS team1_goal_diff,
			SUM(second_team_score - first_team_score) AS team2_goal_diff,
			SUM(CASE WHEN match_host = 2 THEN first_team_score ELSE 0 END) AS team1_away_goals,
			SUM(CASE WHEN match_host = 1 THEN second_team_score ELSE 0 END) AS team2_away_goals
		FROM scores) AS subquery;
END