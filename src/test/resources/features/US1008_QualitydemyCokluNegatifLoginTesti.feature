Feature: US1008 Toplu kullanici listesi ile negatif login testi



  Scenario Outline: TC14 Kullanici listedeki kullanici bilgileri ile giris yapilamadigini test eder

    Given Kullanici "qdUrl" anasayfaya gider
    Then ilk login linkine click yapar
    And user email olarak "<email>" girer
    And password olarak "<password>" girer
    When login butonuna basar
    Then giris yapilamadigini test eder
    Examples:
      |email         | password  |
      |abd@gmail.com | 12345     |
      |abe@gmail.com | 12346     |
      |abf@gmail.com | 12347     |
      |abg@gmail.com | 12348     |

