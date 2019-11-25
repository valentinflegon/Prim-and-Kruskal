# Algo_tp_3

Classe Path 
  un Path est reprsenté par un node de depart, d'arrivé, d'un poid et d'une variable permettant de savoir si on l'utilise ou non.

Classe Node 
  un Node possède une liste de transition arrayOfPath, d'une variable isUsed pour savoir si on utilise ce node, un index ainsi qu'un x et un y de position.
  
Classe Graph 

Classe Prim 

Classe Kruskal

 methode prim(): on ajoute le chemin minimal a notre acm 
 
 methode findBestPath(): a fonction findBestPath va chercher dans une liste  de node dans le graph et retourner le meilleur chemin. Pour cela on initialise un poid et un node initial que l'on ajoute dans une liste de node utilisé (on a pris le premier node rentré et sa premiere transition). On parcours une liste de node utilisé au premier tour nous serons donc sur notre node initial, et nous parcourons toutes ses trensitions; si la transition on peut alors l'utilisé sinon cela signifie que l'utilisons deja dans notre acm.Si nous trouvons une transition inferieur alors nous la choissons.
 Quand nous aurons cette transition min alors on va mettre la valeur du path a used egale true ajouté son poid a la somme de poids et retourner ce chemin.
  
  
  
