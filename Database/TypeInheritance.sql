/*You are writing a transcompiler that will be able to translate programs from one programming language to another. Your transcompiler needs to be able to analyze a program to understand what data types it uses and how they should be mapped to the types of the output language.

In order to handle this, you created an inheritance table, which has the following structure:

derived: a unique data type in the original language;
base: the base data type from which the derived type is inherited.
It's guaranteed that there are no cyclic dependencies.

For each translated program a variables table is created, which has the following structure:

var_name: the unique variable name;
type: the variable type.
Your task is to write a query that will find the variables of types that are inherited from the Number type. The resulting table should contain var_name and var_type columns and be sorted by var_names.

Example

For given tables inheritance

derived	base
Double	Number
Int	Number
Int64	Int
Number	Object
and variables

var_name	type
A	Int
B	Object
C	Double
D	Int64
E	Number
the output should be

var_name	var_type
A	Int
C	Double
D	Int64
Type Int64 is inherited from type Int, which in turn is inherited from Number type, so both variables A and D should be included in the result. Double type is also inherited from Number, so C is also present in the resulting table.*/
CREATE PROCEDURE solution()
BEGIN
    /* Write your SQL here. Terminate each statement with a semicolon. */
    SET @first := true;
    WHILE row_count() OR @first
        DO
            SET @first := false;
            UPDATE inheritance a
                JOIN inheritance b ON a.base = b.derived AND a.base != "Number"
            SET a.base = b.base;
        END WHILE;

    SELECT var_name, type AS var_type
    FROM variables
             JOIN inheritance ON type = derived
    WHERE base = "Number"
    ORDER BY var_name;
END