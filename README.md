📌 Project Name
StringMethodPra

📌 Description

This project demonstrates the most commonly used methods of the Java String class.

The program explains how different String methods work with practical examples and output, making it very useful for Java beginners and students.

Java String is an immutable class, meaning once a String object is created, it cannot be changed. Any modification returns a new String object.


📌 Objectives

  To understand Java String class methods
  
  To learn how String manipulation works
  
  To practice searching, comparison, and modification methods
  
  To observe case-sensitive and case-insensitive behavior
  

📌 Topics Covered

1. Length & Character Methods
   
    length() – Returns the total number of characters in the string
   
    charAt(int index) – Returns the character at a specific index

3. Substring Methods
   
    substring(int beginIndex) – Returns substring from given index to end
   
    substring(int beginIndex, int endIndex) – Returns substring between indexes (endIndex - 1)

5. Modification Methods (Return New String)
   
    toUpperCase() – Converts string to uppercase
   
    toLowerCase() – Converts string to lowercase
   
    trim() – Removes leading and trailing spaces
   
    replace(char old, char new) – Replaces characters in string
   

Note: These methods do not modify the original string.

4. Checking Methods
   
    startsWith(String prefix) – Checks if string starts with given value
   
    endsWith(String suffix) – Checks if string ends with given value

✔ These methods are case-sensitive

5. Searching Methods
   
    indexOf(String) – Finds first occurrence (Left to Right)
   
    indexOf(String, fromIndex) – Starts search from specific index
   
    lastIndexOf(String, fromIndex) – Searches from Right to Left

7. Comparison Methods
   
    equals() – Compares content (case-sensitive)
   
    equalsIgnoreCase() – Compares content ignoring case
   
    == – Compares memory reference, not content
   
    compareTo() – Lexicographical comparison (Dictionary order)
   
    compareToIgnoreCase() – Comparison ignoring case

📌 compareTo() returns:

    0 → Strings are equal
    
    Positive value → First string is greater
    
    Negative value → First string is smaller
    

📌 Key Learning Points

  Java Strings are immutable
  
  == should not be used for content comparison
  
  equals() is preferred for value comparison
  
  Case sensitivity affects many String methods
  
  Every modification creates a new String object
  

📌 Technologies Used

  Language: Java
  
  IDE: NetBeans / Eclipse / IntelliJ
  
  Package: stringmethodpra
  

📌 Suitable For

  Java Beginners
  
  BCA / MCA / B.Tech Students
  
  College Assignments
  
  Interview Preparation
  
  GitHub Practice Projects
  

📌 Author

Ankit Sahu

Java Learner & Student
