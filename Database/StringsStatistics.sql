/*You are collecting some statistics about strings in the table strs, which only has one column:

str - a unique string that consists only of lowercase English letters.
Your goal is to return a new table ans, which has the following columns:
letter - a unique lowercase English letter;
total - the total number of occurrences of this letter in all the strings from table strs;
occurrence - the number of strings from table strs in which this letter occurs at least once;
max_occurrence - the maximal number of occurrences of this letter in a single string;
max_occurence_reached - the number of strings in which this maxumal number of occurrences is reached.
The rows should be ordered lexicographically by letter. For letters that are not contained in the strs table, don't add a row to the output table (i.e., all integers in the total column should be positive).

Example

For given table strs

str
aa
aaaa
aab
abaaba
bbbbb
the output should be

letter	total	occurrence	max_occurrence	max_occurrence_reached
a	12	4	4	2
b	8	3	5	1*/
CREATE PROCEDURE solution()
BEGIN
    /* Write your SQL here. Terminate each statement with a semicolon. */
    DROP TEMPORARY TABLE IF EXISTS l;
    CREATE TEMPORARY TABLE l
    (
        letter char(1) NOT NULL,
        PRIMARY KEY (letter)
    );

    INSERT INTO l
    VALUES ('a'),
           ('b'),
           ('c'),
           ('d'),
           ('e'),
           ('f'),
           ('g'),
           ('h'),
           ('i'),
           ('j'),
           ('k'),
           ('l'),
           ('m'),
           ('n'),
           ('o'),
           ('p'),
           ('q'),
           ('r'),
           ('s'),
           ('t'),
           ('u'),
           ('v'),
           ('w'),
           ('x'),
           ('y'),
           ('z');

    SELECT letter, total, occurrence, max_occurrence, COUNT(*) max_occurrence_reached
    FROM (SELECT letter, SUM(oc) total, COUNT(*) occurrence, MAX(oc) max_occurrence
          FROM (SELECT letter, str, CHAR_LENGTH(str) - CHAR_LENGTH(REPLACE(str, letter, '')) oc
                FROM strs,
                     l) e
          WHERE e.oc > 0
          GROUP BY letter) g
             INNER JOIN strs ON max_occurrence = CHAR_LENGTH(str) - CHAR_LENGTH(REPLACE(str, letter, ''))
    GROUP BY letter
    ORDER BY letter;
END