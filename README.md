	
	
												Daniel Cardoso
							
													CODILITY
							
											Last Updated: 24/09/2014
												by: Daniel Cardoso
		

#DONE
#TRAIN
##Time Complexity
__TapeEquilibrium *[EASY]*__  [Description](descriptions/tape.md) / [Solution](Codility/src/train/time_complexity/TapeEquilibrium.java)

__FrogJmp *[EASY]*__

__PermMissingElem *[EASY]*__


#TRAIN

##Time Complexity



__FrogJmp *[EASY]*__

A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
Count the minimal number of jumps that the small frog must perform to reach its target.
Write a function:
```java
class Solution {
	public int solution(int X, int Y, int D);
}
```
that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:
```java
	X = 10
	Y = 85
	D = 30
``` 
the function should return 3, because the frog will be positioned as follows:

+ after the first jump, at position 10 + 30 = 40
+ after the second jump, at position 10 + 30 + 30 = 70
+ after the third jump, at position 10 + 30 + 30 + 30 = 100
	
Assume that:

+ X, Y and D are integers within the range [1..1,000,000,000];
+ X ≤ Y.
	
Complexity:

+ expected worst-case time complexity is O(1);
+ expected worst-case space complexity is O(1).

__PermMissingElem *[EASY]*__

A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
Your goal is to find that missing element.

Write a function:
```java
class Solution {
	public int solution(int[] A);
}
```
that, given a zero-indexed array A, returns the value of the missing element.
For example, given array A such that:
```java
	A[0] = 2
	A[1] = 3
	A[2] = 1
	A[3] = 5
```
the function should return 4, as it is the missing element.

Assume that:

+ N is an integer within the range [0..100,000];
+ the elements of A are all distinct;
+ each element of array A is an integer within the range [1..(N + 1)].
	
Complexity:

+ expected worst-case time complexity is O(N);
+ expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
	
Elements of input arrays can be modified.
	
##Counting Elements

__PermCheck *[EASY]*__

A non-empty zero-indexed array A consisting of N integers is given.
A permutation is a sequence containing each element from 1 to N once, and only once.
For example, array A such that:
```java
    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
```
is a permutation, but array A such that:
```java
    A[0] = 4
    A[1] = 1
    A[2] = 3
```
is not a permutation, because value 2 is missing.
The goal is to check whether array A is a permutation.
Write a function:
```java
class Solution {
 public int solution(int[] A); 
}
```
that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
For example, given array A such that:
```java
    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
```
the function should return 1.

Given array A such that:
```java
    A[0] = 4
    A[1] = 1
    A[2] = 3
```
the function should return 0.

Assume that:

+ N is an integer within the range [1..100,000];
+ each element of array A is an integer within the range [1..1,000,000,000].

Complexity:

+ expected worst-case time complexity is O(N);
+ expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
+ Elements of input arrays can be modified.

__MaxCounters *[MEDIUM]*__

You are given N counters, initially set to 0, and you have two possible operations on them:
increase(X) − counter X is increased by 1,
max counter − all counters are set to the maximum value of any counter.
A non-empty zero-indexed array A of M integers is given. This array represents consecutive operations:

+ if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
+ if A[K] = N + 1 then operation K is max counter.

For example, given integer N = 5 and array A such that:
```java
    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
```
the values of the counters after each consecutive operation will be:
```java
    (0, 0, 1, 0, 0)
    (0, 0, 1, 1, 0)
    (0, 0, 1, 2, 0)
    (2, 2, 2, 2, 2)
    (3, 2, 2, 2, 2)
    (3, 2, 2, 3, 2)
    (3, 2, 2, 4, 2)
```
The goal is to calculate the value of every counter after all operations.
Write a function:
```java
class Solution { 
public int[] solution(int N, int[] A); 
}
```
that, given an integer N and a non-empty zero-indexed array A consisting of M integers, returns a sequence of integers representing the values of the counters.
The sequence should be returned as:

+ a structure Results (in C), or
+ a vector of integers (in C++), or
+ a record Results (in Pascal), or
+ an array of integers (in any other programming language).

For example, given:
```java
    A[0] = 3
    A[1] = 4
    A[2] = 4
    A[3] = 6
    A[4] = 1
    A[5] = 4
    A[6] = 4
```
the function should return [3, 2, 2, 4, 2], as explained above.

Assume that:

+ N and M are integers within the range [1..100,000];
+ each element of array A is an integer within the range [1..N + 1].

Complexity:

+ expected worst-case time complexity is O(N+M);
+ expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

__MissingInteger *[MEDIUM]*__

Write a function:
```java
class Solution { 
public int solution(int[] A); 
}
```
that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer that does not occur in A.
For example, given:
```java
  A[0] = 1    
  A[1] = 3    
  A[2] = 6
  A[3] = 4    
  A[4] = 1    
  A[5] = 2
```
the function should return 5.

Assume that:

+ N is an integer within the range [1..100,000];
+ each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].

Complexity:

+ expected worst-case time complexity is O(N);
+ expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
+ Elements of input arrays can be modified.

##Prefix Sums

__PassingCars *[EASY]*__

A non-empty zero-indexed array A consisting of N integers is given. The consecutive elements of array A represent consecutive cars on a road.
Array A contains only 0s and/or 1s:

 + 0 represents a car traveling east,
 + 1 represents a car traveling west.
 
The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.
For example, consider array A such that:
```java
  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
```
We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).
Write a function:
```java
class Solution {
 public int solution(int[] A); 
 }
```
that, given a non-empty zero-indexed array A of N integers, returns the number of passing cars.
The function should return −1 if the number of passing cars exceeds 1,000,000,000.
For example, given:
```java
  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
```
the function should return 5, as explained above.

Assume that:

+ N is an integer within the range [1..100,000];
+ each element of array A is an integer that can have one of the following values: 0, 1.

Complexity:

+ expected worst-case time complexity is O(N);
+ expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
+ Elements of input arrays can be modified.

#TEST

__Trip Planning *[HARD]*__

A country network consisting of N cities and N − 1 roads connecting them is given. Cities are labeled with distinct integers within the range [0..(N − 1)]. Roads connect cities in such a way that each distinct pair of cities is connected either by a direct road or through a path consisting of direct roads. There is exactly one way to reach any city from any other city.
Starting out from city K, you have to plan a series of daily trips. Each day you want to visit a previously unvisited city in such a way that, on a route to that city, you will also pass through a maximal number of other unvisited cities (which will then be considered to have been visited). We say that the destination city is our daily travel target.
In the case of a tie, you should choose the city with the minimal label. The trips cease when every city has been visited at least once.
For example, consider K = 2 and the following network consisting of seven cities and six roads:
 
You start in city 2. From here you make the following trips:

+ day 1 − from city 2 to city 0 (cities 1 and 0 become visited),
+ day 2 − from city 0 to city 6 (cities 4 and 6 become visited),
+ day 3 − from city 6 to city 3 (city 3 becomes visited),
+ day 4 − from city 3 to city 5 (city 5 becomes visited).
	
The goal is to find the sequence of travel targets. In the above example we have the following travel targets: (2, 0, 6, 3, 5).
Write a function:
```java
class Solution {
	public int[] solution(int K, int[] T);
}
```
that, given a non-empty zero-indexed array T consisting of N integers describing a network of N cities and N − 1 roads, returns the sequence of travel targets.
Array T describes a network of cities as follows:

+ if T[P] = Q and P ≠ Q, then there is a direct road between cities P and Q.
	
For example, given the following array T consisting of seven elements (this array describes the network shown above) and K = 2:
```java
	T[0] = 1
	T[1] = 2
	T[2] = 3
	T[3] = 3
	T[4] = 2
	T[5] = 1
	T[6] = 4
```
the function should return a sequence [2, 0, 6, 3, 5], as explained above.

Assume that:

+ N is an integer within the range [1..90,000];
+ each element of array T is an integer within the range [0..(N−1)];
+ there is exactly one (possibly indirect) connection between any two distinct roads.
	
Complexity:

+ expected worst-case time complexity is O(N);
+ expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
	
Elements of input arrays can be modified.