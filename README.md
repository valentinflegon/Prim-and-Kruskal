# Algo_tp_3

* Classe Path (nos aretes)
  un Path est reprsenté par un node de depart, d'arrivé, d'un poid et d'une variable permettant de savoir si on l'utilise ou non.

* Classe Node (nos sommets)
  un Node possède une liste de transition arrayOfPath, d'une variable isUsed pour savoir si on utilise ce node, un index ainsi qu'un x et un y de position. Nous l'utiliserons comme un somment et aura des transitions vers un autre node.
  
* Classe Graph 



 * Classe Kruskal
L'algorithme de Kruskal est un algorithme de recherche d arbre couvrant minimum (ACM) dans un graphe connexe non-orienté et pondéré. Il a été conçu en 1956 par Joseph Kruskal.

methode arrayListOfNodeWhereSortPath va récuperer toutes les transitions de la liste de node du graph et les trier via un sort et retourner la liste trié 

méthode findBestPath va céer une liste arrayListSortPath un liste des transitions trié et chercher la meilleur, c'est a dire avec un poid minimal sans pour autant faire un cycle. On retournera le meilleur chemin 

méthode kruskal nous allons avec faire l'appel de la fonction précedante findBestPath mettre les nodes de cette transitions a l'etat used, et egalement les ajouter a la liste des nodes used. Tout cela tant que la taille du graph de nodes used et differents du nombre de nodes .Nours retournerons la somme  des paths.

  * Classe Prim 
L'algorithme de Prim est un algorithme glouton qui calcule un arbre couvrant minimal (ACM) dans un graphe connexe valué et non orienté. Cet algorithme trouve un sous-ensemble d'arêtes formant un arbre sur l'ensemble des sommets du graphe initial, et tel que la somme des poids de ces arêtes soit minimale.

 
  methode findBestPath(): La fonction findBestPath va chercher dans une liste  de node dans le graph et retourner le meilleur chemin. Pour cela on initialise un poid et un node initial que l'on ajoute dans une liste de node utilisé (on a pris le premier node rentré et sa premiere transition). On parcours une liste de node utilisé au premier tour nous serons donc sur notre node initial, et nous parcourons toutes ses trensitions; si la transition on peut alors l'utilisé sinon cela signifie que l'utilisons deja dans notre acm.Si nous trouvons une transition inferieur alors nous la choissons.
 Quand nous aurons cette transition min alors on va mettre la valeur du path a used egale true ajouté son poid a la somme de poids et retourner ce chemin.
  
  
  methode prim(): Nous allons ajouté le node de départ dans notre liste de node utilisé,  nous recuperons le meilleurs transition sur notre liste de node used et ajoutons son node final a la liste des nodes used. Nous effecturons l'action suivante tant quand la liste de node used et differente a la liste de node.Et retournons la somme des chemins avec getSommePath().
  
  
