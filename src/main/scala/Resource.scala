

case class Resource(ranges: Seq[RangeFunction], section: Section)

type RangeFunction = (Int, Int, Int)

enum Section:
  case Seed, Soil, Fertilizer, Water,
    Light, Temperature, Humidity, Location

object Resource{

  def mapTheNumber(value: Int, rangeFunction: RangeFunction): Option[Int] =
    val (destination, source, size) = rangeFunction
    if value <= (source + destination - 1) && value >= source then
      Some(destination + (value - source))
    else 
      None  

}