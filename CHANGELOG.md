# Changelog
All notable changes to this project shall be documented in this file.

## 2023-05-17
- reviewed and updated: nested code, duplicate code, hardcoded values, formatting and spacing;
- create a separate RandomGenerator class, that implements a static method int generateRandomInt(int limit), to be called by all other classes that need to generate instances randomly;
- create Enum SurpriseTypes;
- create AbstractSurprise class, which implements ISurprise interface and is inherited by Candies, FortuneCookie and MinionToy; 
- implement the static AbstractSurprise generateSurprise(SurpriseTypes type) method;
- update ISurprise, respectively Candies, FortuneCookie and MinionToy with the method SurpriseTypes getSurpriseType(); 
- create Enum GiveWithPassionTypes;
- update AbstractGiveSurprises class by implementing a static AbstractGiveSurprises generateGiveWithPassion(GiveWithPassionTypes type, BagTypes bagType, int waitTime) function
- update classes GiveSurpriseAndApplause, GiveSurpriseAndHug and  GiveSurpriseAndSing by changing the constructors's visibility from public to protected;
- update AbstractGiveSurprises class by implementing the functions BagTypes getBagType() and void printBag() through the use of delegation
- update AbstractGiveSurprises class by implementing private function void emptyBagMessage(); this function is called in void give() and void giveAll() functions
- update the static method ISurprise gather() from GatherSurprises class by using the SurpriseTypes enum values and calling the int generateRandomInt(int limit) on SurpriseTypes.values().length in order to randomly generate a Surprise;
- update IBag, respectively FifoBag, LifoBag and RandomBag with the method BagTypes getBagType();
- update AbstractBag class by implementing toString method and function print calling on toString;
- update IBag interface and AbstractBag class by deleting int size() function, as it is never used;
- rename Minions enum to MinionTypes;
- implement a static void generateAndGiveSurprises(GiveWithPassionTypes giveType, BagTypes bagType, int noSurprises, int waitTime) function in Main, which facilitates and automates the testing part of the project.

## 2023-05-06
- Add Architecture section in the README file, containing details about Surprises, Storing surprises, Creating surprises, Creating the containers and Sharing the surprises
- Add Console Screenshots to be used in the README file as example of running the application 
- Add example of running the application in the README file
- Add GitIgnore file
- Add Java files representing the initial version of the project

## 2023-05-05
- Add README file
- Add introduction section in the README file
- Add OOP principles and notions in the README file 
