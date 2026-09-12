# TP8

# Exercice 1 - Système de paiement extensible (interfaces)

* Cet exercice consiste à mettre en place un système de paiement flexible en utilisant une **interface** au lieu de créer une hiérarchie basée sur l’héritage.
* L’interface `PaymentMethod` définit les opérations communes à tous les moyens de paiement : effectuer un paiement (`pay`), réaliser un remboursement (`refund`) et retourner le nom du moyen utilisé (`getName`). Elle définit uniquement les méthodes à respecter, sans fournir leur implémentation.
* Les classes `CreditCard`, `PayPal` et `Bitcoin` implémentent cette interface. Chacune possède ses propres informations, comme le numéro de carte, l’adresse e-mail ou l’adresse du portefeuille, ainsi qu’une manière particulière de gérer les paiements et les remboursements.
* La classe `PaymentProcessor` conserve plusieurs objets `PaymentMethod` dans un tableau dynamique. Celui-ci peut être agrandi automatiquement lorsque cela est nécessaire. Pour chaque moyen de paiement, le processeur effectue un paiement puis réalise le remboursement de la moitié du montant.
* L’objectif principal est de montrer le **découplage** entre les différentes classes. `PaymentProcessor` travaille uniquement avec l’interface `PaymentMethod` et n’a pas besoin de connaître le fonctionnement interne de `CreditCard`, `PayPal` ou `Bitcoin`.
* Ainsi, si l’on souhaite ajouter un nouveau moyen de paiement, comme `ApplePay`, il suffit de créer une nouvelle classe qui implémente `PaymentMethod`. Le fonctionnement de `PaymentProcessor` reste inchangé.

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 033323.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 033331.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 033343.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 033352.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 033411.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 033418.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 033425.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 033436.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 033444.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 033455.png" />

# Exercice 2 - Système de notification extensible (interfaces + tri)

* Dans cet exercice, on développe un système capable de gérer plusieurs types de notifications en utilisant une interface commune.
* L’interface `Notification` impose trois méthodes à chaque canal de notification : envoyer un message avec `send`, fournir son niveau de priorité avec `getPriority` et préciser son type grâce à `getType`.
* Les classes `EmailNotification`, `SMSNotification` et `PushNotification` implémentent cette interface. Chaque classe possède sa propre façon d’envoyer une notification ainsi qu’un niveau de priorité déterminé.
* La classe `NotificationManager` stocke les différents canaux dans un tableau dynamique qui peut augmenter automatiquement de taille. Avant d’envoyer le message, les notifications sont classées selon leur priorité, de la plus élevée à la plus faible.
* Cette organisation permet de traiter en premier les moyens de communication les plus importants ou les plus urgents, par exemple les SMS.
* Comme dans le premier exercice, `NotificationManager` ne dépend pas directement des classes `EmailNotification`, `SMSNotification` ou `PushNotification`. Il utilise uniquement les méthodes définies par l’interface `Notification`.
* Cette conception facilite l’évolution du programme : pour ajouter un nouveau canal, comme `SlackNotification`, il suffit de créer une classe qui implémente l’interface, sans modifier le fonctionnement du gestionnaire. Cela illustre le principe **Open/Closed**.

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 034209.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 034225.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 034341.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 034348.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 034402.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 034413.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 034424.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-12 034434.png" />
