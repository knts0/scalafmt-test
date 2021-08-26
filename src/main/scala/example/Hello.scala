package example

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"

  val x = 3
  val aaa = 14

  /** case文を揃える */
  x match {
    case 3  => "ok 3"
    case 44 => "ok 44"
    case _  => "ng"
  }

  for {
    a    <- Seq(1)
    fuga <- Seq("bbb")
    b     = 2

    bbb <- Seq(222)
  } yield a

  Map(
    1  -> "a",
    22 -> "b",
  )

  new Hoge("aaa", 15)

  /**
    * TODO: メソッド定義が改行される
    * testMethod(
    *   hoge1, hoge2,
    *   hoge3, hoge4, hoge5
    * )
    * のように中途半端なところで改行されていると、1行1つに直される
    */
  def testMethod(
    hoge1: String,
    hoge2: String,
    hoge3: String,
    hoge4: String,
    hoge5: String
  ) = {}
}

/**
  * TODO:
  * {
  *   .....
  * }
  * が{}になってしまう
  */
case class Hoge(
  name: String,
  age:  Int
) extends Fuga {}

/**
  * TODO:
  * Seq [String]
  * List[String]
  * のように[を縦に揃えたい
  *
  * おそらく余計な空白を全く許容しない設定になっている
  */
object Hoge {
  type A  = Seq[String]
  type BB = List[String]
}

abstract class Fuga {}

case class Foo(firstParam: Int, secondParam: String, thirdParam: Boolean) {
  def Foo(
    firstParam:  Int,
    secondParam: String,
    thirdParam:  Boolean
  ) = ???
}

/**
  * TODO: 空行が勝手に挿入されることがある
  */

/**
  * TODO: slickのフォーマットが変な感じになる問題(おそらく空行)
  */
