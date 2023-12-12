@tag
Feature: we will cover login operations in the feature
  I want to use this template for my feature file

Background:
Given the user has launch the login page

@tag1
 Scenario Outline: Login multiple username
 	When the user enters the username as <username>
 	And the user enters the password as <password>
 	And the user clicks on login button
 	Then verify that user logged in successfully
 	And verify logout button is displayed
 	When the user click on logout button
 	
 	Examples:
 	| username 		| password 			 |
 	| student     | Password123    |
 