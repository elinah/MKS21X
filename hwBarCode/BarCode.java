public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;
    private static final String[] code = {"||:::",":::||","::|:|","::||:",
					  ":|::|",":|:|:",":||::","|:::|",
					  "|::|:","|:|::"};

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
	    sum += Integer.valueOf(_zip.substring(i,i+1));
	return sum;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String retStr = _zip + _checkDigit + " |";
	for (int i=0;i<_zip.length();i++)
	    retStr += code[Integer.parseInt(_zip.substring(i,i+1))];
	retStr += code[_checkDigit] + "|";
	return retStr;
    }


    public boolean equals(Object other){
	return this == other ||
	    (other instanceof BarCode && _zip.equals(((BarCode)other)._zip));
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Object other){
	return _zip.compareTo(((BarCode)other)._zip);
    }
    // postcondition: compares the zip + checkdigit 

    public static void main(String[] args){
	BarCode a = new BarCode("54658");
	BarCode b = new BarCode("54778");
	BarCode c = new BarCode("54778");
	System.out.println(a);
	System.out.println(b);
	System.out.println(a.equals(b));
	System.out.println(a.compareTo(b));
	System.out.println(b.equals(c));
	System.out.println(c.compareTo(b));
    }
}
