# Login

Every heading in this file is a scenario.
Every bulleted point is a step.

To execute this specification, use
	npm test

* open frontend application

## Login with wrong username
* type in username "john doe"
* type in password "admin"
* click login button
* should see "Login failed!"

## Login with wrong password
* type in username "admin"
* type in password "wrong password"
* click login button
* should see "Login failed!"

## Login with correct credentials
* type in username "admin"
* type in password "admin"
* click login button
* should see "Login successful!"