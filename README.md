# RandomSentenceGenerator
This is a sentence generator that uses a fixed sentence structure and picks random words for every part of the sentance.
## Solution
For every part of the sentence there is an array which holds all possible words. When generating the sentance the random class is used to generate a random index in the array. After that random booleans are generated in order to exclude or include optional parts of the setence. Finally we go through the parts of the sentance and print all the mandatory ones and, if we have them, the optional ones. The code that picks the random words and prints them is inside a while loop so as to generate more sentances after if the [Enter] key is pressed.
