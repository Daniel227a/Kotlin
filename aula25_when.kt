

fun menu(a: String):Int
{
    when(a)
    {
        "voluma+"->
        {

            return 1

        }
        "volume-"->
        {
        return 2
        }
    }
return 0

}
fun intervalo(a:Int)
{
    when (a) {
        in 1..200 -> {
            println("valido")

        }
    }


}
    fun main()
{
    intervalo(20)

}