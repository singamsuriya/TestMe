Feature:login

Scenario Outline: to enter mercury
Given user is on the home page
When user name "<username>" and "<password>"

Then user does succesfull login
Examples:
|username|password|
|mercury|mercury|
|tutorial|tutorial|
