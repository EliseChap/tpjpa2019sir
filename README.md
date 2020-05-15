# TP JPA 

Ce projet utilise JPA pour la base de donnée.
C'est le backend d'une application de prise de RDV de type Doodle 

## Installation

### Sous windows
Pour lancer la base de données, il vous faut ouvrir, dans l'ordre, les deux fichiers suivants:
  - run-hsqldb-server.bat
  - show-hsqldb.bat => Une fois le fichier lancé, vous devez changer l'URL par : jdbc:hsqldb:hsql://localhost/
  
### Sous Linux
Pour lancer la base de données, il vous faut ouvrir, dans l'ordre, les deux fichiers suivants:
  - run-hsqldb-server.sh
  - show-hsqldb.sh => Une fois le fichier lancé, vous devez changer l'URL par : jdbc:hsqldb:hsql://localhost/

Dans un IDE, lancer JPAtest.java si vous souhaitez préremplir la base avec quelques informations.
Pour finir, lancer le serveur Maven> Build...> mvn tomcat7:run

## Informations utiles

Le frontend du projet se trouve sur ce repository: https://github.com/EliseChap/frontProjetJPA

# TP réalisé par
Elise CHAPON
Hajar JAHOUI
