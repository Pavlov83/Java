package primitive_types_challenge;

public class PrimitiveTypesChallenge {

    //create byte variable with valid byte number
    //create short variable and set it to any valid short number
    //create int variable and set it to any int number
    //create variable of type long and make it equal to
    //50000 plus 10times the sum of the byte + sum of the byte,short and int

    byte byteNum = 34;
    int intNumber = 3456;
    short myShortNum = 28900;
    long sumOfNumbers = byteNum + intNumber + myShortNum;
    long longNum = 50000 + (10 * sumOfNumbers);
}
