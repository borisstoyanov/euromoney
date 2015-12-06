Feature: Euromoney Store
As a User
I want go to the Euromoney store
So that I can purchase the book of the month

  Scenario: I want to purchase the book of month
    Given I am on the EuromoneyPage
      And I navigate to EuromoneyStore
      And I click on ViewMoreDetails on the BookOfMonth
     When  I get to the BookDetailsPage
      And I add the book  
      And I go to ShoppingCart
     Then the book should be added
      And the price is displatyed in GBP