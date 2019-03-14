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

***************************************

### *Author*:

- **Sushant Kumar** *Initial Work* [sushant032](https://github.com/sushant032)

***************************************

### *References*:

- **Palo Alto Research Center Research Paper (Ropes Are Better Than Strings Hans-J. Boehm, Russ Atkinson and Michael Plass )** [pdf](http://bitsavers.trailing-edge.com/pdf/xerox/parc/techReports/CSL-94-10_Ropes_Are_Better_Than_Strings.pdf)
- **Wikipedia** [Rope_(data_structure](https://en.wikipedia.org/wiki/Rope_(data_structure))
- **Wikipedia** [Splay tree](https://en.wikipedia.org/wiki/Rope_(data_structure))

***************************************
