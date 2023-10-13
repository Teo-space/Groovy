println "Start"


def list = ["1", "2", "3", "4", "5", "6", "7"]

//println list

//list.each {x -> println x}

println ([1,[2,3],[[4]],[],5].flatten())

println list.first
println list.last
println list.head()


def numbers = [1, 2, 3, 4, 5, 6, 7]
def evenNumbers = numbers.findAll { it % 2 == 0}
def squaresOfNumbers = evenNumbers.collect { it * it}

println numbers
println evenNumbers

println squaresOfNumbers

def sum = numbers
        .findAll { it % 2 == 0}
        .collect { it * it}
        .sum(0)

println sum






