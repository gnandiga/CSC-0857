object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(171); 

	def readFasta(fileName: String): String = {
		scala.io.Source.fromInputStream(getClass.getResourceAsStream(fileName)).getLines().drop(1).mkString("")
	};System.out.println("""readFasta: (fileName: String)String""");$skip(336); 

	def extractGap(line: String, fastaString: String): String ={
		println(line)
		val gapRefs = line.split("\\s")
		println(gapRefs(2) + ":"+  gapRefs(3))
		if(gapRefs(4).toInt < 0)
			println(fastaString.substring(gapRefs(3).toInt, gapRefs(2).toInt))
		else
			println(fastaString.substring(gapRefs(2).toInt, gapRefs(3).toInt))
		""
	};System.out.println("""extractGap: (line: String, fastaString: String)String""");$skip(69); 
	
	
	val fastaString = readFasta("Mycoplasma_pneumoniae_M129.fasta");System.out.println("""fastaString  : String = """ + $show(fastaString ));$skip(154); 
	scala.io.Source
		.fromInputStream(getClass.getResourceAsStream("diff.log"))
		.getLines().drop(4).foreach{
			line => extractGap(line, fastaString)
		};$skip(48); 
	
	
  println("Welcome to the Scala worksheet")}
}