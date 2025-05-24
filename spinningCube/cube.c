
#include <stdio.h>
#include <stdlib.h>

#define PI 3.141592653589793

int main() {
  int x, y, z;
  int i, j;

  // Initialize the cube's dimensions
  x = 1;
  y = 1;
  z = 1;

  // Spin the cube
  for (i = 0; i < 1000; i++) { // Spin for 1000 iterations
    // Rotate the cube
    for (j = 0; j < 100; j++) {
      // Rotate x
      x = x * x + y * y - z * z;

      // Rotate y
      y = y * y - x * x + z * z;

      // Rotate z
      z = z * z - x * x + y * y;
    }
  }

  // Print the cube's dimensions
  printf("Cube dimensions: x = %d, y = %d, z = %d\n", x, y, z);

  return 0;
}