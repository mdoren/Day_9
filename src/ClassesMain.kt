fun main(args: Array<String>){

    val person1 = ContactsClass(1,
        "Cloud",
        "Strife",
        "firstclass@gmail.com",
        "815-555-1234",
        "815-555-1111",
        "815-555-2222")

    val person2 = ContactsClass(2,
        "Steven",
        "Stone",
        "hoennchampion@yahoo.com",
        "815-555-3334",
        "815-555-3111",
        "815-555-5552")

    person1.printAll()
    println("\n")
    person2.printAll()

}