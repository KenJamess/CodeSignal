/*Implement the missing code, denoted by ellipses. You may not modify the pre-existing code.
You recently added feedback functionality to the small web service you own. You were able to handle everything manually at first, but the amount of messages you receive now is overwhelming. As such, you've decided to start generating generic responses automatically.

All customer names are stored in the table customers with the following structure:

id: unique customer id;
name: the name of the customer in the format described below.
The customer's name is stored in the following format: <first name> <last name> (two words separated by single space), where first and last names can contain both uppercase and lowercase English letters.

Your task is to write a function that, given the customer's name, will return the following message:

Dear <Firstname> <Lastname>! We received your message and will process it as soon as possible. Thanks for using our service. FooBar On! - FooBarIO team.

Here, <Firstname> and <Lastname> are the first and the last names of the customer, with the first letter in uppercase and with all other letters in lowercase.

Example

For the following table customers

id	name
1	JOHN GaLT
2	SANDY COHEN
the output should be

id	name	response
1	JOHN GaLT	Dear John Galt! We received your message and will process it as soon as possible. Thanks for using our service. FooBar On! - FooBarIO team.
2	SANDY COHEN	Dear Sandy Cohen! We received your message and will process it as soon as possible. Thanks for using our service. FooBar On! - FooBarIO team.*/
DROP FUNCTION IF EXISTS response;
CREATE FUNCTION response(name VARCHAR(40)) RETURNS VARCHAR(200)
    DETERMINISTIC
BEGIN
    DECLARE first_name VARCHAR(20);
    DECLARE last_name VARCHAR(20);
    DECLARE response VARCHAR(200);
    SET first_name = SUBSTRING_INDEX(name, ' ', 1);
    SET last_name = SUBSTRING_INDEX(name, ' ', -1);
    SET response = CONCAT('Dear ', UPPER(SUBSTRING(first_name, 1, 1)), LOWER(SUBSTRING(first_name, 2)), ' ',
                          UPPER(SUBSTRING(last_name, 1, 1)), LOWER(SUBSTRING(last_name, 2)),
                          '! We received your message and will process it as soon as possible. Thanks for using our service. FooBar On! - FooBarIO team.');
    RETURN response;
END;

CREATE PROCEDURE solution()
BEGIN
    SELECT id, name, response(name) AS response
    FROM customers;
END;