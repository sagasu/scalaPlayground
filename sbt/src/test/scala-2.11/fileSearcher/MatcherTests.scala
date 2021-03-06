package fileSearcher

import org.scalatest.FlatSpec
import java.io.File

class MatcherTests extends FlatSpec {
  "Matcher that is passed a file matching the filter" should
  "return a list with that file name" in {
    val matcher = Matcher("fake", "fakePath")
    
    val res = matcher.execute()
    
    assert(res == List("fakePath"))
  }
  
  "Matcher using a directory containing one file matching the filter" should
  "return a list with that file name" in {
    val matcher = new Matcher("txt", new File(".\\testfiles\\").getCanonicalPath())
    
    val resul  = matcher.execute()
    
    assert(resul == List("readme.txt"))
  }
  
  "Matcher that is not passed a root file location" should
  "use current location" in {
    val matcher = new Matcher("filter")
    
    assert(matcher.rootLocation == new File(".").getCanonicalPath())
  }
  
  "Matcher with subFolder checking matching a root location with two subtree files matching" should
  "return a list with those file names" in {
    val searchSubDirectories = true
    val matcher = new Matcher("txt", new File(".\\testfiles\\").getCanonicalPath(),
        searchSubDirectories)
    val results = matcher.execute()
    assert(results == List("notes.txt", "readme.txt"))
  }
}