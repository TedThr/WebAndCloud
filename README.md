*Projet TinyPet :*

Ce projet a été réalisé par Teddy THIRION, Mahdi CHAKER et Walid KACI.

Le but du projet est de réaliser une application web pour des pétitions comme Avaaz ou Change.org. Les pétitions peuvent être signées par des millions de personnes. Cette application a nécessité l&#39;utilisation de Mithril, Google Cloud Endpoint, des services REST et datastore ( Bigtable ).

Voici les liens qui vous permettront d&#39;accéder au différents supports et à l&#39;application réalisé :

- Lien vers l&#39;application : [https://projet-petition.appspot.com/](https://projet-petition.appspot.com/)
- Lien vers le github : [https://github.com/TedThr/WebAndCloud](https://github.com/TedThr/WebAndCloud)

*Fonctionnalités implémentées :*

Dans ce qui suit, la liste des fonctionnalités implémentés pour la réalisation du projet :

- Créer une pétition (voir plusieurs)
- Visualiser les pétitions créées
- Signer des pétitions
- Visualiser les pétitions signées
- Visualiser le top100 pétitions les plus signées
- Rechercher une pétition par tag (non fonctionnelle)

*Fonctionnalités opérationnels :*

Les fonctionnalités sont testées et nous avons vérifié si elles étaient scalables. Nous visons au maximum un temps inférieur à 500ms. Voici nos résultats :

- Créer une pétition :

 ![CréerPet](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/creerPet.png) 

- Visualiser les pétitions créées :

 ![VisuPet](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/visuCreate.png) 

- Signer une pétition :

 ![SignerPet](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/signerPet.png) 

- Visualiser les pétitions signées :

 ![SignedPet](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/visuSigned.png) 

- Visualiser le top100 pétitions les plus signées :

 ![top100](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/top1000.png) 


*Fonctionnalités non opérationnels :*

La fonctionnalité de recherche par tag a été implémentée mais ne fonctionne pas. Nous avons mené de nombreux essais avec différentes solutions mais non concluantes. Aucune erreur n&#39;apparaît dans la console.

*Améliorations possibles :*

Lors de la double signature, le message indiquant que la signature est prise en compte s&#39;affiche :

 ![alertSigned](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/alertSigned.png) 

Sauf que cette signature en doublant n&#39;est pas prise en compte. La signature est comptée une seule fois :

 ![if](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/if.png) 

*Capture d&#39;écran des Tables :*

Datastore : entité Petition:
 ![tabPet1](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/tabPet1.png) 
 
 ![tabPet2](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/tabPet2.png) 
 
 ![tabPet3](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/tabPet3.png)  

Pour assurer le tri par date, nous avons décidé d&#39;ajouter la date à la clé des pétitions la date du jour lors de la création. Nous avons repris exemple sur le code de notre professeur puisqu&#39;il a bien spécifié qu&#39;il était très utile d&#39;avoir la date dans l&#39;id d&#39;une pétition. Également, pour être sûr que l&#39;idée est unique, nous avons ajouté le nom de l&#39;utilisateur qui créer la pétition dans l&#39;Id, étant donné qu&#39;un utilisateur ne pourra pas créer deux pétitions exactement au même moment, on est sûr que l&#39;id sera unique.

 ![newEntity](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/newEntity.png) 

*Conclusion :*

Nous avons trouvé ce travail très intéressant. En effet, l&#39;utilisation de GCP était nouvelle pour nous et, c&#39;est un outil très puissant qui pourra nous aider à développer des applications Webs assez facilement dans le futur. Le fait que la connexion soit gérée facilement est vraiment un très grand plus, également, la base de données est bien plus agréable à manipuler qu&#39;en SQL classique. Les requêtes sont vraiment moins longues que d&#39;habitude.

Également, c&#39;était la première fois que nous utilisions l&#39;API Google et que nous faisions autant de développement en JS, cela servira potentiellement dans notre vie futur puisque le JS est une technologie qui a le vent en poupe, et certains l&#39;utilisent même en stage actuellement.

*Annexes :*

- Page de connexion: cliquer sur le bouton connexion puis renseigner votre mail

 ![pageCo](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/pageCo.png) 

- Page d&#39;accueil : arrivé à la page d&#39;accueil, les fonctionnalités sur la barre de tache en fond noirs et avec une propositions des 4 pétitions les plus signés comme premier titre, les 4 pétitions les moins signés, les 4 dernières pétitions et enfin les 4 pétitions les plus anciennes.

 ![pageAcc1](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/pageAcc1.png) 
 
 ![pageAcc2](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/pageAcc2.png) 
 
 ![pageAcc3](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/pageAcc3.png) 
 
 ![pageAcc4](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/pageAcc4.png)
- Créer une pétition : cliquer sur le bouton &quot; créer une pétition&quot; , cette page s&#39;affiche puis renseigner les champs puis cliquer sur créer.
- 

 ![pageCreerPet](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/pageCreer.png) 

  -
- Mes pétitions : cliquer sur le bouton &quot;Mes pétitions&quot; pour visualiser les pétitions créées.

 ![pageMesPets](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/pageMesPets.png)

- Mes signatures : cliquer sur &quot;Mes signatures&quot; pour visualiser les signatures des pétitions.

 ![pageMySigned](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/pagesMesSigned.png)

- Top 100 : cliquer sur Top100 pour visualiser le top 100 des pétitions les plus signées avec la date de création renseignée.

 ![pageTop100](https://github.com/TedThr/WebAndCloud/blob/main/imgReadme/PageTop100.png)
