# Login

Every heading in this file is a scenario.
Every bulleted point is a step.

To execute this specification, use
	npm test

* open frontend application

## Login with wrong username
The list shows (dynamic) input params for the login steps:

   |username |password |
   |---------|---------|
   |john doe |admin    |
   |4dmin2   |admin    |
   |admin&   |admin    |
   |sebastian|sebastian|
   |severin  |severin  |
   |lars     |lars     |

* type in username <username>
* type in password <password>
* click login button
* should see "Login failed!"

## Login with missing username
* type in password "admin"
* click login button
* should see "Login failed!"

## Login with wrong password
* type in username "admin"
* type in password "wrong password"
* click login button
* should see "Login failed!"

## Login with missing password
* type in username "admin"
* click login button
* should see "Login failed!"

## Login with correct credentials
* type in username "admin"
* type in password "admin"
* click login button
* should see "Login successful!"

## Login scenarios
* Login with "username" username and "password" password should show "Login failed!"
* Login with "admin" username and "admin" password should show "Login successful!"
* Login with "john doe" username and "john" password should show "Login failed!"
