#include "tnode.h"
#include <string.h>
#include <stdio.h>
#include <stdlib.h>

TNode* createTNode(const char *key){
    char buffer[256];
    
    if (key == NULL){
        printf("Input string: ");
        if (scanf("%255s", buffer)!=1) return NULL;
            key = buffer;
        }
    TNode* nTNode = (TNode*)malloc(sizeof(TNode));
    if (nTNode == NULL) return NULL;
    strncpy(nTNode->data, key, 19);
    nTNode->data[19] = '\0';
    nTNode ->left = NULL;
    nTNode ->right = NULL;
    return nTNode;
}

void printTNode(TNode* nodePtr){
    if (nodePtr !=NULL){
        printf("(%s)", nodePtr->data);
        return;
    }
    printf("The node is NULL.");
    return;
}

void inOrder(TNode* node, char startChar){
    if (node == NULL) return;
    inOrder(node->left);
    printTNode(node);
    inOrder(node->right);
}