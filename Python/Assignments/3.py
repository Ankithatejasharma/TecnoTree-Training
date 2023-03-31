#Area and Circumference of a Circle
import math

radius = float(input("Enter the radius of the circle: "))


a = math.pi * radius ** 2
c = 2 * math.pi * radius


print("The area ",round(a,2))
print("The circumference ",round(c,2))
