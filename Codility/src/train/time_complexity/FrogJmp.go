package main

import (
	"fmt"
	"math"
)

func solution(X,Y, D int) int {
		// write your code in Java SE 7
	a := float64(Y)/float64(D) 
	b := float64(X)/float64(D)
	return int(math.Ceil(a-b))
}

func main() {
	fmt.Println("10, 85, 30")
	i := solution(10, 85, 30)
	fmt.Println(i)
}