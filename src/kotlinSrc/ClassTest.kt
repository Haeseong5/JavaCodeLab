package kotlinSrc

open class ClassTest {
}

class A: ClassTest() {

}

data class D(val a: D2)
data class D2(val a: String)

fun main() {
    val d = D2("1")
    val d2 = D2("1")

    println(d.hashCode())
    println(d2.hashCode())

    println(D(D2("1")).a.hashCode())

    println(D2("1").a.hashCode())
    println(D2("1").a.hashCode())

}