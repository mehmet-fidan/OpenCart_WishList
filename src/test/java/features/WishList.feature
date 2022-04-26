Feature: WishList

  Scenario: Add product to wish list

    Given user is at the homepage
    When user enters product name in the search field
    Then user clicks on search icon
    And user clicks displayed product in search results
    And user clicks on Add to Wish List in the Related Products section
    And user clicks on the wish list link in the displayed success message
    And user enters "ZeydinToprak@hotmail.com" and "123456" to login
    And user checks product availability in wishlist
    And user clicks logout at rightside


  Scenario Outline: Add product to Wish List two

    Given user is at the login page
    When user clicks store logo
    Then user scroll into featured section
    And user clicks button for adding product to wishlist
    And user clicks on the wish list link in the displayed success message
    And user enters "<username>" and "<password>" to login

    Examples:
      | username | password                 |
      | 123456   | ZeydinToprak@hotmail.com |


  Scenario: Hover on desktop menu

    Given user is at the homepage
    When user hover at desktop at menubar and clicks all desktops
    Then user clicks to mac at leftside menu
    And user scroll into mac text
    And user clicks button for adding product to wishlist three
    And user clicks on the wish list link in the displayed success message

    Then close browser

Scenario: adding a product to 'Wish List' page from the Search Results page

  Given user is at the homepage
  When user enters product name in the search field
  And user clicks on search icon
  And user clicks on Add to Wish List in the Search Results Page
  And user clicks on the wish list link in the displayed success message
  And user enters "ZeydinToprak@hotmail.com" and "123456" to login
  And user checks product availability in wishlist

  Then close browser



