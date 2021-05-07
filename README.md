# WebAndCloud
Projet TinyPet :

	Ce projet a été réalisé par Teddy THIRION, Mahdi CHAKER et Walid KACI.
Le but du projet est de réaliser une application web pour des pétitions comme Avaaz ou Change.org. Les pétitions peuvent être signées par des millions de personnes. Cette application a nécessité l’utilisation de Mithril, Google Cloud Endpoint, des services REST et datastore ( Bigtable ).

 Voici les liens qui vous permettront d’accéder au différents supports et à l’application réalisé :

Lien vers l’application : https://projet-petition.appspot.com/
Lien vers le github : https://github.com/TedThr/WebAndCloud



Fonctionnalités implémentées :

 Dans ce qui suit, la liste des fonctionnalités implémentés pour la réalisation du projet :

Créer une pétition (voir plusieurs)
Visualiser les pétitions créées
Signer des pétitions
Visualiser les pétitions signées
Visualiser le top100 pétitions les plus signées
Rechercher une pétition par tag (non fonctionnelle)


Fonctionnalités opérationnels :

  Les fonctionnalités sont testées et nous avons vérifié si elles étaient scalables. Nous visons au maximum un temps inférieur à 500ms. Voici nos résultats : 

Créer une pétition : 


Visualiser les pétitions créées : 

Signer une pétition : 


Visualiser les pétitions signées :


Visualiser le top100 pétitions les plus signées :


Fonctionnalités non opérationnels :

La fonctionnalité de recherche par tag a été implémentée mais ne fonctionne pas. Nous avons mené de nombreux essais avec différentes solutions mais non concluantes. Aucune erreur n'apparaît dans la console. 

Améliorations possibles :

Lors de la double signature, le message indiquant que la signature est prise en compte s’affiche : 

Sauf que cette signature en doublant n’est pas prise en compte. La signature est comptée une seule fois : 






Capture d'écran des Tables :

Datastore : entité Petition: 





Pour assurer le tri par date, nous avons décidé d’ajouter la date à la clé des pétitions la date du jour lors de la création. Nous avons repris exemple sur le code de notre professeur puisqu’il a bien spécifié qu’il était très utile d’avoir la date dans l’id d’une pétition. Également, pour être sûr que l’idée est unique, nous avons ajouté le nom de l’utilisateur qui créer la pétition dans l’Id, étant donné qu’un utilisateur ne pourra pas créer deux pétitions exactement au même moment, on est sûr que l’id sera unique.




Conclusion :

Nous avons trouvé ce travail très intéressant. En effet, l’utilisation de GCP était nouvelle pour nous et, c’est un outil très puissant qui pourra nous aider à développer des applications Webs assez facilement dans le futur. Le fait que la connexion soit gérée facilement est vraiment un très grand plus, également, la base de données est bien plus agréable à manipuler qu’en SQL classique. Les requêtes sont vraiment moins longues que d’habitude.
Également, c’était la première fois que nous utilisions l’API Google et que nous faisions autant de développement en JS, cela servira potentiellement dans notre vie futur puisque le JS est une technologie qui a le vent en poupe, et certains l’utilisent même en stage actuellement.

Annexes :

Page de connexion: cliquer sur le bouton connexion puis renseigner votre mail


  Page d’accueil : arrivé à la page d'accueil, les fonctionnalités sur la barre de tache en fond noirs et avec une propositions des 4 pétitions les plus signés comme premier titre, les 4 pétitions les moins signés, les 4 dernières pétitions et enfin les 4 pétitions les plus anciennes.






Créer une pétition : cliquer sur le bouton “ créer une pétition” , cette page s’affiche puis renseigner les champs puis cliquer sur créer.



Mes pétitions : cliquer sur le bouton “Mes pétitions" pour visualiser les pétitions créées.


Mes signatures : cliquer sur “Mes signatures” pour visualiser les signatures des pétitions.







Top 100 : cliquer sur Top100 pour visualiser les top 100 des pétitions les plus signées avec la date de création renseignée.

