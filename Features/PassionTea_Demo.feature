Feature: PassionTea_Demo
Background:
# BackGround_Scenario
Given  User navigates to "http://www.practiceselenium.com/menu.html"
And  User clicks "Menu" button
And  User clicks "letstalktea" button
And  User enters "PassionTea User" in "Name" field
And  User enters "sampleUser@gmail.com" in "Email" field
And  User enters "Executing" in "Subject" field
And  User enters "BackGround Scenario" in "Message" field
And  User clicks "Submit" button


@PassionTea_Demo_590055b11a8ae5326b9476c7
Scenario Outline: PassionTea_Script
Given  User navigates to "<URL>"
And  User clicks "Menu" button
And  User clicks "letstalktea" button
And  User enters "<Name>" in "Name" field
And  User enters "<Email>" in "Email" field
And  User enters "<Subject>" in "Subject" field
And  User enters "<Message>" in "Message" field
Then  User clicks "Submit" button
Given  User navigates to "http://www.practiceselenium.com/welcome.html"
And  User clicks "HerbalTeacollection" button
And  User clicks "herbalteacheckout" button
And  User enters "email@gmail.com" in "Emailco" field
And  User enters "John Foe" in "Nameco" field
And  User enters "Number 456 Hyderabad" in "Addressco" field
And  User select "Mistercard" from the "cardtype" dropdown list
And  User enters "564546789823" in "cardnumber" field
And  User enters "iambuying tea" in "cardholdername" field
And  User enters "544" in "verificationcode" field
Then  User clicks "placeorder" button
Examples:
| URL| Name| Email| Subject| Message| 
| http://www.practiceselenium.com/menu.html| John Foe| mail@gmail.com| Hello| Need some Info| 
| http://www.practiceselenium.com/menu.html| Jon Doe| somegmailaccount@gmail.com| Goodbye| Need some more info|

