fun main(args:Array<String>){
    println("INSIRA O PRIMEIRO VALOR A SER CALCULADO ")
   val x: Float = readLine()!!.toFloat()
    println("INSIRA O SEGUNDO NUMERO A SER CALCULADO")
    val y : Float= readLine()!!.toFloat()
    val multiplicacao: Float= multiplica(x, y)
    println("O resultado da multiplicação é: $multiplicacao")
    val somas: Float= soma(x, y)
    println("O resultado da soma é:  $somas")
    val divide: Float= divisao(x, y)
    println("O resultado da divisão é :  $divide")
    val subtrai: Float= subtracao(x, y )
    println("O resultado da subtração é :  $subtrai")
    val rest: Float= resto(x, y)
    print("O resto da divisao é igual a :  $rest")


    return


}
//nessa primeira função vou somar dois numeros a serem escolhidos
fun soma(x:Float, y:Float)= x+y
// nessa segunda função vou subtrair dois números distintos a serem escolhidos
fun subtracao(x:Float, y:Float)= x-y
// Nessa terceira função vou multiplicar dois números distintos a serem escolhidos
fun multiplica(x:Float, y:Float)= x*y
// Nessa terceira função vou dividir dois números distintos a serem escolhidos
fun divisao(x:Float, y:Float)= x/y
// Nessa quarta função vou mostrar o valor do resto da divisao
fun resto(x:Float, y:Float)= x%y
