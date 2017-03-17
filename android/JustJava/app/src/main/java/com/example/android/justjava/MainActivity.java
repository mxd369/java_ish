package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //method call
        createWeatherMessage(77, "San Francisco");
    }

    /**
     * Create new message that specifies the city name and temperature
     *
     *  @param temperature of the city
     *  @param cityName is the name of the city
     */
    //method
    private String createWeatherMessage(int temperature, String cityName) {
        // string literal that is concatenated
        return "Welcome to " + cityName + " where the temperature is " + temperature + " Degrees F";
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        String priceMessage = createOrderSummary(price);
        displayMessage(priceMessage);
    }

    /**
     *  Calculate Price Method: Calculates the price of the order.
     *
     *  @return total price
     */
    private int calculatePrice() {
        int price = quantity * 5;
        return price;
    }

    /*
    *
    */
    private String createOrderSummary(int number) {
        String priceMessage = "Name: Kaptain Kunal";
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal: $" + calculatePrice();
        priceMessage += "\nThank you!";
        return priceMessage;
    }

    /**
     * This method is called when the increment button(+) is clicked
     */
    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the increment button(+) is clicked
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}