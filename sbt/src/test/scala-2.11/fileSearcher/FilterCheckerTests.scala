package fileSearcher

import org.scalatest.FlatSpec
import java.io.File

class FilterCheckerTests extends FlatSpec {
  "Filter checker passed a list where one file matches the filter" should
  "return a list with that file" in {
    val matchingFile = FileObject(new File("match"))
    val listOfFiles = List(FileObject(new File("random")),
        matchingFile)
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles
    assert(matchedFiles == List(matchingFile))
  }
  
  "Filter checker passed a list with a directory that matches the filter" should
  "should not return the dictionary" in {
    val listOfIOObjects = List(FileObject(new File("random")),
        DirectoryObject(new File("match")))
    val matchedFiles = FilterChecker("match") findMatchedFiles listOfIOObjects
    assert(matchedFiles.length == 0)
  }
}