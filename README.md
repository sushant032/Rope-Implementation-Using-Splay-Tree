# Rope-Implementation-Using-Splay-Tree
## Using Splay tree as Data Structure, and implement rope along with it.

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
## Rope Data Structure
A rope is a binary tree where each leaf (end node) holds a string and a length (also known as a "weight"), and each node further up the tree holds the sum of the lengths of all the leaves in its left subtree. A node with two children thus divides the whole string into two parts: the left subtree stores the first part of the string, the right subtree stores the second part of the string, and node's weight is the sum of the left child's weight along with all of the nodes contained in its subtree.

## Splay Tree
A splay tree is a self-adjusting binary search tree with the additional property that recently accessed elements are quick to access again. It performs basic operations such as insertion, look-up and removal in O(log n) amortized time. For many sequences of non-random operations, splay trees perform better than other search trees, even when the specific pattern of the sequence is unknown. The splay tree was invented by Daniel Sleator and Robert Tarjan in 1985.[1]
*************************************

*************************************

***************************************
### *Author*:

- **Sushant Kumar** *Initial Work* [sushant032](https://github.com/sushant032)

***************************************
