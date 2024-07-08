

class TestPart1 extends munit.FunSuite{

  val rangeFunction1 = RangeFunction(52, 50, 48)
  val rangeFunction2 = RangeFunction(50, 98, 2)
  val rangesFunctions = Seq(rangeFunction1, rangeFunction2)
  val resource = Resource(rangesFunctions, Section.Soil)

  test("testing the mapTheNumber method"){
    
    val valueInRange = 78
    val valueNotInRange = 49
    
    val result1 = Resource.mapTheNumber(valueInRange, rangeFunction2)
    val result2 = Resource.mapTheNumber(valueNotInRange, rangeFunction2)
    
    assertEquals(result1, Some(80))
    assertEquals(result2, None)
  }

}
