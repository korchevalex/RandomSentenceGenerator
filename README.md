# RandomSentenceGenerator
This is a sentence generator that uses a fixed sentence structure and picks random words for every part of the sentance.
## Solution
For every part of the sentence there is an array which holds all possible words. When generating the sentance the random class is used to generate a random index in the array. After that random booleans are generated in order to exclude or include optional parts of the setence. Finally we go through the parts of the sentance and print all the mandatory ones and, if we have them, the optional ones. The code that picks the random words and prints them is inside a while loop so as to generate more sentances after if the [Enter] key is pressed.
### [Source code](RandomSentenceGenerator.java)
## Screenshots
![image](https://user-images.githubusercontent.com/122821827/218301902-6683d054-b0fb-475d-9be4-9cde1dabf292.png)
![image](https://user-images.githubusercontent.com/122821827/218301913-944e8326-b19f-42cb-b0d9-23213ecf3975.png)
![image](https://user-images.githubusercontent.com/122821827/218301920-c4db3052-f935-4b19-85ba-a1b647fa3bbd.png)
![image](https://user-images.githubusercontent.com/122821827/218301936-3ada8398-c3ec-4056-9f9e-4167aed6581e.png)
