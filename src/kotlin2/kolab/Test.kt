package kotlin2.kolab

fun highOrderFunction(y: (Int) -> Int): Int{

    return y(10)
}

fun main() {
    highOrderFunction { x -> x*x }
}