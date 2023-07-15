package com.example.diyashop.controller;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class SearchBar extends Application {
    private List<String> words;
    private ObservableList<String> suggestions;
    private ListView<String> suggestionListView;
    private TextField searchField;

    public SearchBar() {
        // Initialize the dataset
        words = new ArrayList<>();
        words.add("dictionary");
        words.add("dinosaur");
        words.add("digital");
        words.add("disco");
        words.add("dog");
        words.add("cat");
        words.add("desk");
        words.add("door");

        // Create ObservableList for suggestions
        suggestions = FXCollections.observableArrayList();

        // Create ListView for displaying suggestions
        suggestionListView = new ListView<>(suggestions);

        // Create TextField for search input
        searchField = new TextField();
        searchField.setPromptText("Search...");

        // Add listener to update suggestions on search input change
        searchField.textProperty().addListener((observable, oldValue, newValue) -> updateSuggestions(newValue));
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);
        root.getChildren().addAll(searchField, suggestionListView);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Search Bar Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateSuggestions(String userInput) {
        suggestions.clear();

        for (String word : words) {
            if (word.toLowerCase().startsWith(userInput.toLowerCase())) {
                suggestions.add(word);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}