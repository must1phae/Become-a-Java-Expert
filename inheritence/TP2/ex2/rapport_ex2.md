# Rapport – Exercice TP2 / ex2 (Héritage et Comptage des Étudiants)

## 1. Objectif de l'exercice
Mettre en pratique l'héritage en Java pour modéliser différentes catégories de personnes liées à une institution (personnes générales, personnel, enseignants, secrétaires, étudiants réguliers et transférés), tout en ajoutant un mécanisme de comptage automatique des instances créées.

## 2. Hiérarchie des classes
```
persone
 ├── staff
 │    ├── secretaire
 │    └── enseignant
 └── ET
      ├── etudiantR   (étudiant régulier)
      ├── etudiantT   (étudiant transféré)
      └── est         (compteur spécifique supplémentaire)
```

### persone
- Attributs: `nom`, `annee` (année de naissance ou d'entrée), compteur statique `nombrePersones`.
- Rôle: Classe de base commune. Incrémente le compteur global à chaque instanciation.

### staff (extends persone)
- Attributs: `nomLabo`, `salaire`.
- Sous-classes: `secretaire`, `enseignant`.

### secretaire (extends staff)
- Pas d'attributs supplémentaires, hérite le comportement de `staff`.

### enseignant (extends staff)
- Attribut supplémentaire: `nomSection`.
- Redéfinit `afficher()` pour inclure la section.

### ET (extends persone)
- Attributs: `section`, `moyenne`, `uniorigine`.
- Méthode statique `afficherTotalEtudiants()` qui calcule le total des étudiants (R + T) via les compteurs des sous-classes.

### etudiantR (extends ET)
- Constructeur fixe `uniorigine` à "N/A".
- Compteur statique `nombreEtudiantsR` + getter.

### etudiantT (extends ET)
- Ajoute `uniorigine` réel (université d'origine).
- Compteur statique `nombreEtudiantsT` + getter.

### est (extends ET)
- Ajoute un compteur séparé `nombreEstsiens` et méthode d'affichage dédiée (optionnel selon besoin pédagogique).

## 3. Mécanisme des compteurs
- `persone.nombrePersones`: total de toutes les instances dérivées de `persone` (inclut staff, ET et sous-classes).
- `etudiantR.nombreEtudiantsR`: total des étudiants réguliers.
- `etudiantT.nombreEtudiantsT`: total des étudiants transférés.
- `ET.afficherTotalEtudiants()`: additionne les deux précédents pour afficher le total des étudiants.
- `est.nombreEstsiens`: compteur spécifique si l'on veut suivre ce type distinct.

## 4. Exemple d'exécution (sortie observée)
```
Secretaire :
amina
2000
safi
7000.0
Enseignant :
youssef
1999
cs
9000.0
info
Etudiant Régulier :
ali
2001
cs
15.5
Etudiant Transferé :
hassan
2002
is
16.5
ueu
Nombre total d'etudiants: 2
Nombre total de ESTIENT: 4
```
Interprétation:
- 2 étudiants (1 régulier + 1 transféré).
- 4 "persones" au total (secretaire, enseignant, et les deux étudiants).

## 5. Points forts
- Utilisation claire de l'héritage pour factoriser `nom` et `annee`.
- Compteurs statiques utiles pour des statistiques globales.
- Méthode centralisée `ET.afficherTotalEtudiants()`.

## 6. Améliorations possibles
1. Nommage: Utiliser la convention Java pour les classes (`Personne`, `EtudiantR`, etc.) et éviter les noms tout en minuscules.
2. Encapsulation: Marquer les attributs privés et ajouter des getters explicites partout (cohérence).
3. Polymorphisme: Ajouter une méthode abstraite (ex: `type()` ou `role()`) dans `persone` pour afficher dynamiquement le type.
4. Internationalisation: Éviter de mélanger français/anglais dans le code (ex: `staff`, `secretaire`).
5. Suppression de la classe `est` si son rôle n'est pas distingué fonctionnellement de `ET`.
6. Validation: Ajouter des contrôles (moyenne entre 0 et 20, salaire non négatif, etc.).
7. Regroupement d'affichage: Centraliser le formatage dans une méthode utilitaire pour éviter la duplication.
8. Utiliser une interface (ex: `Affichable`) si plusieurs hiérarchies doivent partager `afficher()`.
9. Tests unitaires: Vérifier que les compteurs augmentent correctement et ne sont pas modifiés par erreur.
10. Construction: Remplacer les `System.out.println` par un logger pour des applications plus grandes.

## 7. Exemple de refactorisation future (esquisse)
```java
public abstract class Personne {
    private final String nom;
    private final int annee;
    private static int compteur;
    protected Personne(String nom, int annee) {
        this.nom = nom;
        this.annee = annee;
        compteur++;
    }
    public static int getCompteur() { return compteur; }
    public abstract String role();
    public void afficher() {
        System.out.println(role() + " : " + nom + " (" + annee + ")");
    }
}
```

## 8. Conclusion
Cet exercice illustre efficacement l'héritage, la réutilisation de code et l'usage de membres statiques pour des statistiques globales. Avec quelques améliorations structurelles et de style, il peut servir de base à un mini-modèle orienté objet propre et extensible.

---
Rapport généré automatiquement.
