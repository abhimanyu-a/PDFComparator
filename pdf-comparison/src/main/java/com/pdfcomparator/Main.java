package com.pdfcomparator;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		if (args.length < 2) {
			showUsage();
		} else {
			PDFUtil pdfutil = new PDFUtil();
			pdfutil.setCompareMode(CompareMode.VISUAL_MODE);

			if (args.length > 2) {
				pdfutil.compareAllPages(true);
				pdfutil.highlightPdfDifference(true);
				pdfutil.setImageDestinationPath(args[2]);
			}

			if (pdfutil.compare(args[0], args[1])) {
				System.out.println();
				System.out.println("Analyzing results...");
				System.out.println("The PDF's MATCH");
			} else {
				System.out.println();
				System.out.println("Analyzing results...");
				System.out.println("The PDF's donot match");
			}
		}
	}

	private static void showUsage() {
		System.out.println("Usage: java -jar pdf-util.jar file1.pdf file2.pdf [Optional:image-destination-path]");
	}
}