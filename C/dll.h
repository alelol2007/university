#ifndef DLL_H
#define DLL_H
#include "node.h"
typedef struct {
    Node *head; 
} DLL;

DLL* createList();       
int listEmpty(DLL *list);
void insert(DLL *list, Node *newNode);
Node *search(DLL *L, char * key);
void loadTextFile(DLL *L, char * filename);
void Remove(DLL *L, Node *ptr);
void freeList(DLL *L);
void storeTextFile(DLL *L, char *filename);
void displayList(DLL *list, char startChar);

#endif