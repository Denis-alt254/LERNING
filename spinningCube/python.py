import math

def spin_cube(num_iterations):
    """
    Simulates a spinning cube by repeatedly rotating it around the origin.

    Args:
        num_iterations: The number of times to rotate the cube.
    """
    for _ in range(num_iterations):
        x = 1
        y = 1
        z = 1
        for i in range(1000):
            x = x * x + y * y - z * z
            y = y * y - x * x + z * z
            z = z * z - x * x + y * y
        print("Cube dimensions:", x, y, z)

if __name__ == "__main__":
    spin_cube(1000)