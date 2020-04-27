Feature: Login into Application

Scenario Outline: Positive test validating Login
Given Intialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com" site
And click on Login Link on Homepage to land on Secure Sign Page
And when user enters <username> and <password> and logs in
Then Verify that user is successfully logged in 
And close the browser

Examples:
|username               |    password|
|drishtisahu95@gmail.com| Naina123456|
|test99@gmail.com       |123456      |
