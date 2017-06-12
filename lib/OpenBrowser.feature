Feature: OpenSameBrowser_Demo

  Scenario Outline: OpenSameBrowser_Demo
    Given User opens the "<URL>"

    Examples: 
      | URL                                       |
      | http://www.practiceselenium.com/menu.html |
      | https://www.google.com                    |
      | https://www.bing.com                      |
      | https://www.yahoo.com                     |
