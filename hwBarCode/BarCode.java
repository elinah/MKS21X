public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	try {
	    int n = Integer.parseInt(zip);
	    if (zip.length() != 5)
		throw new RuntimeException();
	    else{
		_zip = zip;
		_checkDigit = checkSum()%10;
	    }
	}catch(NumberFormatException e) {
	    throw new RuntimeException();
	}
    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
        _zip = x._zip;
	_checkDigit = x._checkDigit;
    }


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int sum = 0;
	for(int i = 0;i<_zip.length();i++)
	    sum += Integer.valueOf(_zip.charAt(i));
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){}


    public boolean equals(Object other){}
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Comparable other){}
    // postcondition: compares the zip + checkdigit 

}
