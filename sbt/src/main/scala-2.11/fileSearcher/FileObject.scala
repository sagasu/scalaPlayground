package fileSearcher

import java.io.File

trait IOObject{
  val file: File
  val name: String = file.getName()
}

case class FileObject(file: File) extends IOObject
case class DirectoryObject(file: File) extends IOObject
