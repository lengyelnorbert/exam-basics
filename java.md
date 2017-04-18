# EXAM: Programming Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Create a `.gitignore` file so generated files won't be committed
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead.
- **Don't push your work** to GitHub until your mentor announces that the time is up


# Tasks
## 1-3. Complete the following tasks: (~90 mins)
- [Odd Average](oddavg/OddAvg.java)
- [Copy](copy/Copy.java)
- [BlackJack](blackjack/BlackJack.java)

### Acceptance criteria
The application is accepted if:
- The solution works according to specification [1p each]
- The solution follows [styleguide](https://github.com/greenfox-academy/teaching-materials/blob/master/styleguide/java.md) [1p]
- Has proper error handling where the specification says it [1p each]
- Has the correct loops, methods, filters [1p each]
- The code is clean, without unnecessary repetition, and with descriptive names [1p each]
- You commit frequently with descriptive commit messages [1p]

## 4. Question time! (~10 mins) [4p]

### Name each building block of a method! [2p]

![anatomy](anatomy/AnatomyJava.png)

#### Your answer:

1: shows the access level to the method. Might be private / public / protected or none (in this case it means package private)
2: shows what type of data (at #8) the method will return (String, int, boolean, etc.)   
3: the name of the method, that is what you will use when you call this method   
4: the type of the argument what you will call the method with  
5: the name of the argument what you will use within this method when you wish to refer to the argument the method was called with. The type of this argument is specified at #4.  
6: body of the method - initializing the return value of the method,  
7: body of the method - calculating the return value (sum) of the method, depending on the value the method had been called with (n, at #4 and #5)
8: the returning value of the method. It has to be the same type what had been setup at #2   

### What is the constructor? When it is used? [2p]
#### Your answer:
You use the constructor to create new object within a class. There might be different "type" of constructors, like for example a "default constructor", where the object can be constructed without any arguments, or a lot of other different constructors, where the object "comes to alive" with different type of argumets. These arguments might be given during the construcion (= we call the constructor method with arguments), or they might be setup in the constructor itself (= automaticly added to the object during construcion), or it can be a mixture of these two... Subclass constructor uses it's parent-class constructor as well in certain cases.
