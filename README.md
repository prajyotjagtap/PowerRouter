# PowerRouter

1- Anagram Program-

This program, named "Anagram," checks if two given strings are anagrams. Anagrams are words or phrases formed by rearranging the letters of another. Here's how it works:

1. Input:
   - String 1: "Welcome"
   - String 2: "ceelmow"

2. Process:
   - The program utilizes a function called `areAnagrams` to determine if the strings are anagrams.
   - It first compares the lengths of the two strings; if they are not equal, the strings cannot be anagrams.
   - Then, it uses two arrays, `count1` and `count2`, to keep track of the frequency of each character in both strings.
   - By iterating through the characters of both strings, it increments the respective counters in the arrays.
   - After counting, it compares the frequency of each character. If they match for every character, the strings are considered anagrams.

3. Output:
   - In the provided example, since the given strings "Welcome" and "ceelmow" pass the anagram check, the program outputs: "The strings are anagrams."
   - If the strings didn't meet the anagram criteria, it would output: "The strings are not anagrams."

This program is useful for quickly determining if two words can be formed using the same set of letters, making it handy for word games or linguistic analysis.

2- Fibonnaci Program

This program, named "Fibonacci," generates the first 10 numbers of the Fibonacci series. The Fibonacci series is a sequence where each number is the sum of the two preceding ones. Here's a breakdown of the program:

1. Input:
   - The program is designed to generate the first 10 numbers of the Fibonacci series.

2. Process:
   - It initializes two variables, `firstTerm` and `secondTerm`, to 0 and 1, respectively, which are the first two numbers in the Fibonacci series.
   - Using a `for` loop that iterates 10 times (`num=10`), it calculates the next term (`thirdTerm`) by adding the current `firstTerm` and `secondTerm`.
   - It then updates the values of `firstTerm` and `secondTerm` to continue the Fibonacci sequence.
   - During each iteration, it prints the value of the current `firstTerm` followed by a comma and space.

3. Output:
   - The output of the program, based on the provided example, is the first 10 numbers of the Fibonacci series: "0, 1, 1, 2, 3, 5, 8, 13, 21, 34."

This program is useful for generating Fibonacci sequences, which have applications in various mathematical and computational contexts, such as number theory, algorithms, and dynamic programming.

3- Permutations Program

This program, named "Permutation," generates all permutations of a given string. Permutations are all possible arrangements of characters in a string. Here's an overview of how the program works:

1. Input:
   - The program is designed to generate all permutations of the input string "CAT."

2. Process:
   - The main method initializes the input string `str` to "CAT" and calls the `generatePermutations` method with an empty prefix and the input string.
   - The `generatePermutations` method takes two parameters: `prefix` (the current permutation being built) and `remaining` (the remaining characters to be permuted).
   - If there are no remaining characters (`n == 0`), it prints the current permutation.
   - Otherwise, it iterates through each character in the remaining string, appending it to the prefix, and recursively calls itself with the updated prefix and remaining characters.

3. Output:
   - The output of the program, based on the provided example, is all permutations of the string "CAT": "CAT, CTA, ACT, ATC, TAC, TCA."

This program is useful for scenarios where you need to explore all possible arrangements of characters in a given string, such as in combinatorial problems and algorithmic challenges.

4- Reverse String

This program, named "ReverseString," reverses a given string. It takes an input string, in this case, "Welcome," and produces the reversed version. Here's a brief explanation of the program:

1. Input:
   - The program is designed to reverse the input string "Welcome."

2. Process:
   - It uses a `for` loop to iterate through the characters of the input string in reverse order.
   - Starting from the last character (`in.length()-1`), it prints each character one by one until the first character is reached (`i>=0`).

3. Output:
   - The output of the program, based on the provided example, is the reversed string: "emocleW."

This program is a straightforward solution for reversing a string, which can be useful in various applications such as text manipulation and data processing.

5- Stack

This program implements a stack data structure using two queues without utilizing arrays or linked lists. It provides the following functionalities:

- Push: Adds an element to the stack.
- Pop: Removes and returns the top element from the stack.
- Top: Returns the top element of the stack without removing it.

The implementation uses two queues, `primaryQueue` and `auxiliaryQueue`, to simulate the stack behavior. The `push` operation involves transferring elements between the two queues to maintain the order.

In the provided example:

1. The stack is initialized.
2. Elements 1, 2, and 3 are pushed onto the stack.
3. The program prints the top element.
4. It pops an element and prints the popped element and the new top element.

This stack implementation is useful in scenarios where a stack is required, and the goal is to achieve it using queues efficiently.

6- Substring

This Java program, named "SubString," finds the longest substring without any duplicate characters in a given input string. Here's a brief overview of how the program works:

1. Input:
   - The input string is "Welcome to PowerRouter."

2. Process:
   - The program splits the input string into an array of words using space as the delimiter.
   - It initializes a variable `longestSubstring` to an empty string to keep track of the longest substring found.
   - For each word in the array, it calls the `findLongestSubstring` method to find the longest substring without duplicate characters within that word.
   - The method `findLongestSubstring` uses two pointers (`start` and `end`) to track the current substring and iterates through the characters of the word.
   - If a duplicate character is found, the `start` pointer is moved to the next character.
   - The length of the current substring (`end - start`) is compared with the maximum length (`maxLength`), and if it is greater, it updates the `maxLength` and the `longestSubstring` accordingly.

3. Output:
   - The program prints the longest substring without duplicate characters found in the entire input string: "Welcome."

This program is useful for scenarios where you need to identify and extract substrings without any repeated characters, which can be relevant in tasks such as text processing and pattern recognition.
