Feature: PassionTea_Demo

  Background:
    Given  User navigates to "http://www.practiceselenium.com/menu.html"
    And  User clicks "Menu" button
    And  User clicks "letstalktea" button
    And  User enters "PassionTea User" in "Name" field
    And  User enters "sampleUser@gmail.com" in "Email" field
    And  User enters "Executing" in "Subject" field
    And  User enters "BackGround Scenario" in "Message" field
    And  User clicks "Submit" button

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
    And  User enters "nv.ram82@gmail.com" in "Emailco" field
    And  User enters "Venkatraman" in "Nameco" field
    And  User enters "Number 456 Hyderabad" in "Addressco" field
    And  User select "Mastercard" from the "cardtype" dropdown list
    And  User enters "564546789823" in "cardnumber" field
    And  User enters "iambuying tea" in "cardholdername" field
    And  User enters "544" in "verificationcode" field
    Then  User clicks "placeorder" button
    Examples:
      | URL                                       | Name        | Email              | Subject    | Message        |
      | http://www.practiceselenium.com/menu.html | Venkatraman | nv.ram82@gmail.com | Hello      | Need some Info |
      | http://www.practiceselenium.com/menu.html | JohnDoe     | nv.ram82@gmail.com | Second Row | Need some Info |

