package com.example.assignment_1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

/**
 * Controller between the GUI and rest of code
 */
public class PicrossController implements Initializable {

    @FXML
    private Label Label_2, Label_3, Label_4, Label_5, Label_6, Label_a, Label_b, Label_c, Label_d, Label_e;

    @FXML
    private Button B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, B22, B23, B24, B25;

    final String ON_COLOR = "-fx-background-color: black";
    final String OFF_COLOR = "-fx-background-color: white";

    @FXML
    /**
     * Selects a puzzle and shows the solution
     */
    protected void showSolution() {
        PicrossPuzzlePool puzzlePool = new PicrossPuzzlePool(Paths.get(".\\Data"));

        com.example.assignment_1.PicrossPuzzle puzzle1 = new com.example.assignment_1.PicrossPuzzle();
        String[] rowClues = puzzle1.getRowClues();
        String[] colClues = puzzle1.getColumnClues();
        System.out.println();
        System.out.println(puzzle1);

        //Prints the puzzle's solution to standard output for debugging purposes
        System.out.println("ROW CLUES: ");
        for(int i=0;i< rowClues.length;i++)
            System.out.print("\""+rowClues[i]+"\" ");
        System.out.println("\nCOLUMN CLUES: ");
        for(int i=0;i< colClues.length;i++)
            System.out.print("\""+colClues[i]+"\" ");
        System.out.println();

        //Place column clues on GUI
        Label_a.setText(colClues[0]+" ");
        Label_b.setText(colClues[1]+" ");
        Label_c.setText(colClues[2]+" ");
        Label_d.setText(colClues[3]+" ");
        Label_e.setText(colClues[4]+" ");

        //Place row clues on GUI
        Label_2.setText(rowClues[0]+" ");
        Label_3.setText(rowClues[1]+" ");
        Label_4.setText(rowClues[2]+" ");
        Label_5.setText(rowClues[3]+" ");
        Label_6.setText(rowClues[4]+" ");

        //Set buttons on the gridpane to either black or white
        //depending on the puzzle's solution array
        setButton(B1, puzzle1.getValue(0, 0));
        setButton(B2, puzzle1.getValue(0, 1));
        setButton(B3, puzzle1.getValue(0, 2));
        setButton(B4, puzzle1.getValue(0, 3));
        setButton(B5, puzzle1.getValue(0, 4));
        setButton(B6, puzzle1.getValue(1, 0));
        setButton(B7, puzzle1.getValue(1, 1));
        setButton(B8, puzzle1.getValue(1, 2));
        setButton(B9, puzzle1.getValue(1, 3));
        setButton(B10, puzzle1.getValue(1, 4));
        setButton(B11, puzzle1.getValue(2, 0));
        setButton(B12, puzzle1.getValue(2, 1));
        setButton(B13, puzzle1.getValue(2, 2));
        setButton(B14, puzzle1.getValue(2, 3));
        setButton(B15, puzzle1.getValue(2, 4));
        setButton(B16, puzzle1.getValue(3, 0));
        setButton(B17, puzzle1.getValue(3, 1));
        setButton(B18, puzzle1.getValue(3, 2));
        setButton(B19, puzzle1.getValue(3, 3));
        setButton(B20, puzzle1.getValue(3, 4));
        setButton(B21, puzzle1.getValue(4, 0));
        setButton(B22, puzzle1.getValue(4, 1));
        setButton(B23, puzzle1.getValue(4, 2));
        setButton(B24, puzzle1.getValue(4, 3));
        setButton(B25, puzzle1.getValue(4, 4));
    }

    /**
     * Changes the background color of a button (i.e., pixel on the puzzle)
     * @param b the button to change
     * @param value 0 == OFF, 1 == ON
     */
    public void setButton (Button b, int value) {
        b.setStyle(value==0 ? OFF_COLOR : ON_COLOR);
    }

    @Override
    /**
     * Acts as the start point for the Controller and shows a puzzle's solution
     */
    public void initialize (URL url, ResourceBundle rb) {
        showSolution();
    }



}