## **Q. Why the length of an array is established when the array is created?**
###### In the C based languages allocated memory for each data type is determined during the compilation. 
###### Since array is nothing but collection of a specific datatype grouped together, it’s size in bits equals to ((datatype of the element) * (length of the array)). 
###### Compilator needs to realize how much memory should he allocate for each datatype before the execution of the program, because it is not possible to allocate more memory after the execution.
