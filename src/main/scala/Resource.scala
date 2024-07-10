

case class Resource(ranges: Seq[RangeFunction], section: Section)


enum Section:
  case Seed, Soil, Fertilizer, Water,
    Light, Temperature, Humidity, Location

object Resource{

  def mapTheNumber(value: Long, rangeFunction: RangeFunction): Option[Long] =
    val (destination, source, size) = rangeFunction
    if value <= (source + destination - 1) && value >= source then
      Some(destination + (value - source))
    else 
      None  

}