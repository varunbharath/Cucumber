Feature: GoogleForm

  Scenario Outline: login  should be success and failed

    Given : user should enter "<username>" and "<password>"
    When : user click the login button
    Then : user should be success or failed

    Examples:
      | username | password |
      |standard_user| secret_sauce|
      |secrertyu    |!234567      |

