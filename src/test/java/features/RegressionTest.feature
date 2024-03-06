Feature: Purchase and manage account online
  As a Customer
  I should be able to purchase and manage account online
  So that it allows me to purchase from anywhere

  Background:
      Given I Launch the order portal website

  @scenario1 @Automation
  Scenario: Order history should be updated with relavant details of my current purchase
    Given I login to the application with valid credentials
    Then user logged in successfully