Feature: Je verifie la creation d un compte Mercury
  En tant que utilisateur je souhaire remplire la formulaire  a l application Mercury

  @register
  Scenario: Je verifie la creation d un compte Mercury
    Given Je me connecte sur l application Mercury 
    When Je clique sur le bouton Register 
    And Je saisie le firstname "test"
    And Je saisie le lastname "test"
    And Je saisie le numero de telephone "23016114"
    And Je saisie le numero de telephone "23016114"
    And Je saisie le mail "fatima.benamor96@gmail.com"
    And Je saisie l adresse "soukra Ariana"
    And Je sasie le city "Ariana"
    And Je saisie le province "soukra"
    And Je saisie le code postale "2036"
    And Je selectionne le pays "TUNISIA"
    And Je saisie username "fatima"
    And je saisie password "fatima"
    And je confirme le password "fatima"
    And je clique sur le bouton soumettre
    Then je me redirige vers la page registerSuccess "Thank you for registering. You may now" 
