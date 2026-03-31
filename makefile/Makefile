CC = gcc
CFLAGS = -Wall -Wextra -std=c11
OBJ = add.o subtract.o multiply.o divide.o main.o
TARGET = calculator

$(TARGET): $(OBJ)
	$(CC) $(CFLAGS) -o $(TARGET) $(OBJ)

add.o: add.c
	$(CC) $(CFLAGS) -c add.c

subtract.o: subtract.c
	$(CC) $(CFLAGS) -c subtract.c

multiply.o: multiply.c
	$(CC) $(CFLAGS) -c multiply.c

divide.o: divide.c
	$(CC) $(CFLAGS) -c divide.c

clean:
	rm -f $(TARGET) *.o
