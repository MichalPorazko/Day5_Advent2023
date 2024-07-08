import scala.io.Source
import munit.FunSuite

class ReadingFileTest extends FunSuite {

  val lines = Source.fromFile("exampleFile").getLines().toList
  //println(lines)

  /*test("testing reading from the file, specifically extracting the seeds") {
    val seedLine = lines.head
    val seeds = seedLine.split(" ").drop(1).map(_.toLong).toList
    assertEquals(seeds, List(79L, 14L, 55L, 13L)) // Expected list as List[Long]
  }

  test("testing the resource object creating, specifically the method splittingToResources"){

    val section = "soil-to-fertilizer map:\n0 15 37\n37 52 2"

    println(section.split("\n").toList)
    //using the tail gives you all the elements after the first one, the head
    println(section.split("\n").tail.toList)

    val receivedResource =
      section.split("\n").tail.map(entry =>
        println(s"A single entry: $entry")
        println(s"the entry after spliting: {${entry.split(" ").toList}}")
        val Array(destination, source, length) = entry.split(" ").map(_.toLong)
        Resource(destination, source, length, Section.Fertilizer)
      ).toList

    val idealResource = List(Resource(0, 15, 37, Section.Fertilizer), Resource(37,52,2, Section.Fertilizer))

    assertEquals(receivedResource, idealResource)
  }*/

  test("testing the zipping with index"){
    //val sections = lines.tail.mkString("\n").split("\n\n").toList

    val tail = lines.tail
   // println(tail)

    val splitLines = tail.flatMap( line =>
      val split = line.split("\n")
      //println(split.toList)
      //println(split.head)
      split
    )
   // println(splitLines)

    val mkStringAdd = tail.mkString("\n")
    //println(mkStringAdd)

    val split = mkStringAdd.split("\n\n").toList
    //println(split)

    val trim = split.map(_.trim).toList
    //println(trim)

    //assertEquals(split, trim)

    val sections = lines.tail.mkString("\n").split("\n\n").map(_.trim).toList
    println(sections)

    val splitSection = sections.flatMap( section =>
      val lala = section.split("\n")
      println(lala.toList)
      lala
    )
  }

  /*test("testing the whole method"){

    //val result = ReadingFile.parseAlmanac("exampleFile")

    //println(result)
  }*/
}
