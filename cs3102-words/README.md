# CS3102 Information Systems Development II (2015-16)
## Assignment 1 - Word Dictionary

---

#### Due Date:   January 25, 2016 @23:59
#### Grading:    20% of final module grade
#### Submission: Individual

---

### Instructions

1. Unzip the package you downloaded from Blackboard. This contains the partially-complete
   source code and words list (in a text file called `shuffled.txt`)

2. You edit this code in an IDE, such as IntelliJ, or a text editor. You can compile and 
   execute the code in an IDE or on the command line (see below). Follow ths instructions
   for your particular IDE to import the source code

3. This code provided is partially complete and contains the logic to read the words into
   memory and the method signatures for the logic that you need to complete for this
   assignment

4. The tasks are relatively independent but incrase in difficulty. You can attempt them
   in any order you like. The marks for each task are shown in the comments

5. Please use the method signatures provided in the partially-complete code you have
   been given. There are 6 individual solutions to be provided in your submission

6. The marks for a given task include credit for tests that you provide showing how
   you have verified the functionality of your attempts. You should call your tests from
   within the `main()` and you are free to develop the tests themselves are methods in
   their own right. You will be given credit for any part or whole attempt made in
   your coded solutions

7. You must attempt this assignment individually. If you discuss the solutions with a
   class colleague, please ensure that your submission is yours and yours alone. You
   will be required to submit a plagiarism declaration separately, in conjuction with
   your code submission

8. Except on personal grounds, requiring your tutor's support, no extensions will be
   given to individuals or the class for this assignment. No exceptions.

9. You will be penalised by 10% per day for each day that you are late submitting


---

### Apendix 1 - Executing from the command line

If you prefer to complile and execute your program on the command line then follow the
following steps. Running it as shown here will ensure you are in the correct folder
relative to the `shuffled.txt` words file

* On Windows open a command prompt and navigate to the top-level folder containing the `src`
  folder

* On OSX (Mac) open a Terminal (from Hotspot) and navigate to the top-level folder containing the `src`
  folder

* On Linux/BSD, open a shell window and navigate to the top-level folder containing the `src`
  folder


To compile your program (assumes that `javac` and `java` executables are in your path):

* On *Windows*:

```
	javac src\ie\tcd\cs3102\words\Main.java
```

* On *OSX* or *Linux*:

```
	javac src/ie/tcd/cs3102/words/Main.java
```

To execute your program on *Windows*, *OSX* or *Linux*

```
	java -cp src ie.tcd.cs3102.words.Main
```

---

