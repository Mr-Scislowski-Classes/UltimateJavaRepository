# Unit 6 - Array

## 6.1 - Array Creation and Access
length of array is final
(class) [] (name of the array);
(data type) [] (name of the array) = new (class) [(size)]
## 6.2 - Traversing Arrays
- using for while loops to access all elemtns

off by one, always < list.kength>
## 6.3 - Enhanced for Loop for Arrays
Declare an array

int [] something = {num1, num2, num3, num4};

for (int number: something)
{
    System.out.println(number);
}

String word

(method) current
## 6.4 - Developing Algorithms Using Arrays
private int findMin(int [] values){
    int min = Interger.MAX_VALUE;
    for (int currentValue: Values)
{
    if (currentValue < min>){
        min = currentValue;
    }
}
    return min;
}