# Creating an Array in Java

**Here we see three different methods to display the array in Java:**

## 1. Normal Method

Uses a simple for loop to iterate the elements of the array and then display each element of the array.

```
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}
```

## 2. Enhanced For Loop Method

It Creates an object similar to the array and prints each element using an enhanced for loop. It is also known as For-each loop.

```
for (int element : array) {
    System.out.println(element);
}
```

## 3. Using toString() Method

It Converts the array data into a String and then prints the elements of the array . This method is part of the java.util package.

```
System.out.println(Arrays.toString(array));
```