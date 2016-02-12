package fileSearcher

import org.scalatest.FlatSpec

class FilterCheckerTests extends FlatSpec {
  "Filter checker passed a list where one file matches the filter" should
  "return a list with that file" in {
    val matchingFile = new FileObject("match")
    val listOfFiles = List(new FileObject("random"), matchingFile)
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles
    assert(matchedFiles == List(matchingFile))
  }
  
  "Filter checker passed a list with a directory that matches the filter" should
  "should not return the dictionary" in {
    val listOfIOObjects = List(new FileObject("random"), new DirectoryObject("match"))
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfIOObjects
    assert(matchedFiles.length == 0)
  }
}