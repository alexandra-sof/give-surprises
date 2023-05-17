# Give surprises
The project consists of an application designed to manage a set of surprises.  
The application represents a generic system that is able to:
- use multiple types of surprises, through the implementation of a common interface
- implement various algorithms for storing and giving surprises
- use a powerful, random mechanism for generating a set of surprises

## OOP principles and notions
The program is based on the following OOP principles and notions:
- functionality reusability through inheritance
- data and functionality hiding through encapsulation
- wrapper methods and delegation
- class architecture design
- code structuring based on applicability, methods and classes
- using uppcasting in order to work with different types of objects  
- the design and using of interfaces in working with different components

## Architecture
### Surprises
There are three types of surprises:
- Fortune cookie 
- Candies
- Minion toy
The types of surprises are stored in an enum, called SurpriseTypes. 

The surprises are generated in a random manner, using the static method generate().

| Surprise | Algorithm to generate the surprise |
| :-:      |  --------------------------------- |
| FortuneCookie | The class contains a predefined array of fortune cookie messages. When generate() is called, the method generates a random number and chooses a message from the array accordingly.|
| Candies | The class contains a predefined array of types of candies. When generate() is called, the method generates two random numbers - one corresponding to the type of candy and the second one - representing the number of candies.|
| MinionToy | The types of minions are stored in an enum. Each minion is chosen in order, with the use of an internal counter.|

Each surprise extends the AbstractSurprise class, which uses the SurpriseTypes enum values to generate a surprise through the static method AbstractSurprise generateSurprise(SurpriseTypes type).
The AbstractSurprise class implements the ISurprise interface, which allows the user to "open” and enjoy the surprise.

### Storing surprises
The surprises are stored in three different types of containers:
- LIFO bag
- FIFO bag
- Random bag  
The types of containers are stored in an enum, called BagTypes. 
The containers define the storage method and especially the order in which the surprises are distributed. The containers extend the AbstractBag class, which implements the common interface IBag.
The IBag interface defines the containers' behaviour: add/take out surprises to/from a bag, return the empty status of the bag, get the type of bag, print the content of a bag.

### Creating the containers
The containers are created by using the factory design pattern, through the common interface IbagFactory.
The existence of an interface allows for several bag factories to be created depending, for example, on the type of collection being used.  Currently, the project uses only ArrayList to store the surprises, therefore only one BagFactory is created.
The containers are created according to their type, by using the BagTypes enum values.

### Creating surprises
A special class GatherSurprises is used to generate a set of random surprises. 
GatherSurprises does not allow creating new instances, nor inheritance, its implementation being final and having all methods being static. 
The class only implements two static methods, to generate either an array of random surprises or just one random surprise.
The behaviour of the class is similar to people randomly collecting and putting together bags of treats. 
Two methods of randomly generating surprises are being used:
- the one already implemented, which randomly generates a surprise of a certain type
- a random number used to choose the type of surprise generated at each step

### Sharing the surprises
In order to share the surprises the AbstractGiveSurprises class is defined, which is extended by three classes: GiveSurpriseAndApplause, GiveSurpriseAndHug and GiveSurpriseAndSing. The AbstractGiveSurprises class defines their behaviour: put (one surprise or a bag of surprises), give/giveAll, give with passion, return the empty status of the bag, get the type of bag, print the content of a bag.
In order to instantiate a type of GiveSurprise with passion (applause, hug, sing) the static method  AbstractGiveSurprises generateGiveWithPassion(GiveWithPassionTypes type, BagTypes bagType, int waitTime) function is called.

## Example of running the application
![picture1](Screenshots/pic1.jpg)
![picture2](Screenshots/pic2.jpg)
![picture3](Screenshots/pic3.jpg)
