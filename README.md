# Algo_tp_3

## Classe Path 
(nos aretes)
  Un Path est reprsénté par un node de départ, d'arrivée, d'un poids et d'une variable permettant de savoir si on l'utilise ou non.

## Classe Node
(nos sommets)
  Un node possède une liste de transition arrayOfPath, d'une variable isUsed pour savoir si on utilise ce node, un index ainsi qu'un x et un y de position. Nous l'utiliserons comme un somment et aura des transitions vers un autre node.
  
## Classe Graph 
La classe graph va représenter un graphique avec pour attribut une liste de node, une liste de node utilisé et une liste de points.
Nous pouvons ajouter des nodes à notre graphique, des chemins, l'afficher avec la méthodes display.

## Classe Kruskal
L'algorithme de Kruskal est un algorithme de recherche d arbre couvrant minimum (ACM) dans un graphe connexe non-orienté et pondéré. Il a été conçu en 1956 par Joseph Kruskal.

* méthode arrayListOfNodeWhereSortPath va récupérer toutes les transitions de la liste de node du graph et les trier via un sort et retourner la liste triée. 

* méthode findBestPath va céer une liste arrayListSortPath un liste des transitions triée et chercher la meilleure, c'est a dire avec un poids minimal sans pour autant faire un cycle. On retournera le meilleur chemin. 

* méthode kruskal nous allons avec faire l'appel de la fonction précédente findBestPath mettre les nodes de cette transition à l'état used, et également les ajouter à la liste des nodes used. Tout cela tant que la taille du graph de nodes used et differente du nombre de nodes. Nous retournerons la somme  des paths.

  ## Classe Prim 
L'algorithme de Prim est un algorithme glouton qui calcule un arbre couvrant minimal (ACM) dans un graphe connexe valué et non orienté. Cet algorithme trouve un sous-ensemble d'arêtes formant un arbre sur l'ensemble des sommets du graphe initial, et tel que la somme des poids de ces arêtes soit minimale.

 
 * méthode findBestPath(): La fonction findBestPath va chercher dans une liste  de node dans le graph et retourner le meilleur chemin. Pour cela on initialise un poids et un node initial que l'on ajoute dans une liste de node utilisé (on a pris le premier node rentré et sa première transition). On parcourt une liste de node utilisé au premier tour nous serons donc sur notre node initial, et nous parcourons toutes ses transitions; si la transition on peut alors l'utiliser sinon cela signifie que l'utilisons déjà dans notre ACM. Si nous trouvons une transition inferieure alors nous la prenons.
 Quand nous aurons cette transition min alors on va mettre la valeur du path a used égale true ajouté son poid a la somme de poids et retourner ce chemin.
  
  
 * methode prim(): Nous allons ajouté le node de départ dans notre liste de node utilisé,  nous recuperons le meilleurs transition sur notre liste de node used et ajoutons son node final a la liste des nodes used. Nous effecturons l'action suivante tant quand la liste de node used et differente a la liste de node.Et retournons la somme des chemins avec getSommePath().
  
  ## Classe UpgradeVersion
Dans la classe UpgradeVersion nous aurons la version améliorée de prim et kruskal.
Nous aurons pour attribut un graph, un tableau de path ainsi qu'un tableau de parent qui aura pour taille le nombre de Node de notre graph.
 
 * Prim va utiliser un UnionFind avec des tas, nous allons parcourir notre liste de path pour chaque node de la liste, afin de réaliser un tas avec les paths. Le tableau parents va référencer le tas pour prim

* Kruskal va utiliser la méthode dite d’ « Union – Find » utilisant des « forêts » pour cela on parcourt les paths et afficher pour chacun l'index du node de debut, son poids et l'index du node de fin. Nous trions la liste des transitions avec initialisePaths qui va recupérer toutes les transitions du graph et les trier via bubbleSort un trie a bulle. Il va ensuite les ajoutés au l'un après l'autre en respectant le règle de kruskal.

 et les groupes différents (forêts) pour kruskal
