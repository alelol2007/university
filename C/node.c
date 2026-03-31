#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "node.h"


Node* createNode(const char* key){
    char tempKey[20];

    if (key == NULL){
        printf("Enter the string: ");
        scanf("%s", tempKey);

        
    }
    else{
        strncpy(tempKey,key,19);
        tempKey[19] = '\0';
        

    }
        Node* pNew;
        pNew = (Node*)malloc(sizeof(Node));
        strcpy(pNew -> data, tempKey);
        pNew -> prev = NULL;
        pNew -> next = NULL;
        return pNew;
}

void printNode(Node* nodePtr){

    if (nodePtr != NULL){
        printf("[%s]", nodePtr->data);
    }
    else{
        printf("The node is NULL.");
    }

}