Feature: Assignment tasks
  Background:
    Given IonicPartners home page is opened

  Scenario: Scrolling in blog page
    Given I go to blog page
    Then I see blog page with title "Blog" is loaded
    When I scroll down the blog page
    Then I can see the page footer with text "All Rights Reservedd"

  Scenario: Scrolling down in about page
    Given I go to about page
    Then I see about page with title "About Us" is loaded
    When I scroll down the about page
    When I click on the twitter icon
    Then I can see the mobile twitter ionic page "Twitter" is loaded
