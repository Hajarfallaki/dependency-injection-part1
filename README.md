# Dependency Injection - Partie 1

# 📌 Description
Ce projet illustre l'utilisation de l'Injection de Dépendances en Java, en passant par différentes méthodes :


 * Instanciation statique.
 * Instanciation dynamique.

# Utilisation du framework Spring :
 * Version XML.
 * Version annotations.

# 📂 Structure du projet
Le projet suit une architecture en couches :

 * dao/ : Contient l'interface IDao et son implémentation DaoImpl.
 * metier/ : Définit l'interface IMetier et son implémentation IMetierImpl, qui utilise IDao.
 * pres/ : Contient la classe PresentationV1 qui teste le fonctionnement.

# 🛠️ Technologies utilisées
Java (JDK 11+)
Maven (pour la gestion des dépendances)
Spring Framework (pour l'injection de dépendances)

1. **Cloner le dépôt** :
   
   ```bash
   git clone https://github.com/Hajarfallaki/dependency-injection-part1.git
   cd dependency-injection-part1


 2. **Compiler le projet** :
    
```bash
mvn clean install

 
3. **Exécuter la classe principale** :

```bash
 java -cp target/classes pres.PresentationV1

# 📜 Auteur
👩‍💻 Hajar Elfallaki-Idrissi

📅 Année : 2025
