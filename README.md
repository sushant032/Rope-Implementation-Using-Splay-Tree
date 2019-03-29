# Rope-Implementation-Using-Splay-Tree
## Combining the Goodness of Splay Tree and Rope Data Structure.

## Motivation
```
  * Implementing Rope Data Structure using Splay tree helps reducing the search
    time for frequently searched indexes.
  * Time complexity to find the character at given index in Rope is O(log n).
  * Rope Data Structure is beneficial in operations such as Concatenation O(1)
  * Ropes enable much faster insertion and deletion of text than monolithic
    string arrays, on which operations have time complexity O(n).
  * Ropes don't require O(n) extra memory when operated upon (arrays need
    that for copying operations).
  * Ropes don't require large contiguous memory spaces.
```

*************************************

## Rope Data Structure
A rope is a binary tree where each leaf (end node) holds a string and a length (also known as a "weight"), and each node further up the tree holds the sum of the lengths of all the leaves in its left subtree. A node with two children thus divides the whole string into two parts: the left subtree stores the first part of the string, the right subtree stores the second part of the string, and node's weight is the sum of the left child's weight along with all of the nodes contained in its subtree.

## Splay Tree
A splay tree is a self-adjusting binary search tree with the additional property that recently accessed elements are quick to access again. It performs basic operations such as insertion, look-up and removal in O(log n) amortized time. For many sequences of non-random operations, splay trees perform better than other search trees, even when the specific pattern of the sequence is unknown. The splay tree was invented by Daniel Sleator and Robert Tarjan in 1985.[1]

*************************************

### *Technology stack*:

Java, Netbeans

*****************************************

### *Functions*:

#### Function: *createRope*
```
  Role: Creates the rope using the given string recursively
  Arguments: initial node, string, parent node, start index, end index
  Returns: node

```

#### Function: *splay*
```
  Role: Splays the given node at the root
  Arguments: root node, node to splay
  Returns: node

```

#### Function: *balanceWeights*
```
  Role: Balances the weights of the nodes after splaying
  Arguments: root node
  Returns: sum of weights of left and right child

```

#### Function: *contact*
```
  Role: Concatenate given two Ropes
  Arguments: Rope 1, Rope 2
  Returns: New rope created by concatenation

```

#### Function: *index*
```
  Role: Prints the character at given index and calls the splay function (Most frequently searched indexes)
  Arguments: Root node, node to search, index
  Returns: New root node

```

#### Function: *printLeafs*
```
Role: Prints the leaf nodes i.e the string in rope
Arguments: node
Returns: void

```

#### Function: *printLevelOrder*
```
  Role: Prints the Level Order Traversal of the splay tree to visualize the tree
  Arguments: root
  Returns: void

```

#### Utility Functions:
```
  * leftRotate : Used by splay for left rotating a node
  * rightRotate : Used by splay for right rotating a node
  * displayMenu : Used to display the menu of the program
  * create_rope : Used to  create multiple ropes stored in an array list
  * concat : Used to concatenate given two ropes
  * selectRope : Used to select any two ropes for the operations
```

**************************************

### *Running the code*:
```
1. Download the repository.
2. Open Netbeans IDE and go to Files menu and Select Import Project.
3. Choose "Import from ZIP", and search for the location where you saved the downloaded ZIP folder.
4. Select the folder and let it load.
5. Open the main.java file and run the file using "Shift+F6".
```

**************************************

### *Output*:
```
Create string
my name is sushant kumar sinha
2 2 2 2 2 2 3 2 2 2 2 2 2 3 
Level Order: 
30 (null )null 
15 (null )rope.Node@55f96302 15 (null )rope.Node@55f96302 
8 (null )rope.Node@3d4eac69 7 (null )rope.Node@3d4eac69 8 (null )rope.Node@42a57993 7 (null )rope.Node@42a57993 
4 (null )rope.Node@75b84c92 4 (null )rope.Node@75b84c92 4 (null )rope.Node@6bc7c054 3 (ush )rope.Node@6bc7c054 4 (null )rope.Node@232204a1 4 (null )rope.Node@232204a1 4 (null )rope.Node@4aa298b7 3 (nha )rope.Node@4aa298b7 
2 (my )rope.Node@7d4991ad 2 ( n )rope.Node@7d4991ad 2 (am )rope.Node@28d93b30 2 (e  )rope.Node@28d93b30 2 (is )rope.Node@1b6d3586 2 ( s )rope.Node@1b6d3586 2 (an )rope.Node@4554617c 2 (t  )rope.Node@4554617c 2 (ku )rope.Node@74a14482 2 (ma )rope.Node@74a14482 2 (r  )rope.Node@1540e19d 2 (si )rope.Node@1540e19d 
Indexing Starts:
rope.Node@7d4991ad
rope.Node@7d4991ad
m
30 (null )null 
2 (my )rope.Node@7d4991ad 28 (null )rope.Node@7d4991ad 
13 (null )rope.Node@55f96302 15 (null )rope.Node@55f96302 
6 (null )rope.Node@3d4eac69 7 (null )rope.Node@3d4eac69 8 (null )rope.Node@42a57993 7 (null )rope.Node@42a57993 
2 ( n )rope.Node@75b84c92 4 (null )rope.Node@75b84c92 4 (null )rope.Node@6bc7c054 3 (ush )rope.Node@6bc7c054 4 (null )rope.Node@232204a1 4 (null )rope.Node@232204a1 4 (null )rope.Node@4aa298b7 3 (nha )rope.Node@4aa298b7 
2 (am )rope.Node@28d93b30 2 (e  )rope.Node@28d93b30 2 (is )rope.Node@1b6d3586 2 ( s )rope.Node@1b6d3586 2 (an )rope.Node@4554617c 2 (t  )rope.Node@4554617c 2 (ku )rope.Node@74a14482 2 (ma )rope.Node@74a14482 2 (r  )rope.Node@1540e19d 2 (si )rope.Node@1540e19d 
------------------Rope Data Structure Menu------------------
1. Create new rope 	2. Char at Index	3. Select Ropes
4. Concat Rope 
0. Exit
------------------------------------------------------------
1
Enter the string: 
My name is
------------------Rope Data Structure Menu------------------
1. Create new rope 	2. Char at Index	3. Select Ropes
4. Concat Rope 
0. Exit
------------------------------------------------------------
1
Enter the string: 
Sushant Kumar
------------------Rope Data Structure Menu------------------
1. Create new rope 	2. Char at Index	3. Select Ropes
4. Concat Rope 
0. Exit
------------------------------------------------------------
3
Select rope 1: 
Displaying all ropes: 
1. My name is
2. Sushant Kumar
1
Select rope 2: 
Displaying all ropes: 
1. My name is
2. Sushant Kumar
2
Ropes set for operations!
------------------Rope Data Structure Menu------------------
1. Create new rope 	2. Char at Index	3. Select Ropes
4. Concat Rope 
0. Exit
------------------------------------------------------------
4
Concatenating Rope 1 and Rope 2
My name isSushant Kumar
------------------Rope Data Structure Menu------------------
1. Create new rope 	2. Char at Index	3. Select Ropes
4. Concat Rope 
0. Exit
------------------------------------------------------------
2
Enter the index to search in rope 1: 
10
Index out of range!
------------------Rope Data Structure Menu------------------
1. Create new rope 	2. Char at Index	3. Select Ropes
4. Concat Rope 
0. Exit
------------------------------------------------------------
2
Enter the index to search in rope 1: 
5
The character at index( 5) is 
rope.Node@677327b6
m

------------------Rope Data Structure Menu------------------
1. Create new rope 	2. Char at Index	3. Select Ropes
4. Concat Rope 
0. Exit
------------------------------------------------------------
0
Thank you for using the program.
```

***************************************

### *Author*:

- **Sushant Kumar** *Initial Work* [sushant032](https://github.com/sushant032)

***************************************

### *References*:

- **Palo Alto Research Center Research Paper (Ropes Are Better Than Strings Hans-J. Boehm, Russ Atkinson and Michael Plass )** [pdf](http://bitsavers.trailing-edge.com/pdf/xerox/parc/techReports/CSL-94-10_Ropes_Are_Better_Than_Strings.pdf)
- **Wikipedia** [Rope_(data_structure)](https://en.wikipedia.org/wiki/Rope_(data_structure))
- **Wikipedia** [Splay tree](https://en.wikipedia.org/wiki/Rope_(data_structure))

***************************************
