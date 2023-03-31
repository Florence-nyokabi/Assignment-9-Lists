fun main() {
    // Invoking listIndex
    println(listIndex(mutableListOf("Kenya", "Uganda", "Tanzania", "Ethiopia", "Nigeria", "Algeria", "Swaziland", "Lesotho", "Chad", "Mozambique")))

    // Invoking heightList
    println(peopleHeights(listOf(1.9, 2.3, 2.2, 3.2, 1.3, 3.4, 3.22, 2.4, 1.95, 1.67, 2.54 )))

    // Invoking person
    person()

    // Invoking addPeople
    addPeople()

    // Invoking Car
    var carList = listOf(
        Car("KE123",124.0),
        Car("BR12",56.0),
        Car("KE23",349.0),
        Car("we28",45.0),
    )
    println(registrationMileage(carList))

}

/*
Question 1
Given a list of 10 strings,
write a function that returns a list of the strings at even indices i.e 2, 4, 6

*/
fun listIndex(country: List<String>): List<String>{
    var emptyList = mutableListOf<String>()
        for (x in country){
            if (country.indexOf(x) % 2 == 0)
                emptyList += x
        }
    return emptyList
}


/*
Question 2

Given a list of people's heights in metres. Write a function that returns the average and the total height.

*/
data class peopleHeight( var sumHeight: Double, var averageHeight: Double)
fun peopleHeights(height: List<Double>): peopleHeight{
    val sumHeight = height.sum()
    val averageHeight = height.average()

    return peopleHeight(sumHeight, averageHeight)

}

/*
Question 3

Given  a list Person objects, each with the attributes, name, age, height and weight. Sort the list in order of descending age.

 */
data class Person(var name: String, var age: Int, var height: Double, var weight: Double)
fun person(){
    val person1 = Person("Florence", 20,1.2,43.0)
    val person2 = Person("Beth", 45,2.5,60.0)
    val person3 = Person("Glorie", 18,1.8,50.0)
    val person4 = Person("Joy", 14,1.3,30.0)
    val person5 = Person("Penina", 22,1.4,50.0)
    val person6 = Person("Henriette", 21,1.2,80.0)

    var peopleList = mutableListOf(person1, person2, person3, person4, person5, person6)


    var sortAges = peopleList.sortedByDescending {person -> person.age }
    println(sortAges)


}

/*
Question 4

Given a list similar to the one above, write a function in which you will create 2 more people objects and add them to the list at one go.

*/
fun addPeople() {
    var person7= Person("Megan",22,124.0,68.0)
    var person8= Person("Victoria",22,142.0,58.0)

    println(listOf(person7, person8))

}


/*
Question 5

Write a function that takes in a list of Car objects each with a registration and mileage attribute and returns the average mileage of all vehicles in the list.

*/
data class Car( var registration: String, var mileage: Double)
fun registrationMileage(carList: List<Car>): Double {
    var sumMileage = 0.0
    for (x in carList){
        sumMileage += x.mileage
    }

    return sumMileage/carList.size
}
