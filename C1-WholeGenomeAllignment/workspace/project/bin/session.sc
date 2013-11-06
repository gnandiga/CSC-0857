object session {

	def readFasta(fileName: String): String = {
		scala.io.Source.fromInputStream(getClass.getResourceAsStream(fileName)).getLines().drop(1).mkString("")
	}                                         //> readFasta: (fileName: String)String

	def extractGap(line: String, fastaString: String): String ={
		println(line)
		val gapRefs = line.split("\\s")
		println(gapRefs(2) + ":"+  gapRefs(3))
		if(gapRefs(4).toInt < 0)
			println(fastaString.substring(gapRefs(3).toInt, gapRefs(2).toInt))
		else
			println(fastaString.substring(gapRefs(2).toInt, gapRefs(3).toInt))
		""
	}                                         //> extractGap: (line: String, fastaString: String)String
	
	
	val fastaString = readFasta("Mycoplasma_pneumoniae_M129.fasta")
                                                  //> fastaString  : String = TATTTACCGACGAAATTAATACCATCAGGGTATTAAGATGCTACCAACGTGG
                                                  //| TATTAAAATGTGCCCAACCGCGAAAAAGAAAGTGGTATATAGGAAAATGGAAAACAAATTTGTTTGCCGTTTACTA
                                                  //| TTAAATACTAATCTTCTATATAGTATAGAGAAACTTTTTCTTTAACATAATATTATCTTAATATTATTTACCTACT
                                                  //| AATAGCTTAATATTATTAGTATTTATTTAGTATTATGCTAATACTATGCAGATATTATCTTAATATTATCTATAGT
                                                  //| ATTAGGCTAATATTATTCTTAATATTTATTAAGGTACTAAAGCATTACCTATAGGTGATATTATGACAATACTAAA
                                                  //| GTGGTTAGTATTATTAGGGTATTATTCAAAGTATTCTCCAACACTATTCCCTTAGCTCTAACTTAATATCCCTTTA
                                                  //| ATACCAAGATGGTTAAACAATGAAGAAAATTAGTTGTTTGTTCTGGCCCTTTACTATATATGTACATAGTACATAT
                                                  //| ATAAGAAAGGCTACCATGACATTATATATAATAGGCATCCAGAAATAAAAGCCAAATTAATCTATAATTAAGTATT
                                                  //| TATACTTAATTATAGTTATTTTATTAACAAAATTAGTGACATTTGGCCATCCATAATAAATAAAATCAAATAAACA
                                                  //| AAACAAAAAGCAAAAAAACTATAAAAAGGGCATGAAAGTTTTGATTAATAAGAATGAGTTGAACAAAATCCTCAAA
                                                  //| AAACTCAACAATGTAATCGTATCTAACAATAAGATGAAACCATACCACTCTTATTTATTAATAGAGGCTACAGAAA
                                                  //| AGGAAATTAACTTCTATGCTAACAACGAGTACTTTTCTGCTAAATGTACCTTAGCCGAAAACATTGATGTACTTGA
                                                  //| AGAAGGTGAAGTAATTGTTAAAGG
                                                  //| Output exceeds cutoff limit.
	scala.io.Source
		.fromInputStream(getClass.getResourceAsStream("diff.log"))
		.getLines().drop(4).foreach{
			line => extractGap(line, fastaString)
		}                                 //> gi|13507739|ref|NC_000912.1|	BRK	1	568	568
                                                  //| 1:568
                                                  //| ATTTACCGACGAAATTAATACCATCAGGGTATTAAGATGCTACCAACGTGGTATTAAAATGTGCCCAACCGCGAAA
                                                  //| AAGAAAGTGGTATATAGGAAAATGGAAAACAAATTTGTTTGCCGTTTACTATTAAATACTAATCTTCTATATAGTA
                                                  //| TAGAGAAACTTTTTCTTTAACATAATATTATCTTAATATTATTTACCTACTAATAGCTTAATATTATTAGTATTTA
                                                  //| TTTAGTATTATGCTAATACTATGCAGATATTATCTTAATATTATCTATAGTATTAGGCTAATATTATTCTTAATAT
                                                  //| TTATTAAGGTACTAAAGCATTACCTATAGGTGATATTATGACAATACTAAAGTGGTTAGTATTATTAGGGTATTAT
                                                  //| TCAAAGTATTCTCCAACACTATTCCCTTAGCTCTAACTTAATATCCCTTTAATACCAAGATGGTTAAACAATGAAG
                                                  //| AAAATTAGTTGTTTGTTCTGGCCCTTTACTATATATGTACATAGTACATATATAAGAAAGGCTACCATGACATTAT
                                                  //| ATATAATAGGCATCCAGAAATAAAAGCCAAATTAA
                                                  //| gi|13507739|ref|NC_000912.1|	GAP	1850	1834	-15	-22	
                                                  //| 7
                                                  //| 1850:1834
                                                  //| CTAATGACGCTTTATG
                                                  //| gi|13507739|ref|NC_000912.1|	DUP	2817	7529	4713
                                                  //| 2817:7529
                                                  //| TGCTTATGGCTTTTAACTTTCCAACGTGCACATTAAATGGAAGACAATTAAATGGAAGACAATAACAAAACGCAAG
                                                  //| CTTACGATTCCAGTAGCATTAAGATTCTTGAAGGCTTAGAGGCCGTGCGTAAGCGCCCCGGCATGTACATCGGTTC
                                                  //| CACCGGC
                                                  //| Output exceeds cutoff limit.
	
	
  println("Welcome to the Scala worksheet")
}