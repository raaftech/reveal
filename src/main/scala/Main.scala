// TODO: Get started with reveal.
import scalanative.unsafe._

@extern
private object other {
  def add3(in: CLongLong): CLongLong = extern
}

@extern
private object libc {
  def system(command: CString): CInt = extern
}

import other._
import libc._

object Main {
  def main(args: Array[String]): Unit = {
    val exit = system(c"ls -l > test.txt")
    println(s"Hello, native Scala world, I got ${add3(3)} from a native C function.. and exit from some command was: $exit")
  }
}
