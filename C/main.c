#include <string.h>
#include <stdio.h>
#include <stdlib.h>
#include "dll.h"

int main(){
    DLL*myList = createList();
    int choice;
    char input[20];
    char x;
while (1)
    {
printf("\n1. Insert a string\n2. Filter by initial letter\n3. Find a string and delete it\n4. Import data from a file\n5. Store list to a file\n6. Free the space and exit\n");
    printf("Enter your choice: ");
        if  (scanf("%d", &choice) !=1){
        printf("Invalid choice. Please enter a number.\n");
        while (getchar()!= '\n');
        continue;
    }
    switch (choice)
    {
    case 1 :
            printf("Enter string to insert: ");
            scanf("%s", input);
            Node* nNode =createNode(input);
            insert(myList,nNode);
            break;
        case 2:
            printf("Enter string to insert: ");
            scanf(" %c", &x);
            displayList(myList,x);
            break;
        case 3:
            printf("Enter string to find and delete: ");
            scanf("%s", input);
            Node* found = search(myList, input);
            if (found != NULL){
                Remove(myList, found);
            }
            else{
                printf("String not found.\n");
            }
            break;
        case 4:
            printf("Enter filename to import: ");
            scanf("%s", input);
            loadTextFile(myList, input);
            

        break;

        case 5:
            printf("Enter filename to store: ");
            scanf("%s", input);
            storeTextFile(myList, input);

        break;
        case 6:
            freeList(myList);
            exit(0);
        break;
            

    default:
    printf("Invalid choice.\n");
    }
    }
    return 0;


}