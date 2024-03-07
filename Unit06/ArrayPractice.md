1. [`firstLast6`](https://codingbat.com/prob/p185685)

   Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

   `firstLast6([1, 2, 6]) → true`

   `firstLast6([6, 1, 2, 3]) → true`

   `firstLast6([13, 6, 1, 2, 3]) → false`

1. [`commonEnd`](https://codingbat.com/prob/p191991)

   Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

   `commonEnd([1, 2, 3], [7, 3]) → true`

   `commonEnd([1, 2, 3], [7, 3, 2]) → false`

   `commonEnd([1, 2, 3], [1, 3]) → true`

1. [`maxEnd3`](https://codingbat.com/prob/p146256)

   Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

   `maxEnd3([1, 2, 3]) → [3, 3, 3]`

   `maxEnd3([11, 5, 9]) → [11, 11, 11]`

   `maxEnd3([2, 11, 3]) → [3, 3, 3]`

1. [`plusTwo`](https://codingbat.com/prob/p180840)

   Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

   `plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]`

   `plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]`

   `plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]`

1. [`swapEnds`](https://codingbat.com/prob/p118044)

   Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.

   `swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]`

   `swapEnds([1, 2, 3]) → [3, 2, 1]`

   `swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]`

1. [`countEvens`](https://codingbat.com/prob/p162010)

   Return the number of even ints in the given array.

   `countEvens([2, 1, 2, 3, 4]) → 3`

   `countEvens([2, 2, 0]) → 3`

   `countEvens([1, 3, 5]) → 0`

1. [`sum13`](https://codingbat.com/prob/p127384)

   Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

   `sum13([1, 2, 2, 1]) → 6`

   `sum13([1, 1]) → 2`

   `sum13([1, 2, 2, 1, 13]) → 6`

1. [`withoutTen`](https://codingbat.com/prob/p196976)

   Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.

   `withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]`

   `withoutTen([10, 2, 10]) → [2, 0, 0]`

   `withoutTen([1, 99, 10]) → [1, 99, 0]

1. [`lucky13`](https://codingbat.com/prob/p194525)

   Given an array of ints, return true if the array contains no 1's and no 3's.

   `lucky13([0, 2, 4]) → true`

   `lucky13([1, 2, 3]) → false`

   `lucky13([1, 2, 4]) → false`

1. [`sum67`](https://codingbat.com/prob/p111327)

   Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

   `sum67([1, 2, 2]) → 5`

   `sum67([1, 2, 2, 6, 99, 99, 7]) → 5`

   `sum67([1, 1, 6, 7, 2]) → 4`

1. [`only14`](https://codingbat.com/prob/p186672)

   Given an array of ints, return true if every element is a 1 or a 4.

   `only14([1, 4, 1, 4]) → true`

   `only14([1, 4, 2, 4]) → false`

   `only14([1, 1]) → true`

1. [`has77`](https://codingbat.com/prob/p168357)

   Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.

   `has77([1, 7, 7]) → true`

   `has77([1, 7, 1, 7]) → true`

   `has77([1, 7, 1, 1, 7]) → false`

1. [`has22`](https://codingbat.com/prob/p121853)

   Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

   `has22([1, 2, 2]) → true`

   `has22([1, 2, 1, 2]) → false`

   `has22([2, 1, 2]) → false`

1. [`more14`](https://codingbat.com/prob/p104627)

   Given an array of ints, return true if the number of 1's is greater than the number of 4's.

   `more14([1, 4, 1]) → true`

   `more14([1, 4, 1, 4]) → false`

   `more14([1, 1]) → true`

1. [`twoTwo`](https://codingbat.com/prob/p102145)

   Given an array of ints, return true if every 2 that appears in the array is next to another 2.

   `twoTwo([4, 2, 2, 3]) → true`

   `twoTwo([2, 2, 4]) → true`

   `twoTwo([2, 2, 4, 2]) → false`

1. [`pre4`](https://codingbat.com/prob/p100246)

   Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4.

   `pre4([1, 2, 4, 1]) → [1, 2]`

   `pre4([3, 1, 4]) → [3, 1]`

   `pre4([1, 4, 4]) → [1]`

1. [`zeroFront`](https://codingbat.com/prob/p193753)

   Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

   `zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]`

   `zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]`

   `zeroFront([1, 0]) → [0, 1]`
