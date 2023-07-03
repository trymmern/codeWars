fun solve(n: Int, k: Int): Int {
    var nums = MutableList(n) { it+1 }
    var people: MutableList<Person> = nums.forEachIndexed { index, it ->
        if (index == nums.size) {
            return Person(it, 0)
        }
        return Person(it, people[index+1])
    }

    index = k-1 % people.size
    println(index)
    while (people.size > 1) {
        people.removeAt(index)
    }

    return people[0]
}

class Person {
    var Self: Int
    var Next: Int
   constructor(self: Int, next: Int) {
        Self = self
        Next = next
   }
}

solve(11, 19)