@Automation
Feature: Automation  Website

  @TC01_Automation
  Scenario: #1
    Register in the automation

    Given the user launch the chrome application
    When the user open the Automation Home page
    Then the user Register using username and password
    Then click on the Register button user nagivate to the next page

  @TC02_Automation
  Scenario: #2
    Login the automation

    Given the user launch chrome application
    When the user open Automation Home page
    Then the user Login using username and password
    Then click on the Login button user nagivate to the next page

  @TC03_Automation
  Scenario: #3
  shop and add in the Automation website

    Given user launch the  application
    When the user open the  Automation page
    Then user click on the shop button
    Then click on the add to cart button

  @TC04_Automation
  Scenario: #4
  Testcase and shop menu in the Automation website

    Given user launch the application
    When the user open the Automation page
    Then user click on the Testcase button
    Then click on the shop menu user go to the next page
  
        
  