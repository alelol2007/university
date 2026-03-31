#include "tnode.h"
#include <string.h>
#include <stdio.h>
#include <stdlib.h>
#include "bst.h"

BST * createTree(){
    BST* nBST = (BST*)malloc(sizeof(BST));
    nBST->root = NULL;
    return nBST;

}
int treeEmpty(BST*tree){
    if (tree == NULL || tree->root == NULL){return 1;}
    return 0;
}
void bstInsert(BST *tree, TNode *newNode) {
    if (treeEmpty(tree) == 1) {tree-> root = newNode; return;} 
    TNode* current = tree -> root ;
    TNode* parent = NULL;
     int first = 0; 
    while (current != NULL){
        parent=current;
        
        int compare = strcmp(newNode->data,current->data );
        if (compare<0){
            current = current->left;
        }
        else if (compare>0)
        {
           current = current->right;
        } 
        else if (compare == 0){
            free(newNode);
            return;
        }
        
    }
    if (strcmp(newNode->data, parent->data)<0){
        parent->left = newNode;
    }
    else{
        parent->right = newNode;
    }
}

void printAlphabetical(BST *tree){
    if (treeEmpty(tree)==1){
        printf("Tree is empty.\n");
        return;
    } else {
        printf("Tree: ");
        inOrder(tree->root);
        printf("\n");
        return;
    }
}