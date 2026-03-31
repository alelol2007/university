#ifndef TNODE_H
#define TNODE_H

typedef struct TNode
{
    char data[20];
    struct TNode* left;
    struct TNode* right;
} TNode;

TNode* createTNode(const char *key);   
void printTNode(TNode *nodePtr);       
void inOrder(TNode *node);             

#endif