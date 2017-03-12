// Define a function with the name and parameters: makeChange(double itemCost, double dollarsProvided)
// Calculate and return the calculated change which should be the dollarsProvided minus the itemCost

// Remember to return a value you need 1) a return type and 2) a return statement


public double makeChange(double itemCost, double dollarsProvided) {
    return dollarsProvided - itemCost;
}

/*
public double makeChange(double itemCost, double dollarsProvided) {
    double change = dollarsProvided - itemCost;
    return change;
}
*/

// Function Call
double returnedChange = makeChange(3.60, 5.75);
