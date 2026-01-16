# ePay - Application de Gestion de Reçus et Paiements

ePay est une application Android moderne conçue pour la gestion sécurisée des reçus de paiement et l'automatisation des transactions via QR Code. Ce projet suit les principes rigoureux de la **Clean Architecture** et du pattern **MVVM**.

## 🚀 Fonctionnalités
- **Scan & Génération de QR Code** : Paiements rapides entre utilisateurs et commerçants.
- **Gestion des Reçus** : Historique complet des transactions stocké localement.
- **Sécurité Avancée** : Chiffrement AES-256 des données sensibles via Android Keystore.
- **Mode Premium** : Système d'abonnement avec vérification de validité.
- **Génération PDF** : Exportation des reçus pour une comptabilité simplifiée.

## 🏗️ Architecture (Clean Architecture)
Le projet est divisé en trois couches principales pour assurer la testabilité et la maintenance :

1.  **Data Layer** : Implémentation de Room (Base de données locale) et Retrofit (API distante).
2.  **Domain Layer** : Contient les modèles métier (`Receipt`, `User`) et les cas d'utilisation (`UseCases`). C'est le cœur de l'application.
3.  **UI Layer (Presentation)** : Utilisation de ViewModels et d'Activities avec Flow pour une interface réactive.



## 🛠️ Stack Technique
- **Language** : Kotlin
- **Base de données** : Room Persistence Library
- **Réseau** : Retrofit 2 & Gson
- **Sécurité** : Jetpack Security (EncryptedSharedPreferences)
- **Asynchronisme** : Kotlin Coroutines & Flow

## 📁 Structure du Projet
```text
com.epay.app
├── data          # Sources des données (Local & Remote)
├── domain        # Logique métier et interfaces (Pure Kotlin)
├── ui            # Interface utilisateur (MVVM)
├── security      # Gestion du chiffrement
└── utils         # Générateurs (PDF, QR) et helpers
```

## 🛡️ Sécurité
Toutes les données sensibles (tokens, informations personnelles) sont chiffrées avant stockage. L'application vérifie l'intégrité du réseau avant chaque transaction pour prévenir les attaques "Man-in-the-Middle".

---
*Projet développé avec passion via Termux.*
Build trigger
