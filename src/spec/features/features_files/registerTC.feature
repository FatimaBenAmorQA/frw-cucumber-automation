Feature: Enregistrer un utilisateur apres son ajout 
En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer 
  @moduleregister
  Scenario Outline:  Je verifie la creation d un compte Mercury
 Given Je me connecte sur l application Mercury 
    When Je clique sur le bouton Register 
    And Je saisie le firstname "<firstname>"
    And Je saisie le lastname "<lastname>"
    And Je saisie le numero de telephone "<phone>"
    And Je saisie le mail "<email>"
    And Je saisie l adresse "<adress>"
    And Je sasie le city "<city>"
    And Je saisie le province "<province>"
    And Je saisie le code postale "<codepostale>"
    And Je selectionne le pays "<pays>"
    And Je saisie username "<username>"
    And je saisie password "<password>"
    And je confirme le password "<confirmpassword>"
    And je clique sur le bouton soumettre
    Then je me redirige vers la page registerSuccess "Thank you for registering. You may now"             

    Examples: 
      | firstname  | lastname    | phone    |          email               |    adress   |    city      |  province   | codepostale  |    pays       | username     |password    |confirmpassword|
      | fatima     |   ben amor  | 23016114 |   fatima.benamor@gmail.com   |    soukra   |    soukra    |    Ariana   |     2036     |    TUNISIA    |   fatima     |  fatima    |   fatima      |                    
      | ftayma     |    ayari    | 20189661 |    ftayma.benamor@gmail.com  |    aouina   |    aouina    |  Tunisie    |      2045    |    TUNISIA    |    ftayma    |   ftayma   |   ftayma      |            
