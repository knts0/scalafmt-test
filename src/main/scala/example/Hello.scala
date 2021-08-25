package example

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"

  val x = 3

  /** case文を揃える */
  x match {
    case 3  => "ok 3"
    case 44 => "ok 44"
    case _  => "ng"
  }

  Map(
    1  -> "a",
    22 -> "b",
  )

  /** 1行あたりの文字数が多いと改行される */
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
  type A = Seq[String]
  type B = List[String]
}

abstract class Fuga {}

/**
  * TODO: 空行が勝手に挿入されることがある
  */

/**
  * TODO: extendsのインデント設定
  */

/**
  * TODO: slickのフォーマットが変な感じになる問題
  */
