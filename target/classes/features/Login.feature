Feature: Login admin WJC
  Scenario: Admin valid login WJC
    Given Open browser and url
    When Input username yang terdaftar
    And Input password yang terdaftar
    And Click button sign-in
    Then Get to page dashboard

  Scenario: Admin logout WJC
    Given Click profil
    And Click button logout

  Scenario: Admin masuk dengan password tidak terdaftar
    Given Input username yang terdaftar
    When Input password yang tidak terdaftar
    And Click button sign-in
    Then Get message username atau password salah

  Scenario: Admin masuk dengan username tidak terdaftar
    Given Input username yang tidak terdaftar
    When Input password yang terdaftar
    And Click button sign-in
    Then Get message username atau password salah

  Scenario: Admin simpan username menggunakan nomor handphone
    Given Input username menggunakan nomor handphone
    When Input password yang terdaftar
    And Click button sign-in
    Then Get message username atau password salah

  Scenario: Admin masuk dengan password menggunakan huruf kapital
    Given Input username yang terdaftar
    When Input password yang terdaftar menggunakan huruf kapital
    And Click button sign-in
    Then Get message username atau password salah

  Scenario: Admin masuk dengan password menggunakan angka
    Given Input username yang terdaftar
    When Input password menggunakan angka
    And Click button sign-in
    Then Get message username atau password salah

  Scenario: Admin tanpa input username dan password
    Given Tanpa input username
    When Tanpa input password
    And Click button sign-in
    Then Get message username atau password kosong
    And Click button ok