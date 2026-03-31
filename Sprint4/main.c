#include "tnode.h"
#include "bst.h"
#include <stdio.h>
#include <string.h>
#include <stdlib.h>


int main(){
    BST* myTree = createTree();
    int choice;
    char input[256];
    while (1)
    {
        printf("\n1. Insert a node\n2. Test if tree is empty\n3. Print tree\n4. Exit\n"); 
        printf("Enter your choice: ");
        scanf("%s", input);
        choice = atoi(input);
        if (choice ==4) break;
        switch (choice)
        {
        case 1:
        {
            TNode* nTNODE = createTNode(NULL);
            bstInsert(myTree, nTNODE);
            break;
        }
        case 2:
        {   
            if(treeEmpty(myTree))printf("Tree is empty.\n");
            else{
                printf("Has Something.\n");
            } 
            break;
        }
        case 3:
        {
            printAlphabetical(myTree);
            break;}
        default:
            break;
        }
    }
    free(myTree);
    return 0;

    
}