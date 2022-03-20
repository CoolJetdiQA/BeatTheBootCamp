Feature: Search Item
  this is my feature detail message.

  Background: 
    Given Background is running before scenario

  Scenario: Search an item and verify results text
    Given I want to search "iphonsfsdfe"
    And results text is displayed with "About"
    And number is 100.43
    And the following animals
      | cat |
      | 3.4 |
      | dog |
      | cow |
      | bee |

  Scenario Outline: My car story.
    Given I have a "<two>" cars.

    Examples: 
      | two |
      |  43 |
      | 367 |
      | 2.6 |
      | fas |

  Scenario Outline: Poker Casino
    When Poker has "<card>" card

    Examples: 
      | card   |
      | fe     |
      | 36rgd7 |
      | 2fd.6  |
      | fas    |

  Scenario Outline: Lotto winning
    Given I won <money> dollars

    Examples: 
      | money             |
      | one dollar        |
      | fiften dollar     |
      | one twenty dollar |
      | ninety one dollar |

  Scenario Outline: animals again
    And the following animals
      | cat |
      | 3.4 |
      | dog |
      | cow |
      | bee |
