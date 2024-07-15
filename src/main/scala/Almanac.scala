

case class Almanac(seeds: List[Long], resources: List[Resource])

object Almanac{

  def findTheLocation(seed: Long, resources: List[Resource]): Long =
    println(s"Resources: ${resources.map(_.section).mkString(" -> ")}")
    resources.foldLeft(seed) { (number, resource) =>
      println(s"current number is: $number")
      println(s"section type: ${resource.section}")
      //resource.ranges.foreach(range => println(s"RangeFunction: $range"))
      val transformation = Resource.transformTheNumber(number, resource.ranges)
      //println(s"its transformation is $transformation")
      transformation
    }

  def lowestLocation(seeds: List[Long], resources: List[Resource]): Long =
    seeds.map( seed => findTheLocation(seed, resources)).min

}


