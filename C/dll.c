#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "dll.h"


DLL* createList(){
    DLL* dNew;
    dNew = (DLL*)malloc(sizeof(DLL));
    dNew -> head = NULL;
    return dNew;
    
}

int listEmpty(DLL *list){
    if (list -> head == NULL){
        return 1;
    }
    return 0;
}

void insert(DLL* list, Node* newNode){
    if (listEmpty(list)){
        list-> head = newNode;
        return;
    }
    if (strcmp(newNode->data, list->head->data)<0){
        newNode ->next = list->head;
        list->head->prev = newNode;
        list->head = newNode;
        return;
            
    }
    Node* currentLocation = list -> head;
while (currentLocation->next != NULL && strcmp(newNode->data, currentLocation->next->data) > 0) 
    {
    currentLocation = currentLocation->next;}
    newNode->next = currentLocation->next;
    if (currentLocation->next != NULL) {
        currentLocation->next->prev = newNode;
    }
    currentLocation->next = newNode;
    newNode->prev = currentLocation;
}
void displayList(DLL *list, char startChar){
    int printedCpount = 0;

    if (listEmpty(list)){
        printf("The list is empty.\n");
        return;
    }

    Node* current = list->head;
    printf("List: ");
    while (current !=NULL){
        if(current->data[0]==startChar){
            if (printedCpount >0){
                printf(" <-> ");
                
            }
        printNode(current);
        printedCpount++;
        }
        current = current ->next;
        }
    printf("\n");
}
Node *search(DLL *L, char * key){
    Node* currentNode = L ->head;
    
    while (currentNode != NULL)
    {
        if (strcmp(currentNode->data, key)==0)
        {
            break;
        }
        currentNode = currentNode ->next;
    }
    return currentNode;
}

void Remove(DLL *L, Node *ptr){
    if (ptr->prev==NULL){
        L->head = ptr->next;

    }else
    {

        Node* A = ptr-> prev;
        A->next=ptr->next;

    }
        if (ptr->next!=NULL)
        {
        ptr->next->prev = ptr->prev;
        }

    free(ptr);
}


void freeList(DLL *L){
    Node* current = L->head;
    Node* nextNode;
    while (current!=NULL)
    {
        nextNode = current ->next;
        free(current);
        current = nextNode;
    }
    free(L);
    
}
void loadTextFile(DLL *L, char *filename) {
    FILE* file = fopen(filename, "r");
    if (file ==NULL){
        printf("Error: Could not open file %s\n", filename);
        return;
    }

    char words[20];


    while (fscanf(file, "%s", words)!=  EOF){

        Node* nNode = createNode(words);
        insert(L, nNode );
    }
    fclose(file);
}
void storeTextFile(DLL *L, char * filename){
    FILE* file = fopen(filename, "w");
    if (file ==NULL){
        printf("Error: Could not open file %s\n", filename);
        return;
    }
    Node* current = L->head;
    char words[20];
    while (current!=NULL){
        fprintf(file, "%s\n", current->data);
        current= current->next;
    }
    fclose(file);
    

}
