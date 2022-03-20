Feature: HomePage Functionalities
  
  Background
  Given User is on Home Page

  Scenario: Navigate to Shop page and search an item
    Given User is on Home Page
    When User navigates to Shop page
    And searches for an item
    Then result count should be displayed with number

  Scenario: Navigate shopping yellow button and search for an item
    Given User is on Home Page
    When User navigates searchPage using big yellow button
    And searches for an item
    Then result count should be displayed with number
    Given Go to this url

  Scenario: Navigate shopping yellow button and search for an item
    When User navigates searchPage using big yello button
    And searchs for an item
    Then results count should be displayed with number
    And user enter username "admin123" and password "adminadmin"
    Then I have added wait 3000

  Scenario Outline: Navigate shopping yellow button and search for an item123123
    
    |username|password|
    |<username>|<password>|

    And user enter username "<username>" and password "<password>"

    @att
    Examples: 
      | username | password  |
      | abc1     | admin123a |
      | abc2     | admin123b |
      | abc3     | admin123c |
      | abc4     | admin123d |

    @verizon
    Examples: 
      | username | password     |
      | fios     | 5Gconnection |
