# Resolving issues

- Vous avez un conflit au niveau des emails entre l'attribut de la classe Utilisateur et l'attribut de la classe Participants qui hérite de la classe Utilisateur. Il va falloir choisir où vous voulez conserver l'attribut.

- Pour les Collection<Date>, JPA ne gère pas cette situation. Il faut créer une classe MyDate personnalisée qui contient un attribut Date date. Ce qui donnera au niveau des classes nécessitant des collections : "Collection<MyDate> dates;".

