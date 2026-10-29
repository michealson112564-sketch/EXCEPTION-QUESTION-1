
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class SDG_POSTER extends Application {

    @Override
    public void start(Stage stage) {

        // ---------------- HEADER ----------------

        Label goal = new Label("SUSTAINABLE DEVELOPMENT GOAL");
        goal.setStyle(
                "-fx-font-size: 14px;" +
                        "-fx-text-fill: white;"
        );

        Label title = new Label("GOAL 9");
        title.setStyle(
                "-fx-font-size: 38px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: white;"
        );

        Label subtitle = new Label(
                "INDUSTRY • INNOVATION • INFRASTRUCTURE"
        );
        subtitle.setStyle(
                "-fx-font-size: 20px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: white;"
        );

        VBox heading = new VBox(5, goal, title, subtitle);

        // ---------------- IMAGE ----------------

        ImageView imageView;

        try {
            Image image = new Image(
                    getClass().getResourceAsStream("sdg9.jpg")
            );

            imageView = new ImageView(image);
            imageView.setFitWidth(230);
            imageView.setFitHeight(140);
            imageView.setPreserveRatio(false);

        } catch (Exception e) {

            // If image is not found
            imageView = new ImageView();
        }

        // Header layout
        HBox header = new HBox(30, heading, imageView);
        header.setAlignment(Pos.CENTER_LEFT);
        header.setPadding(new Insets(20));

        header.setStyle(
                "-fx-background-color: #F58220;"
        );

        // ---------------- DESCRIPTION ----------------

        Label descriptionTitle = new Label(
                "BUILD THE FUTURE"
        );

        descriptionTitle.setStyle(
                "-fx-font-size: 22px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: #F58220;"
        );

        Label description = new Label(
                "Build resilient infrastructure, promote inclusive and\n" +
                        "sustainable industrialization, and foster innovation."
        );

        description.setStyle(
                "-fx-font-size: 15px;" +
                        "-fx-text-fill: #333333;"
        );

        VBox descriptionBox = new VBox(
                8,
                descriptionTitle,
                description
        );

        descriptionBox.setPadding(new Insets(15));

        descriptionBox.setStyle(
                "-fx-background-color: white;" +
                        "-fx-border-color: #E0E0E0;" +
                        "-fx-border-radius: 8;" +
                        "-fx-background-radius: 8;"
        );

        // ---------------- CARDS ----------------

        Label industry = new Label("🏭\nINDUSTRY");
        industry.setStyle(
                "-fx-font-size: 17px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-alignment: center;"
        );

        Label industryText = new Label(
                "Promote sustainable and inclusive industrial development."
        );
        industryText.setWrapText(true);

        VBox industryCard = new VBox(10, industry, industryText);
        industryCard.setAlignment(Pos.CENTER);
        industryCard.setPadding(new Insets(15));
        industryCard.setPrefWidth(190);

        industryCard.setStyle(
                "-fx-background-color: #FFF3E8;" +
                        "-fx-border-color: #F58220;" +
                        "-fx-border-radius: 10;" +
                        "-fx-background-radius: 10;"
        );

        // Innovation card
        Label innovation = new Label("💡\nINNOVATION");
        innovation.setStyle(
                "-fx-font-size: 17px;" +
                        "-fx-font-weight: bold;"
        );

        Label innovationText = new Label(
                "Encourage research, technology and creative solutions."
        );
        innovationText.setWrapText(true);

        VBox innovationCard = new VBox(
                10,
                innovation,
                innovationText
        );

        innovationCard.setAlignment(Pos.CENTER);
        innovationCard.setPadding(new Insets(15));
        innovationCard.setPrefWidth(190);

        innovationCard.setStyle(
                "-fx-background-color: #FFF3E8;" +
                        "-fx-border-color: #F58220;" +
                        "-fx-border-radius: 10;" +
                        "-fx-background-radius: 10;"
        );

        // Infrastructure card
        Label infrastructure = new Label("🌐\nINFRASTRUCTURE");
        infrastructure.setStyle(
                "-fx-font-size: 17px;" +
                        "-fx-font-weight: bold;"
        );

        Label infrastructureText = new Label(
                "Develop reliable, sustainable and resilient infrastructure."
        );
        infrastructureText.setWrapText(true);

        VBox infrastructureCard = new VBox(
                10,
                infrastructure,
                infrastructureText
        );

        infrastructureCard.setAlignment(Pos.CENTER);
        infrastructureCard.setPadding(new Insets(15));
        infrastructureCard.setPrefWidth(190);

        infrastructureCard.setStyle(
                "-fx-background-color: #FFF3E8;" +
                        "-fx-border-color: #F58220;" +
                        "-fx-border-radius: 10;" +
                        "-fx-background-radius: 10;"
        );

        HBox cards = new HBox(
                20,
                industryCard,
                innovationCard,
                infrastructureCard
        );

        cards.setAlignment(Pos.CENTER);

        // ---------------- PROGRESS SECTION ----------------

        Label progressTitle = new Label(
                "BUILDING A BETTER FUTURE"
        );

        progressTitle.setStyle(
                "-fx-font-size: 16px;" +
                        "-fx-font-weight: bold;"
        );

        ProgressBar progress = new ProgressBar(0.75);
        progress.setPrefWidth(400);

        Label progressText = new Label(
                "Innovation • Infrastructure • Sustainable Growth"
        );

        VBox progressBox = new VBox(
                8,
                progressTitle,
                progress,
                progressText
        );

        progressBox.setAlignment(Pos.CENTER);

        // ---------------- USER CONTROLS ----------------

        Label actionLabel = new Label(
                "How can you support innovation?"
        );

        actionLabel.setStyle(
                "-fx-font-size: 16px;" +
                        "-fx-font-weight: bold;"
        );

        ComboBox<String> choice = new ComboBox<>();

        choice.getItems().addAll(
                "Learn new technology",
                "Support innovation",
                "Promote sustainability",
                "Improve infrastructure"
        );

        choice.setPromptText("Choose an action");

        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");
        nameField.setPrefWidth(200);

        CheckBox agree = new CheckBox(
                "I support sustainable innovation"
        );

        Button button = new Button("TAKE ACTION");

        button.setStyle(
                "-fx-background-color: #F58220;" +
                        "-fx-text-fill: white;" +
                        "-fx-font-weight: bold;" +
                        "-fx-padding: 10 20 10 20;" +
                        "-fx-background-radius: 6;"
        );

        button.setOnMouseEntered(e ->
                button.setStyle(
                        "-fx-background-color: #D96F10;" +
                                "-fx-text-fill: white;" +
                                "-fx-font-weight: bold;" +
                                "-fx-padding: 10 20 10 20;" +
                                "-fx-background-radius: 6;"
                )
        );

        button.setOnMouseExited(e ->
                button.setStyle(
                        "-fx-background-color: #F58220;" +
                                "-fx-text-fill: white;" +
                                "-fx-font-weight: bold;" +
                                "-fx-padding: 10 20 10 20;" +
                                "-fx-background-radius: 6;"
                )
        );

        HBox controls = new HBox(
                10,
                nameField,
                choice,
                agree,
                button
        );

        controls.setAlignment(Pos.CENTER);

        // ---------------- FOOTER ----------------

        Label footer = new Label(
                "INNOVATE  •  BUILD  •  CONNECT  •  SUSTAIN"
        );

        footer.setStyle(
                "-fx-font-size: 14px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: white;"
        );

        HBox footerBox = new HBox(footer);
        footerBox.setAlignment(Pos.CENTER);
        footerBox.setPadding(new Insets(15));

        footerBox.setStyle(
                "-fx-background-color: #333333;"
        );

        // ---------------- MAIN CONTENT ----------------

        VBox content = new VBox(
                18,
                descriptionBox,
                cards,
                progressBox,
                new Separator(),
                actionLabel,
                controls
        );

        content.setAlignment(Pos.CENTER);
        content.setPadding(new Insets(20));

        // ---------------- BORDERPANE ----------------

        BorderPane root = new BorderPane();

        root.setTop(header);
        root.setCenter(content);
        root.setBottom(footerBox);

        root.setStyle(
                "-fx-background-color: #F7F7F7;"
        );

        // ---------------- SCENE ----------------

        Scene scene = new Scene(root, 950, 700);

        stage.setTitle(
                "SDG Goal 9 - Industry, Innovation and Infrastructure"
        );

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}