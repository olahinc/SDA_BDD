Feature: Logowanie do aplikacji

  Jako użytkownik chcę mieć możliwość zalogowania się do apliakcji aby móc korzystać z zaawansowanych funkcji systemu

  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres https://the-internet.herokuapp.com/login
    When Uzytkownik wpisuje poprawny username
    And Uzytkownik wpisuje pooprawny password
    And Uzytkownik klika przycisk Login
    Then Uzytkownik zostaje poprawnie zalogowany

  Scenario: Nieppprawne logowanie
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres https://the-internet.herokuapp.com/login
    When Uzytkownik wpisuje poprawny username
    And Uzytkownik wpisuje niepoprawne password
    And Uzytkownik klika przycisk Login
    Then Uzytkownik nie zostaje zalogowany

  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje "tomsmith" w pole username
    And Uzytkownik wpisuje "SuperSecretPassword!" w pole password
    And Uzytkownik klika przycisk Login
    Then Uzytkownik zostaje poprawnie zalogowany

  @now
  Scenario: Miepoprawne logowanie do aplikacji (druga wersja)
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje "tomsmith" w pole username
    And Uzytkownik wpisuje " " w pole password
    And Uzytkownik klika przycisk Login
    Then Uzytkownik zostaje poprawnie zalogowany

