Feature:
  Translate english to piglatin

  Scenario: word that starts with consonant
    Given a word "hello"
    When we translate it
    Then the word should "ellohay"

  Scenario: word that starts with vowel
    Given a word "apples"
    When we translate it
    Then the word should "applesay"

  Scenario: translate a phrase
    Given a word "eat world"
    When we translate it
    Then the word should "eatay orldway"

  Scenario: word that starts with capital letter
    Given a word "Hello"
    When we translate it
    Then the word should "Ellohay"