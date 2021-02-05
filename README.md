# PDFComparator

## Description
The purpose of the PDF Comparator tool is to perform pixel by pixel comparison of two pdf's and validate whether they match or not.
First, the two pdf's are compared based on page count. If their is a difference, then the tool does not proceed with PDF pixel comparison as the PDF's has an obvious difference. After validating the page count, the tool converts each page to an image and performs a pixel by pixel comparison using a library called Apache PDF box. In case of differences, the tool highlights the differences of each PDF page and saves them in a location specified by the user.

## Usage Instructions
Pre-requisite:
- Java must be installed in the machine
- Java must be set as an environment variable

### Steps:
1) Download the .jar file to the desired location
2) Open command prompt and navigate to the location where the jar file is saved
3) The command to perform PDF comparison is:
java -jar PDFComparison.jar <location of first PDF> <location of second PDF> <Path where the difference must be saved>

for eg:
If the jar file is saved in the Desktop, the PDF's are placed in the folder PDFCompare within the desktop folder, and the folder ImagePath is created within the PDFCompare folder to save the differences, then the command to execute would be:

java -jar PDFComparison.jar C:\Users\Name\Desktop\PDFCompare\File1.pdf C:\Users\Name\Desktop\PDFCompare\File5.pdf C:\Users\Name\Desktop\PDFCompare\ImagePath
