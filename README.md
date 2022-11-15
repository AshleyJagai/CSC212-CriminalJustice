# CSC212-CriminalJustice

# A2: Criminal Justice
The best way to see the applications of class design is to leave toy problems behind and work on something with real-world relevance.  This assignment will explore how to model data with more complexity than the examples seen so far in class.  While Java may not be the language of choice for data analysis, in adapting it for this purpose we'll learn a lot about how to represent objects using Java.

---
### 🚧 Heads up! 🚧
> **By design, this assignment is substantially more complex than [A1: Chatbot](https://replit.com/@csc212sp22/A1). This will be an opportunity to dig deeper into Java syntax and object-oriented programming, but you should give yourself ample time to work on it.**

> We strongly recommend **reading the instructions all the way through** before beginning the assignment, and executing the phases in the order specified:

> - _Phase 0_: Get familiar with the data stored in `compas-scores.csv` and where it came from.
> - _Phase 1_: Build a class (`Defendent.java`) that we could use to store the information from a single row of the CSV.
> - _Phase 2_: Read in the data from `compas-scores.csv` to create an instance of the `Defendant` class for each row.
> - _Phase 3_: Create a new class (`DefendantGroup.java`) that we can use to store the `Defendant` instances you created.
> - _Phase 4 - Kudos:_ Time permitting, conduct your own analysis of this data!

To help you keep track of what you need to do in each section, we've used the ✋ emoji to highlight specific subtasks.

---

This assignment is based on the [Criminal Justice](https://responsibleproblemsolving.github.io/#crimjustice) assignment from [Responsible Problem Solving](https://responsibleproblemsolving.github.io/). Original version written for CS 106 - Introduction to Data Structures at Haverford College.

Phase 0:  Understanding the Data
----------------------

When designing any data structure, we first need to understand the details of the data that we will store and what types of queries we may want to make about that data. For this assignment, the data we’ll be working with comes from a ProPublica story about a tool called COMPAS which is used in the U.S. judicial system to assess the likelihood that a person who has been convicted of a crime will reoffend.

---
✋ To understand the data and the larger context, look at these sources in
order:

1.  ProPublica’s [introductory video](https://youtu.be/17eDz5HA_qI).

2.  Article: [Machine Bias](https://www.propublica.org/article/machine-bias-risk-assessments-in-criminal-sentencing) by ProPublica.

3.  Handout: [Understanding Propublica.pdf](https://responsibleproblemsolving.github.io/propublica/understanding_Propublica.pdf).

4.  Examine the (cleaned) data in `compas-scores.csv`.  What kind of information does it store?  What are the range of values that you see?  Are there any irregularities to the data that may cause issues down the line, or need special handling?

Feel free to discuss the content with peers and/or instructors.

---

Phase 1:  Creating a Class Representing a Single Row
------------------------------------------

### Create a class

A single row in the CSV represents one `Defendant`. You will create a corresponding class inside `Defendant.java` that can hold the information about a defendant, including all the data from a single row in the CSV. 

---
✋ Using javadoc style, write a comment at the top of `Defendant.java` to describe the class - what it represents, what contents it holds, etc.

---

### Fields and methods
---

✋ Next, add fields to represent each piece of information about about a `Defendant` based on the CSV - think about its columns! 

---

Think carefully about what the most appropriate data type for each field: some will be Strings, others mught be numeric or boolean.

You do not immediately have to store all the information from a row -- you can begin with a subset of all the available features.  At a minimum, you should include the information necessary to recompute the statistics used by ProPublica.  You can add the others later, for full credit.  Each field should have its own individual javadoc comment. Most ordinary fields should be `private` with `public` getters and setters.  

---

✋ After you have decided on your fields, add any necessary getter and setter methods to the class. Be sure to include appropriate Javadoc comments for each one!

---

### Constructor

We now need a way to initialize the fields you created in the previous section, using specified data values. 

---

✋ Make a constructor that takes in multiple parameter variables (e.g. `String sex`, `String race`, `...`) and initializes the fields of your class.

---

### A `toString` method

Although not required, it is often useful to create a `toString()` method inside your classes that returns a text description of your object.  This method is called implicitly if you use `System.out.println` on your object, so it would be nice if it returns a string showing the values of all the important fields.

---

✋ Create a method called `toString()` inside your `Defendant` class that returns a `String` representation of the object.

---

### Testing your class

Testing is an important part of developing data structures. In the `Main` class, you will write two methods: `testConstructor()` that makes one or more instances of the class out of a line string and tests that all the values are set correctly, and `testSetters()` that methodically tries all the setter methods and ensures that they make the appropriate changes.  You will have to use the getters in each of these to check that the values were all set correctly, so there is no need for a separate `testGetters()` method.

We'll be using some simple test protocols for this assignment, found in the file `TestCode.java`.  You're welcome to look at the contents of this file, but it's also fine to treat it as a black box -- you will not be editing this file.  These instructions will explain everything you need to know about using it.  

The basic idea is that you define a number of **tests**, which are simply assertions of statements that should be `true`.  Each test will have a name (for identification) and a boolean statement to be tested.  

---
> ### An Example of Testing
>_Note: this is an **example only**. You do not need to include the following code in your submission._

>Imagine you want to check that integer addition (`+`) works as expected. You could include a test like this one:

    TestCode.runTest("Addition",1+1==2);

>This tells the program to check whether in fact 1+1 is equal to 2.  If it is, the program will print a message indicating success:

    Passed: Addition

>If the boolean statement works out as false, then we will get a different message.  (_Hint: try changing the code to `1+1==3` to see what happens._)

>Sometimes we may want to run a whole series of related tests that make more sense as a single group.  In this case we can define a test with subtests:

    TestCode.beginTest("Arithmetic");
    TestCode.subTest("Addition",1+1==2);
    TestCode.subTest("Subtraction",3-1==2);
    TestCode.subTest("Multiplication",2*2==4);
    TestCode.subTest("Division",6/3==2);
    TestCode.concludeTest();

> Assuming all the subtests pass, we only get a single message for the entire test.  If any of the subtests fail, then we get information about those parts.  You may want to play around with passing and failing arithmetic tests in `Main.java` until you feel that you understand how they work. 

---

Now you can apply that knowledge to testing the  `Defendant` class. 


---

✋ Write the `testConstructor()` and `testSetters()` methods, which will use the helper methods provided in `TestCode.java` to confirm that your `Defendant` class is working as expected.

---

Call your testing methods from the `main` method of your `Main` class. 
You can also use `System.out.println` to print
variables for debugging purposes, but if you do so please declutter the console output by
commenting out these calls once you’re sure that everything works.


Phase 2:  Working with the data file
---------------------------------------

So far we've designed the `Defendant` class with our data file in mind, but our program hasn't actually touched the file yet.  We can do so in several steps. 

### New constructor

Since we intend to read our data from a file where each line represents an object, it would be nice to add a constructor that builds a `Defendant` based on a single line (represented as a `String`) for its argument.  This constructor will have to parse the string into the different pieces of information required, and then fill in the individual fields -- perhaps by calling the constructor we wrote originally!

---

✋ Write a second constructor `Defendant(String row)` that builds a `Defendant` from a single string containing the data from one row of the dataset. 

_Hint: Check out the first row of `compas-scores.csv` to see what order the fields appear to ensure that you are parsing the string correctly._

---

Do not get rid of the original constructor. In Java, we can *overload* methods - meaning the methods can have the same name as long as their parameters are different. Java compiler will **automatically** look for the method that fits the one you’re calling.

There are several strategies that you can use to parse the input string.  You might use the `split` method to break it into individual fields.  You might go one character at a time, using `charAt` to decide where one field ends and the next begins.  If you look online you may also see discussion of techniques involving _regular expressions_, which are powerful parsing tools but beyond the scope of this course.

---

✋ To test your work, please write and call a method called `testStringConstructor()` in `Main.java`.  The behavior of this new method should be clear based on the previous examples.

---

### Reading the whole file

You just wrote a `Defendant` constructor that can take a `String` and convert it to a `Defendant` object... now you just need a way to extract the data from the `compas-scores.csv` file.  Since the point of this assignment is class design rather than file processing (we'll get to that in more detail later in the course), below is a piece of code that reads in the `compas-scores.csv` file and prints out its contents line by line: 

      Scanner file = null;
      try {
        file = new Scanner(new File("compas-scores.csv"));
      } catch (FileNotFoundException e) {
        System.err.println("Cannot locate file.");
        System.exit(-1);
      }
      while (file.hasNextLine()) {
        String line = file.nextLine();
        System.out.println(line);
      }
      file.close();


---

✋ Write a method called   `testFileReader()` in `Main.java` that adapts the code above to make it construct a new `Defendant` object out of each line of the CSV file.  For now, you don't need to store these objects -- each one can overwrite the previous one.  This is a good place to put your `toString` method to use!

---

As you run through the file, you may find that your code doesn't work on some lines, for one reason or another.  If this seems to be the case, examine the line(s) in question and try to figure out why they are causing trouble.  

The are several valid ways to handle failed lines:
* Skip them -- as long as there aren't too many, it won't change the answers much!
* Edit the CSV file so that it no longer causes the problem
* Modify your code so that it can handle the problematic lines

### Extracting relevant details

In order to replicate the ProPublica analysis, we need to determine if the person represented by the row fits the definition for certain predefined categories.  In order to do this, we'll first `implement` the methods promised in the `ProPublica` interface found in `ProPublica.java`.

---

✋ Modify your `Defendant` class to `implement` the `ProPublica` interface by writing the required set of utility functions that return `boolean` values for the following situations:  
* `isWhite()`:  race listed as Caucasian
* `isBlack()`:  race listed as African-American
* `hasReoffended()`: was labeled as being rearrested within 2 years
* `isLowRisk()`: risk assessment was classified as Low

Next, write a function called `testBooleans()` in `Main.java` to verify that these methods are working as expected.

---

Phase 3:  Representing the dataset as a whole
---------------------------------------

The goal of this assignment is to build the necessary data structures that will enable you to replicate ProPublica’s analysis.  To do this it will be convenient to store the entire dataset in memory.  Since the point of this assignment is to develop object-oriented programming techniques, we should represent the dataset itself as an object.  This will be a new class separate from `Defendant`.  It represents a more abstract concept:  not a single defendant, but a collection of them.  We'll call the new class `DefendantGroup`.

---

✋ Create a new file called `DefendantGroup.java` and start to set up the `DefendantGroup` class.

---

### Fields

The new class needs a way to hold a collection of `Defendant` objects.  You could do this with a simple array, but since we don't know in advance how large an array to allocate, it is better to use a structure called an `ArrayList` that allows for resizing as necessary.  You can view the [javadoc for the class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html).  We will need just one field of this type, specifically an `ArrayList<Defendant>`.

---

✋ Add a field to your `DefendantGroup` class of type `ArrayList<Defendant>`. We'll use this to store the `Defendant` objects we created when we read in the `compas-scores.csv` file.

---

### Constructor

The constructor for this class will take a file name (stored as a `String`) as its only argument.  It should create an empty `ArrayList<Defendant>` and then read in the file one line at a time, adding a new `Defendant` for each line.

---

✋ Write a constructor called `DefendantGroup(String filename)` by adapting the code from `testFileReader()` to again construct a new `Defendant` object out of each line of the CSV file, and then add each `Defendant` to the  `ArrayList<Defendant>` you defined as a class attribute.

---

### Accessors and manipulators

What accessors an manipulators do we need for a class like this?  It's probably not the best idea to have getters and setters for the whole list of defendants at once.  Rather, we can create methods that work with just one defendant at a time.

---

✋ Write the following accessors/maniuplators in your `DefendantGroup` class:

- `addDefendant(d)` should add one `Defendant` object to the collection.
- `getDefendant(i)` should return the i_th `Defendant` stored in the collection.
- `removeDefendant(i)` should delete the i_th `Defendant` stored.
- `size()` should return the total number of defendants stored in the collection.

_Hint: Each of these can be implemented with a one-line call to the appropriate corresponding method of the `ArrayList<Defendant>` field._

---


### Checking the results

If the above steps are completed properly, it should be possible to reproduce the ProPublica results using the code below.  

---

✋ Put the following code into a method called `proPublica()`:

    // variables to count particular categories
    // note that medium and high risk are counted here as high
    int wly = 0; // White, low risk, has reoffended
    int wln = 0; // White, low risk, has not reoffended
    int bly = 0; // Black, low risk, has reoffended
    int bln = 0; // Black, low risk, has not reoffended
    int why = 0; // White, high risk, has reoffended
    int whn = 0; // White, high risk, has not reoffended
    int bhy = 0; // Black, high risk, has reoffended
    int bhn = 0; // Black, high risk, has not reoffended

    // loop to count sums
    for (int i = 0; i < getNumberInGroup(); i++) {
      Defendant d = getDefendant(i);
      if (d.isWhite()&&d.isLowRisk()&&d.hasReoffended()) {
        wly++;
      } else if (d.isWhite()&&d.isLowRisk()&&!d.hasReoffended()) {
        wln++;
      } else if (d.isBlack()&&d.isLowRisk()&&d.hasReoffended()) {
        bly++;
      } else if (d.isBlack()&&d.isLowRisk()&&!d.hasReoffended()) {
        bln++;
      } else if (d.isWhite()&&!d.isLowRisk()&&d.hasReoffended()) {
        why++;
      } else if (d.isWhite()&&!d.isLowRisk()&&!d.hasReoffended()) {
        whn++;
      } else if (d.isBlack()&&!d.isLowRisk()&&d.hasReoffended()) {
        bhy++;
      } else if (d.isBlack()&&!d.isLowRisk()&&!d.hasReoffended()) {
        bhn++;
      }
    }

    // print the results
    System.out.println("White, high risk, didn't reoffend: "+whn*100.0/(whn+wln)+" %");
    System.out.println("Black, high risk, didn't reoffend: "+bhn*100.0/(bhn+bln)+" %");
    System.out.println("White, low risk, did reoffend: "+wly*100.0/(wly+why)+" %");
    System.out.println("Black, low risk, did reoffend: "+bly*100.0/(bly+bhy)+" %");

Next, call this method and verify that the results are (approximately) the same as ProPublica’s analysis shown in the table *Prediction Fails Differently for Black Defendants* (replicated below):


|                                           | WHITE | AFRICAN AMERICAN |
|-------------------------------------------|------:|-----------------:|
| Labeled Higher Risk, But Didn’t Re-Offend | 23.5% |            44.9% |
| Labeled Lower Risk, Yet Did Re-Offend     | 47.7% |            28.0% |
---

_Kudos_:  Further Exploration
---------------------------------------

_NOTE: The work you have already done should not be altered by your modifications in this
section. This means you should write **additional** methods instead of
changing the methods you wrote so that your original methods stay the
same._

Now that we have set up our dataset and have seen an example of how to conduct analysis on it, it seems a waste to stop now... if time permits, try conducting your own supplemental analysis. You might want to consider the questions below, or pose your own!

### What counts as recidivism?
Find charges that, based on the `r_charge_desc`, you think should not count as recidivism. Write a new method called to re-run the analysis using these decisions to override the `two_year_recid` field for any `Defendant` with one of those charges. Describe the choices you made and what the resulting analysis
shows in your `README.md`.

### Comparisons between other groups
The original ProPublica analysis focused on highlighting the discrepancy in how COMPAS scores Black defendants vs. white defendants. What other biases are built into this algorithm? Write a new method to make comparisons between additional subgroups and report on what you find in your `README.md`.
