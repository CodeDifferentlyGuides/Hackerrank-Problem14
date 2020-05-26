# Java Map

You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.

Input Format

The first line will have an integer n denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints:

A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.

1 <= n <= 100000
1 <= Query <= 100000

Output Format

For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.

To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.

Sample Input
 
3 <br>
uncle sam <br>
99912222 <br>
tom <br>
11122222 <br>
harry <br>
12299933 <br>
uncle sam <br>
uncle tom <br>
harry <br><br>
Sample Output

uncle sam=99912222 <br>
Not found <br>
harry=12299933 <br><br>

Hackerrank Link: https://www.hackerrank.com/challenges/phone-book/problem
