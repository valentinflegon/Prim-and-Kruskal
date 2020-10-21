# Algo_tp_3
La classe graph va représenter un graphique avec pour attribut une liste de node, une liste de node utilisé et une liste de points.
Nous pouvons ajouter des nodes à notre graphique, des chemins, l'afficher avec la méthodes display.

## Classe UpgradeVersion
Dans la classe UpgradeVersion nous aurons la version améliorée de prim et kruskal.
Nous aurons pour attribut un graph, un tableau de path ainsi qu'un tableau de parent qui aura pour taille le nombre de Node de notre graph.

 * Prim va utiliser un UnionFind avec des tas, nous allons parcourir notre liste de path pour chaque node de la liste, afin de réaliser un tas avec les pahts 

* Kruskal va utiliser la méthode dite d’ « Union – Find » utilisant des « forêts » pour cela on parcourt les paths et afficher pour chacun l'index du node de debut, son poids et l'index du node de fin.


## Classe Kruskal
L'algorithme de Kruskal est un algorithme de recherche d arbre couvrant minimum (ACM) dans un graphe connexe non-orienté et pondéré. Il a été conçu en 1956 par Joseph Kruskal.

L'algorithme de Prim est un algorithme glouton qui calcule un arbre couvrant min

 * methode prim(): Nous allons ajouté le node de départ dans notre liste de node utilisé,  nous recuperons le meilleurs transition sur notre liste de node used et ajoutons son node final a la liste des nodes used. Nous effecturons l'action suivante tant quand la liste de node used et differente a la liste de node.Et retournons la somme des chemins avec getSommePath().


  ## Classe UpgradeVersion
Dans la classe UpgradeVersion nous aurons la version améliorée de prim et kruskal.
Nous aurons pour attribut un graph, un tableau de path ainsi qu'un tableau de parent qui aura pour taille le nombre de Node de notre graph.

 * Prim va utiliser un UnionFind avec des tas, nous allons parcourir notre liste de path pour chaque node de la liste, afin de réaliser un tas avec les paths. Le tableau parents va référencer le tas pour prim

* Kruskal va utiliser la méthode dite d’ « Union – Find » utilisant des « forêts » pour cela on parcourt les paths et afficher pour chacun l'index du node de debut, son poids et l'index du node de fin. Nous trions la liste des transitions avec initialisePaths qui va recupérer toutes les transitions du graph et les trier via bubbleSort un trie a bulle. Il va ensuite les ajoutés au l'un après l'autre en respectant le règle de kruskal.

 et les groupes différents (forêts) pour kruskal
