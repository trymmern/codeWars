package main

func ArrayDiff(a []int, b []int) []int {
	mb := make(map[int]struct{}, len(b))
    for _, x := range b {
        mb[x] = struct{}{}
    }
    var diff []int
    for _, x := range a {
        if _, found := mb[x]; !found {
            diff = append(diff, x)
        }
    }
    return diff
}

func main() {
	for _, v := range ArrayDiff([]int{1, 2, 3}, []int{1}) {
		println(v)
	}
}