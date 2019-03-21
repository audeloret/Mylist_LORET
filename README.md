# APPLICATION MY DOGS 

## Présentation du projet

My dogs est une application qui utilise une RecyclerView et un appel WebService à une API Rest codé en java.
Elle affiche 2 écrans : un avec une liste des races de chiens, un son mp3 d'aboiement ainsi que leurs prix et un autre écran avec une photo de la race du chien. Elle utilise une API que j'ai créée.


## Choix de l'API REST

J'ai choisis de créée ma propre API REST avec des races de chiens, leurs prix ainsi qu'une photo du chien.
[dog](https://github.com/audeloret/audeloret.github.io/blob/master/dogs.json)

Exemple : 

```bash
[
    {
      "name": "Australian Shepherd",
      "prix": 1300,
      "imageUrl":"https://d17fnq9dkz9hgj.cloudfront.net/breed-uploads/2018/08/australian-shepherd-detail.jpg?bust=1535565122&width=630"
    },

 {
      "name": "Beagle",
      "prix": 800,
      "imageUrl":"https://d17fnq9dkz9hgj.cloudfront.net/breed-uploads/2018/08/beagle-detail.jpg?bust=1535565158&width=630"
    }
]
```


## Consignes respectées 

   - Deux écrans : Un écran avec une liste et un écran avec un détail de l’item.
   - RecyclerView 
   - Appel WebService à une API Rest.
   - Architecture : MVC
   - Autre fonctionnalité : son mp3 


## Architecture 

J'ai modélisé une architecture MVC Model View Controller : 

```bash
Controller  
- CatRestAPI
- Controller
- DogItemClickListener

Model
- Change
- Chiens

View
- Chien Adapter
- MainActivity
- SecondActivity
```

## Fonctionnalités 
### Premier écran

- Liste avec le nom de la race du chien, un bouton qui fait un bruit d'aboiement et le prix :

![img_1](https://github.com/audeloret/Mylist_LORET/blob/master/img_1.png) 

### Deuxième écran

- En cliquant sur une race de chien, on découvre une image associé.

![img_2](https://github.com/audeloret/Mylist_LORET/blob/master/img_2.png)

