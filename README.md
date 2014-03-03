#########################################################################################
#                                                                                       #
#                                    Daniel Cardoso                                     #
#                                                                                       #
#                                       CODILITY                                        #
#                                                                                       #
#                         Last Updated: 03/03/2014                                      #
#                                   by: Daniel Cardoso                                  #
#                                                                                       #
#########################################################################################

TRAIN
=====
Time Complexity
---------------

#TapeEquilibrium [EASY]
A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
Any integer P, such that 0 < P < N, splits this tape into two non−empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
For example, consider array A such that:
>  A[0] = 3
>  A[1] = 1
>  A[2] = 2
>  A[3] = 4
>  A[4] = 3
We can split this tape in four places:
•	P = 1, difference = |3 − 10| = 7 
•	P = 2, difference = |4 − 9| = 5 
•	P = 3, difference = |6 − 7| = 1 
•	P = 4, difference = |10 − 3| = 7 
Write a function:
class Solution { public int solution(int[] A); }
that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
For example, given:
>  A[0] = 3
>  A[1] = 1
>  A[2] = 2
>  A[3] = 4
>  A[4] = 3
the function should return 1, as explained above.
Assume that:
•	N is an integer within the range [2..100,000];
•	each element of array A is an integer within the range [−1,000..1,000].
Complexity:
•	expected worst-case time complexity is O(N);
•	expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

#FrogJmp [EASY]

A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
Count the minimal number of jumps that the small frog must perform to reach its target.
Write a function:
class Solution { public int solution(int X, int Y, int D); }
that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
For example, given:
  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:
•	after the first jump, at position 10 + 30 = 40
•	after the second jump, at position 10 + 30 + 30 = 70
•	after the third jump, at position 10 + 30 + 30 + 30 = 100
Assume that:
•	X, Y and D are integers within the range [1..1,000,000,000];
•	X ≤ Y.
Complexity:
•	expected worst-case time complexity is O(1);
•	expected worst-case space complexity is O(1).

#PermMissingElem [EASY]

A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
Your goal is to find that missing element.
Write a function:
class Solution { public int solution(int[] A); }
that, given a zero-indexed array A, returns the value of the missing element.
For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.
Assume that:
•	N is an integer within the range [0..100,000];
•	the elements of A are all distinct;
•	each element of array A is an integer within the range [1..(N + 1)].
Complexity:
•	expected worst-case time complexity is O(N);
•	expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
	
Counting Elements
-----------------

#PermCheck [EASY]


TEST
====

Trip Planning [HARD]
--------------------

A country network consisting of N cities and N − 1 roads connecting them is given. Cities are labeled with distinct integers within the range [0..(N − 1)]. Roads connect cities in such a way that each distinct pair of cities is connected either by a direct road or through a path consisting of direct roads. There is exactly one way to reach any city from any other city.
Starting out from city K, you have to plan a series of daily trips. Each day you want to visit a previously unvisited city in such a way that, on a route to that city, you will also pass through a maximal number of other unvisited cities (which will then be considered to have been visited). We say that the destination city is our daily travel target.
In the case of a tie, you should choose the city with the minimal label. The trips cease when every city has been visited at least once.
For example, consider K = 2 and the following network consisting of seven cities and six roads:
 
You start in city 2. From here you make the following trips:
•	day 1 − from city 2 to city 0 (cities 1 and 0 become visited),
•	day 2 − from city 0 to city 6 (cities 4 and 6 become visited),
•	day 3 − from city 6 to city 3 (city 3 becomes visited),
•	day 4 − from city 3 to city 5 (city 5 becomes visited).
The goal is to find the sequence of travel targets. In the above example we have the following travel targets: (2, 0, 6, 3, 5).
Write a function:
class Solution { public int[] solution(int K, int[] T); }
that, given a non-empty zero-indexed array T consisting of N integers describing a network of N cities and N − 1 roads, returns the sequence of travel targets.
Array T describes a network of cities as follows:
•	if T[P] = Q and P ≠ Q, then there is a direct road between cities P and Q.
For example, given the following array T consisting of seven elements (this array describes the network shown above) and K = 2:
    T[0] = 1
    T[1] = 2
    T[2] = 3
    T[3] = 3
    T[4] = 2
    T[5] = 1
    T[6] = 4
the function should return a sequence [2, 0, 6, 3, 5], as explained above.
Assume that:
•	N is an integer within the range [1..90,000];
•	each element of array T is an integer within the range [0..(N−1)];
•	there is exactly one (possibly indirect) connection between any two distinct roads.
Complexity:
•	expected worst-case time complexity is O(N);
•	expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.

Solution:

