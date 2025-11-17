# 🚗✨ Héritage & Polymorphisme – Gestion d’un Parc de Véhicules

## 🎯 Objectif de l’exercice

Cet exercice vise à pratiquer :

- 🧬 Héritage
- 🔁 Polymorphisme (override)
- 🏷 Classes abstraites
- 🧮 Compteurs statiques
- 📦 Manipulation d’objets via des références du type parent

But: modéliser un parc de véhicules et utiliser le polymorphisme pour des comportements de démarrage spécifiques selon le type réel.

## 🏛️ Hiérarchie des classes

```text
Vehicule (abstract)
 ├── Voiture
 ├── Moto
 └── Camion
```

## 📋 Tableau récapitulatif

| Classe     | Hérite de | Attributs clés                       | Méthodes redéfinies |
|------------|-----------|--------------------------------------|---------------------|
| Vehicule   | —         | `marque`, `annee`, `nombreVehicules` | `demarrer()` (abstraite), `afficherInfo()` |
| Voiture    | Vehicule  | `nombrePortes`                       | `demarrer()`        |
| Moto       | Vehicule  | `typeGuidon`                         | `demarrer()`        |
| Camion     | Vehicule  | `capaciteCharge` (tonnes)            | `demarrer()`        |

## 🚘 Vehicule (Classe abstraite)

📌 Classe de base pour tous les véhicules.

### Attributs – Classe de base

- 🏷 `marque`
- 📅 `annee`
- 🔢 `nombreVehicules` (compteur statique)

### Méthodes – Classe de base

- 🔧 `afficherInfo()` — affiche les informations communes
- 🏁 `demarrer()` — abstraite, redéfinie dans les sous-classes

## 🚗 Voiture (extends Vehicule)

### Attribut – Voiture

- 🚪 `nombrePortes`

### Redéfinition – Voiture

> La voiture démarre avec un moteur essence.

## 🏍 Moto (extends Vehicule)

### Attribut – Moto

- 🕹 `typeGuidon`

### Redéfinition – Moto

> La moto démarre en tournant la poignée.

## 🚚 Camion (extends Vehicule)

### Attribut – Camion

- ⚖️ `capaciteCharge` (en tonnes)

### Redéfinition – Camion

> Le camion démarre avec un moteur diesel puissant.

## 🧠 Polymorphisme (Overriding)

Grâce à des références de type `Vehicule`, on manipule des objets différents :

```java
Vehicule v = new Camion(...);
v.demarrer(); // Exécute la version spécifique au camion
```

➡️ La méthode appelée dépend du type réel de l’objet. C’est le polymorphisme d’exécution.

## 🔢 Compteur de véhicules

À chaque instanciation d’un véhicule :

```java
nombreVehicules++;
```

Ce compteur donne le nombre total d’objets créés.

## 🖥️ Exemple d’exécution

```text
--- Informations véhicules ---
Voiture : Toyota (2018), 4 portes
La voiture démarre avec un moteur essence.

Moto : Honda (2022), guidon sport
La moto démarre en tournant la poignée.

Camion : Volvo (2015), charge 12.0 tonnes
Le camion démarre avec un moteur diesel puissant.

Nombre total de véhicules : 3
```

## ⭐ Points forts pédagogiques

- 🎨 Hiérarchie claire et extensible
- 🎭 Polymorphisme parfaitement illustré
- 🔢 Utilisation de compteurs statiques
- 🧱 Classe abstraite bien utilisée
- 🔁 Code réutilisable et évolutif

## 🚀 Améliorations possibles

- Ajouter `Garage` avec `ArrayList<Vehicule>`
- Ajouter une interface `Reparable`
- Ajouter une méthode polymorphique `calculerTaxe()`
- Valider les données (année, charge, etc.)
- Utiliser un logger au lieu de `System.out.println` pour les projets avancés

## 🧩 Exemple de refactorisation (version plus propre)

```java
public abstract class Vehicule {
    private String marque;
    private int annee;
    private static int compteur;

    public Vehicule(String marque, int annee) {
        this.marque = marque;
        this.annee = annee;
        compteur++;
    }

    public static int getCompteur() {
        return compteur;
    }

    public void afficherInfo() {
        System.out.println(marque + " (" + annee + ")");
    }

    public abstract void demarrer();
}
```

## 🏁 Conclusion

Cet exercice combine :

- Héritage
- Polymorphisme
- Abstraction
- Compteurs statiques

…tout en restant très proche de situations réelles.
