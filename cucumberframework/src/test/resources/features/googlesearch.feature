
Feature: US1000 Google search test


 Scenario: TC01 verify iphone search
 	Given user is on the google page
 	And user search for iphone
 	Then verify the result has phone
 	
 Scenario: TC02 Verify tea pot search
 	Given user is on the google page
 	And user search for teapot
 	Then verify the result has tea pot
 	
 Scenario: TC03 Verify flower search
 	Given user is on the google page
 	And user search for flower
 	Then verify the result has flower
 	
 	
 
