Feature: Test Tagged Hooks 

@First 
Scenario: This is First test
	Given this is the first step 
	When this is the second step 
	Then this is the third step 
	
@Second 
Scenario: This is Second test
	Given this is the first step 
	When this is the second step 
	Then this is the third step 
	
@Third 
Scenario: This is Third test
	Given this is the first step 
	When this is the second step 
	Then this is the third step 
	
	# tagged hooks are used for pre or post conditions for a particular scenario like before after
	# then hooks are tagged like here @First,@Second.@Third