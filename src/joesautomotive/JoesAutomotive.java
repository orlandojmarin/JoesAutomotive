/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joesautomotive;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *
 * @author orlandomarin
 */

/*
PROFESSOR'S DIRECTIONS IN BLACKBOARD: Using constructs from this chapter or
earlier, complete Programming Challenges #8, Joe's Automotive, on page 820.
Note: You do not need to implement the "other" services. Implement the list of
services in the bulleted list.
I expect to see comments in your code. Each class should be in a separate file
(except for event listeners).
When you are done, find the source file(s) in the project directory, find your
java file(s) there and attach them to this assignment. You also need to include
a screenshot of the results. Your screenshot needs to display your name
somewhere in the results.
*/

/*
Chapter 12 #8: Joe's Automotive performs the following routine maintenance
services: Oil change: $35, Lube job: $25, Radiator flush: $50, Transmission
flush: $120, Inspection: $35, Muffler replacement: $200, Tire rotation: $20.
Joe's also performs other nonroutine services and charges for parts and for
labor ($60 per hour). Create a GUI application that displays the total for a
customer's visit to Joe's.
*/


public class JoesAutomotive extends Application
{
    /**
     * @param args the command line arguments
     */
    
    // variables
    private Label welcomeMessage;
    private Label totalMessage;
    private double totalCost = 0.0;
    
    final double oilChangePrice = 35.00;
    final double lubeJobPrice = 25.00;
    final double radiatorFlushPrice = 50.00;
    final double transmissionFlushPrice = 120.00;
    final double inspectionPrice = 35.00;
    final double mufflerReplacementPrice = 200.00;
    final double tireRotationPrice = 20.00;
    
    public static void main(String[] args) 
    {
        // launch the application
        launch(args);    
    }
    
    @Override
    public void start(Stage primaryStage)
    {   
    
        // create a label control called welcomeMessage
       welcomeMessage = new Label("Welcome to Joe's Automotive! "
                + "Please select the maintenance services that you "
                + "would like for your car.");
        
        // create a label control called totalMessage
        totalMessage = new Label("Your total will appear here once you choose your services and calculate the total.");
        
        
        // create a button for an oil change: $35
        Button oilChangeButton = new Button(String.format("Oil Change: $%,.2f", oilChangePrice));
        
        /*
        when the oil change button is clicked, track the total cost and 
        change the background color to green
        */
        oilChangeButton.setOnAction(event ->
                {
                    totalCost += oilChangePrice;
                    oilChangeButton.setStyle("-fx-background-color: lightgreen;");
                });
        
        // create a button for a lube job: $25
        Button lubeJobButton = new Button(String.format("Lube Job: $%,.2f", lubeJobPrice));
        
        /*
        when the lube job button is clicked, track the total cost and 
        change the background color to green
        */
        lubeJobButton.setOnAction(event ->
                {
                    totalCost += lubeJobPrice;
                    lubeJobButton.setStyle("-fx-background-color: lightgreen;");
                });
        
        // create a button for a radiator flush: $50
        Button radiatorFlushButton = new Button(String.format("Radiator Flush: $%,.2f", radiatorFlushPrice));
        
         /*
        when the radiator flush button is clicked, track the total cost and 
        change the background color to green
        */
        radiatorFlushButton.setOnAction(event ->
                {
                    totalCost += radiatorFlushPrice;
                    radiatorFlushButton.setStyle("-fx-background-color: lightgreen;");
                });
        
        // create a button for a transmission flush: $120
        Button transmissionFlushButton = new Button(String.format("Transmission Flush: $%,.2f", transmissionFlushPrice));
        
         /*
        when the transmission flush button is clicked, track the total cost and 
        change the background color to green
        */
        transmissionFlushButton.setOnAction(event ->
                {
                    totalCost += transmissionFlushPrice;
                    transmissionFlushButton.setStyle("-fx-background-color: lightgreen;");
                });
        
        // create a button for an inspection: $35
        Button inspectionButton = new Button(String.format("Inspection: $%,.2f", inspectionPrice));
        
         /*
        when the inspection button is clicked, track the total cost and 
        change the background color to green
        */
        inspectionButton.setOnAction(event ->
                {
                    totalCost += inspectionPrice;
                    inspectionButton.setStyle("-fx-background-color: lightgreen;");
                });
        
        // create a button for a muffler replacement: $200
        Button mufflerReplacementButton = new Button(String.format("Muffler Replacement: $%,.2f", mufflerReplacementPrice));
        
         /*
        when the muffler replacement button is clicked, track the total cost and 
        change the background color to green
        */
        mufflerReplacementButton.setOnAction(event ->
                {
                    totalCost += mufflerReplacementPrice;
                    mufflerReplacementButton.setStyle("-fx-background-color: lightgreen;");
                });
        
        // create a button for a tire rotation: $20
        Button tireRotationButton = new Button(String.format("Tire Rotation: $%,.2f", tireRotationPrice));
        
         /*
        when the tire rotation button is clicked, track the total cost and 
        change the background color to green
        */
        tireRotationButton.setOnAction(event ->
                {
                    totalCost += tireRotationPrice;
                    tireRotationButton.setStyle("-fx-background-color: lightgreen;");
                });
        
        // create a button control
        Button calculateButton = new Button("Calculate the total");
        
        // register the event handler for the calculate button
        calculateButton.setOnAction(new ButtonClickHandler());
        
        /* 
        create a reset button that sets the totalCost to $0.00
        when the reset button is clicked, the totalMessage displayed changes.
        Also, when clicked all service buttons will go back to their default
        color.
        */
        Button resetButton = new Button("Reset");
        resetButton.setOnAction(event ->
                {
                    totalCost = 0.00;
                    totalMessage.setText("Your total will appear here once you select your services.");
                    
                    oilChangeButton.setStyle("");
                    lubeJobButton.setStyle("");
                    radiatorFlushButton.setStyle("");
                    transmissionFlushButton.setStyle("");
                    inspectionButton.setStyle("");
                    mufflerReplacementButton.setStyle("");
                    tireRotationButton.setStyle("");
                });
        
        
        // put the oil change, lube job, and radiator flush buttons in an hbox and center the hbox, with space in between each button
        HBox hbox1 = new HBox(10, oilChangeButton, lubeJobButton, radiatorFlushButton);
        hbox1.setAlignment(Pos.CENTER);
        
        // put the transmission flush and inspection buttons in an hbox and center the hbox, with space in between each button
        HBox hbox2 = new HBox(10, transmissionFlushButton, inspectionButton);
        hbox2.setAlignment(Pos.CENTER);
        
        // put the muffler replacement and tire rotation buttons in an hbox and center the hbox, with space in between each button
        HBox hbox3 = new HBox(10, mufflerReplacementButton, tireRotationButton);
        hbox3.setAlignment(Pos.CENTER);
        
        // put the calculate and reset buttons in an hbox and center the hbox, with space in between each button
        HBox hbox4 = new HBox(10, calculateButton, resetButton);
        hbox4.setAlignment(Pos.CENTER);
        
        
        // put the hboxes and the calculate button in a vbox and center the vbox, with space in between each message and hbox
        VBox vbox = new VBox(30, welcomeMessage, hbox1, hbox2, hbox3, hbox4, totalMessage);
        vbox.setAlignment(Pos.CENTER);
        
        // set the stage title
        primaryStage.setTitle("Joe's Automotive");  
        
        // create a scene with the vbox as its root node
        Scene scene = new Scene(vbox, 1000, 400);
        
        // add the scene to the stage
        primaryStage.setScene(scene);
        
        // show the window
        primaryStage.show();
    }
    
    // create an event handler to use for the calculate button that displays the total when the button is clicked
    class ButtonClickHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle (ActionEvent event)
        {
            totalMessage.setText(String.format("Your total is $%,.2f, Orlando Marin. Joe will be right with you!", totalCost));
        }
    }
} 
