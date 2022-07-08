# Mike's Results

````
***
Simulation of 2 dice tossed for 1000000 times.
***

 2:   27909: 0.03 ***
 3:   55824: 0.06 ******
 4:   83899: 0.08 *********
 5:  111496: 0.11 ************
 6:  138742: 0.14 **************
 7:  166072: 0.17 *****************
 8:  138649: 0.14 **************
 9:  110986: 0.11 ************
10:   83597: 0.08 *********
11:   55330: 0.06 ******
12:   28077: 0.03 ***
````

## Explanation

First, I created a `Dice` class. It has a constructor 
method ```Dice(Integer dice) ``` which takes one parameter, number of dice. I then
created a method called tossAndSum, which generates a random
number between 1-6 n amount of times, n being the number
of dice given in the constructor. 

I used ````6 * Math.random() + 1```` as my random number generator function. Math.random generates
a random double between 0.0 and 1.0. When multiplied by 6, the highest 
number it can output is 5.99. I then added 1 to get a number higher than
6.0 and less than 7.0 because the tossAndSum method returns an int,
and when Java casts a double to an int it rounds down, leaving us with
a random number between 1-6.

In the `Bins` class, I used an arrayList data structure to keep track of the rolls.
The constructor method `Bins(minBin, maxBin)` takes two parameters. These
are used by `createBins()` which takes `minBin` and `maxBin` and generates an arrayList
that has elements populated with 0s needed to keep track of all possible rolls, depending on number of dice.
For example, the output of two dice being rolled can be no lower than 2,
and no higher than 12, meaning createBins generates an arrayList with 11 elements.
`IncrementBin(int binNum)` then takes the value of roll, and adds one to the 
corresponding element in the arrayList. To get the index value of the bin I need to increment, 
I subtract 2 from the roll because the index corresponding to the roll will always be 2 lower than the roll itself.

`bins: {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}`
`index:{0, 1, 2, 3, 4, 5, 6, 7, 8,  9, 10}`

The `Simulation` class constructor method takes two parameters, `numberOfDies` and `numberOfTosses`.
These are used when calling the methods from my other classes. In `runSimulation()` I create a new
`Bins` object and call `createBins()` on it. Then I create a new `Dice` object and 
tell it to roll n amount of times, based on the `numberOfRolls`. The `stars()` method
generates a String containing the number of stars needed for the histogram based off percentage. 
Finally, `printResults()` calls `runSimulation()` based on `numberOfDies`, increments the corresponding bin with each roll, 
calculates the percentage of each bin, adds stars, formats, and prints the results.

The main method creates a new Simulation object, and calls `runSimulation()` and `printResults()`.