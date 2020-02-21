package com.github.obiwanlansi.internshipprojectexamples.kleineseinmaleins;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



/**
 *
 */
public final class KleinesEinmalEins extends Application {

    private static final int SIZE = 28;

    private static Label getHeaderLabel( final int iValue ) {

        final Label lHeaderLabel = new Label(String.format("%s ", iValue));
        lHeaderLabel.setBackground(new Background(new BackgroundFill(Color.GOLD, CornerRadii.EMPTY, Insets.EMPTY)));
        lHeaderLabel.setPrefWidth(SIZE);
        lHeaderLabel.setPrefHeight(SIZE);
        lHeaderLabel.setAlignment(Pos.CENTER_RIGHT);
        lHeaderLabel.setStyle("-fx-font-weight: bold;"); // Just A Little Bit Nasty With CSS :-)
        return lHeaderLabel;
    }


    @Override
    public void start( final Stage stage ) {

        final GridPane gp = new GridPane();
        gp.setHgap(4);
        gp.setVgap(4);
        gp.setAlignment(Pos.CENTER);

        for (int iMultiplikator = 1; iMultiplikator < 11; iMultiplikator++ ) {

            gp.add(getHeaderLabel(iMultiplikator), 0, iMultiplikator);
            gp.add(getHeaderLabel(iMultiplikator), iMultiplikator, 0);

            for (int iMultiplikand = 1; iMultiplikand < 11; iMultiplikand++ ) {

                final Label lResult = new Label(String.format("%s ", iMultiplikator * iMultiplikand));
                lResult.setPrefWidth(SIZE);
                lResult.setPrefHeight(SIZE);
                lResult.setAlignment(Pos.CENTER_RIGHT);
                lResult.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(2))));

                gp.add(lResult, iMultiplikator, iMultiplikand);
            }
        }

        final Scene scene = new Scene(gp, (SIZE + 4) * 11, (SIZE + 4) * 11);
        stage.initStyle(StageStyle.UTILITY);
        stage.setResizable(false);
        stage.setTitle("Kleines Einmal Eins");
        stage.setScene(scene);
        stage.show();
    }


    public static void main( final String[] args ) {

        launch(args);
    }

} // end public final class KleinesEinmalEins

