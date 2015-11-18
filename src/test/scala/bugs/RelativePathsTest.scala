package bugs

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class RelativePathsTest extends FlatSpec with Matchers {
  "A project" should "read relative path" in {
    val lines = scala.io.Source.fromFile("some-folder/some-file.txt").mkString
    assert(lines === "HELLO")
  }
}
