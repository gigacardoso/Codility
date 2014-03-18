package main

import (
	"fmt"
)

func abs(a int) int {
	if a < 0 {
		return -a
	}
	return a
}

func solution(A []int) int {
		// write your code in Java SE 7
	var a int = 0
	var b  int = 0
	a = A[0]
	for i := 1; i < len(A); i++ {
		b += A[i]
	}
	var max int = abs(a-b)
	for i := 1 ; i < len(A)-1; i++{
		a += A[i]
		b -= A[i]
		var sum int = abs(a-b)
		if(sum < max){
			max = sum
		}
	}
	return max;
}

func main() {
	A := []int{3000,1000}
	fmt.Println("A ==", A)
	i := solution(A)
	fmt.Println(i)
}