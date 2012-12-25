package org.xmlcml.pdf2svg;

import org.junit.Ignore;
import org.junit.Test;

/** typical files that may or may give errors
 * will not be run in normal testing
 * 
 * @author pm286
 *
 */
public class SamplesForTest {
	
	public static void main(String[] args) {
		// Comment in/out what you want
		// Word thesis 1 document
//		new PDF2SVGConverter().run("-outdir", "target/word", "src/test/resources//word/harterchap7small.pdf");
//		// encryption 1 article
//		new PDF2SVGConverter().run("-outdir", "target/ajc", "../pdfs/ajc/CH01182.pdf");
//		// AJC corpus 52 sec
//		new PDF2SVGConverter().run( "-logger", "-infofiles", "-logglyphs", "-outdir", "target/ajc/sample", "../pdfs/ajc/sample");
//		// ?? 42 secs
//		new PDF2SVGConverter().run("-logger", "-outdir", "target/0all/0", "../pdfs/0all/0");
//		// 100 CSIRO all work
//		new PDF2SVGConverter().run("-logger", "-outdir", "target/csiro/pick100", "../pdfs/csiro/pick100");
//		// IUCR has symbol fonts MT_MI/MT_SY
//		new PDF2SVGConverter().run("-logger", "-outdir", "target/iucr", "../pdfs/iucr");
//		// CSIRO 
//		new PDF2SVGConverter().run("-logger", "-outdir", "target/csiro/test", "../pdfs/csiro/test");
//		// CSIRO AusSystBot26 // needs a few symbols doing // 180 secs
		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/csiro/AusSystBot26", "../pdfs/csiro/AusSystBot26");
		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/BotJLinn55", "../pdfs/BotJLinn55");
		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/IchthyRes79", "../pdfs/IchthyRes79");
//		// this has a LOT of problem fonts - Type3, no x,y coords, etc.
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/zootaxa37", "../pdfs/zootaxa37");
//		// contains Calibri
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/bmc/1471-2148-11-332/", "../pdfs/bmc/1471-2148-11-332.pdf");
//	    // BMC evol biol
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/bmc/evolbio/", "../ami2/pdfs/bmcevolbiol/2/");
//		// other BMC
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/bmc/", "../pdfs/bmc");
		// Elsevier trees (47)
		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/e/49MPE/", "../pdfs/e/49MPE/");
//		// 
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/acs/", "../pdfs/acs/");
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/ajc/", "../pdfs/ajc/");
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/ajc/sample", "../pdfs/ajc/sample");
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/apa/", "../pdfs/apa/");
		// 6
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/arxiv/", "../pdfs/arxiv/");
		// 27
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/bmc/", "../pdfs/bmc/");
		// 8
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/csiro/", "../pdfs/csiro/");
		// 3
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/e/", "../pdfs/e/");
		// fontType0 problems...
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/jb/", "../pdfs/jb/");
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/misc/", "../pdfs/misc/");
//      new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/npg/", "../pdfs/npg/");
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/plosone/", "../pdfs/plosone/");
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/ppt/", "../pdfs/ppt/");
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/psyc/", "../pdfs/psyc/");
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/rsc/many/", "../pdfs/rsc/many/");
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/springer/", "../pdfs/springer/");
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/thesis/", "../pdfs/thesis/");
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/wiley/", "../pdfs/wiley/");
//		new PDF2SVGConverter().run("-logger", "-infofiles", "-logglyphs", "-outdir", "target/word/", "../pdfs/word/");
	}

}