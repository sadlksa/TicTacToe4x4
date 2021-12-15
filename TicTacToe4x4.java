/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe4x4;
import java.util.ArrayList;
import java.util.Collection;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import static jdk.nashorn.internal.objects.Global.Infinity;

/**
 *
 * @author Anthony
 */
class Scores{
    int X=-10;
    int O=10;
    int Tie=0;
}
public class TicTacToe4x4 extends Application {
    
    @Override
    public void start(Stage primaryStage){
        GridPane root = new GridPane();
        Button b=new Button();
        Button b2=new Button();
        Button b3=new Button();
        Button b4=new Button();
        Button b5=new Button();
        Button b6=new Button();
        Button b7=new Button();
        Button b8=new Button();
        Button b9=new Button();
        Button b10=new Button();
        Button b11=new Button();
        Button b12=new Button();
        Button b13=new Button();
        Button b14=new Button();
        Button b15=new Button();
        Button b16=new Button();
        Scene scene = new Scene(root, 300, 250);
        b.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b.setId("b1");
        b2.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b2.setId("b2");
        b3.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b3.setId("b3");
        b4.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b4.setId("b4");
        b5.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b5.setId("b5");
        b6.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b6.setId("b6");
        b7.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b7.setId("b7");
        b8.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b8.setId("b8");
        b9.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b9.setId("b9");
        b10.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b10.setId("b10");
        b11.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b11.setId("b11");
        b12.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b12.setId("b12");
        b13.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b13.setId("b13");
        b14.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b14.setId("b14");
        b15.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b15.setId("b15");
        b16.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        b16.setId("b16");
        root.setStyle("-fx-focus-color: transparent;");
        root.add(b, 0, 0);
        root.add(b2, 1, 0);
        root.add(b3, 2, 0);
        root.add(b4, 3, 0);
        root.add(b5, 0, 1);
        root.add(b6, 1, 1);
        root.add(b7, 2, 1);
        root.add(b8, 3, 1);
        root.add(b9, 0, 2);
        root.add(b10, 1, 2);
        root.add(b11, 2, 2);
        root.add(b12, 3, 2);
        root.add(b13, 0, 3);
        root.add(b14, 1, 3);
        root.add(b15, 2, 3);
        root.add(b16, 3, 3);
        root.setGridLinesVisible(true);
        root.setId("g");
        int counter=1;
        b.setOnMouseClicked(e->{
    root.getChildren().remove(b);
    Label x1=new Label("X");
    x1.setId("x1");
    x1.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x1.setAlignment(Pos.CENTER);
        x1.setFont(new Font("Arial", 50));
    root.add(x1, 0, 0);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
        });
        b2.setOnMouseClicked(e->{
    root.getChildren().remove(b2);
    Label x2=new Label("X");
    x2.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
    x2.setId("x2");    
    x2.setAlignment(Pos.CENTER);
        x2.setFont(new Font("Arial", 50));
    root.add(x2, 1, 0);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b3.setOnMouseClicked(e->{
    root.getChildren().remove(b3);
    Label x3=new Label("X");
    x3.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x3.setAlignment(Pos.CENTER);
        x3.setId("x3");
        x3.setFont(new Font("Arial", 50));
    root.add(x3, 2, 0);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b4.setOnMouseClicked(e->{
    root.getChildren().remove(b4);
    Label x4=new Label("X");
    x4.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x4.setAlignment(Pos.CENTER);
        x4.setId("x4");
        x4.setFont(new Font("Arial", 50));
    root.add(x4, 3, 0);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b5.setOnMouseClicked(e->{
    root.getChildren().remove(b5);
    Label x5=new Label("X");
    x5.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x5.setAlignment(Pos.CENTER);
      x5.setId("x5");
        x5.setFont(new Font("Arial", 50));
    root.add(x5, 0, 1);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b6.setOnMouseClicked(e->{
    root.getChildren().remove(b6);
    Label x6=new Label("X");
    x6.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
    x6.setId("x6");   
    x6.setAlignment(Pos.CENTER);
        x6.setFont(new Font("Arial", 50));
    root.add(x6, 1, 1);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b7.setOnMouseClicked(e->{
    root.getChildren().remove(b7);
    Label x7=new Label("X");
    x7.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x7.setAlignment(Pos.CENTER);
        x7.setId("x7");
        x7.setFont(new Font("Arial", 50));
    root.add(x7, 2, 1);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b8.setOnMouseClicked(e->{
    root.getChildren().remove(b8);
    Label x8=new Label("X");
    x8.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x8.setAlignment(Pos.CENTER);
        x8.setId("x8");
        x8.setFont(new Font("Arial", 50));
    root.add(x8, 3, 1);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b9.setOnMouseClicked(e->{
    root.getChildren().remove(b9);
    Label x9=new Label("X");
    x9.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x9.setAlignment(Pos.CENTER);
        x9.setId("x9");
        x9.setFont(new Font("Arial", 50));
    root.add(x9, 0, 2);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b10.setOnMouseClicked(e->{
    root.getChildren().remove(b10);
    Label x10=new Label("X");
    x10.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x10.setAlignment(Pos.CENTER);
        x10.setId("x10");
        x10.setFont(new Font("Arial", 50));
    root.add(x10, 1, 2);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b11.setOnMouseClicked(e->{
    root.getChildren().remove(b11);
    Label x11=new Label("X");
    x11.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x11.setAlignment(Pos.CENTER);
        x11.setId("x11");
        x11.setFont(new Font("Arial", 50));
    root.add(x11, 2, 2);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b12.setOnMouseClicked(e->{
    root.getChildren().remove(b12);
    Label x12=new Label("X");
    x12.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x12.setAlignment(Pos.CENTER);
        x12.setId("x12");
        x12.setFont(new Font("Arial", 50));
    root.add(x12, 3, 2);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b13.setOnMouseClicked(e->{
    root.getChildren().remove(b13);
    Label x13=new Label("X");
    x13.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x13.setAlignment(Pos.CENTER);
        x13.setId("x13");
        x13.setFont(new Font("Arial", 50));
    root.add(x13, 0, 3);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b14.setOnMouseClicked(e->{
    root.getChildren().remove(b14);
    Label x14=new Label("X");
    x14.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x14.setAlignment(Pos.CENTER);
        x14.setId("x14");
        x14.setFont(new Font("Arial", 50));
    root.add(x14, 1, 3);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b15.setOnMouseClicked(e->{
    root.getChildren().remove(b15);
    Label x15=new Label("X");
    x15.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x15.setAlignment(Pos.CENTER);
        x15.setId("x15");
        x15.setFont(new Font("Arial", 50));
    root.add(x15, 2, 3);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        b16.setOnMouseClicked(e->{
    root.getChildren().remove(b16);
    Label x16=new Label("X");
    x16.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
        x16.setAlignment(Pos.CENTER);
        x16.setId("x16");
        x16.setFont(new Font("Arial", 50));
    root.add(x16, 3, 3);
    IsDraw(root);
    IsWinner(root);
    if(IsWinner(root)==null){
        AiTurn(root,scene,counter);
    }
    });
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public void IsDraw(Node root){
        if(root.lookup("#b1")==null && root.lookup("#b2")==null && root.lookup("#b3")==null && root.lookup("#b4")==null && root.lookup("#b5")==null && root.lookup("#b6")==null && root.lookup("#b7")==null && root.lookup("#b8")==null && root.lookup("#b9")==null && root.lookup("#b10")==null && root.lookup("#b11")==null && root.lookup("#b12")==null && root.lookup("#b13")==null && root.lookup("#b14")==null && root.lookup("#b15")==null && root.lookup("#b16")==null)
            if(IsWinner(root)==null){
            Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Draw!");
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
            }
    }
    String IsWinner(Node root){
        Label x1=(Label) root.lookup("#x1");
        Label x2=(Label) root.lookup("#x2");
        Label x3=(Label) root.lookup("#x3");
        Label x4=(Label) root.lookup("#x4");
        Label x5=(Label) root.lookup("#x5");
        Label x6=(Label) root.lookup("#x6");
        Label x7=(Label) root.lookup("#x7");
        Label x8=(Label) root.lookup("#x8");
        Label x9=(Label) root.lookup("#x9");
        Label x10=(Label) root.lookup("#x10");
        Label x11=(Label) root.lookup("#x11");
        Label x12=(Label) root.lookup("#x12");
        Label x13=(Label) root.lookup("#x13");
        Label x14=(Label) root.lookup("#x14");
        Label x15=(Label) root.lookup("#x15");
        Label x16=(Label) root.lookup("#x16");
        if(root.lookup("#x1")!=null && root.lookup("#x2")!=null && root.lookup("#x3")!=null && root.lookup("#x4")!=null){
            if(x1.getText()==x2.getText() && x2.getText()==x3.getText() && x2.getText()==x4.getText()){
                System.out.println("Winner Is "+x1.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x1.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x1.getText();
            }
        }
        if(root.lookup("#x1")!=null && root.lookup("#x5")!=null && root.lookup("#x9")!=null && root.lookup("#x13")!=null){
            if(x1.getText()==x5.getText() && x5.getText()==x9.getText() && x5.getText()==x13.getText()){
                System.out.println("Winner Is "+x1.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x1.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x1.getText();
            }
        }
        if(root.lookup("#x1")!=null && root.lookup("#x6")!=null && root.lookup("#x11")!=null && root.lookup("#x16")!=null){
            if(x1.getText()==x6.getText() && x6.getText()==x11.getText() && x6.getText()==x16.getText()){
                System.out.println("Winner Is "+x1.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x1.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x1.getText();
            }
        }
        if(root.lookup("#x4")!=null && root.lookup("#x7")!=null && root.lookup("#x10")!=null && root.lookup("#x13")!=null){
            if(x4.getText()==x7.getText() && x7.getText()==x10.getText()  && x7.getText()==x13.getText()){
                System.out.println("Winner Is "+x4.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x4.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x4.getText();
            }
        }
        if(root.lookup("#x5")!=null && root.lookup("#x6")!=null && root.lookup("#x7")!=null  && root.lookup("#x8")!=null){
            if(x5.getText()==x6.getText() && x6.getText()==x7.getText() && x6.getText()==x8.getText()){
                System.out.println("Winner Is "+x5.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x5.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x5.getText();
            }
        }
        if(root.lookup("#x9")!=null && root.lookup("#x10")!=null && root.lookup("#x11")!=null && root.lookup("#x12")!=null){
            if(x9.getText()==x10.getText() && x10.getText()==x11.getText()  && x10.getText()==x12.getText()){
                System.out.println("Winner Is "+x9.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x9.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x9.getText();
            }
        }
        if(root.lookup("#x13")!=null && root.lookup("#x14")!=null && root.lookup("#x15")!=null && root.lookup("#x16")!=null){
            if(x13.getText()==x14.getText() && x14.getText()==x15.getText()  && x14.getText()==x16.getText()){
                System.out.println("Winner Is "+x13.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x13.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x13.getText();
            }
        }
        if(root.lookup("#x2")!=null && root.lookup("#x6")!=null && root.lookup("#x10")!=null && root.lookup("#x14")!=null){
            if(x2.getText()==x6.getText() && x6.getText()==x10.getText() && x6.getText()==x14.getText()){
                System.out.println("Winner Is "+x2.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x2.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x2.getText();
            }
        }
        if(root.lookup("#x3")!=null && root.lookup("#x7")!=null && root.lookup("#x11")!=null && root.lookup("#x15")!=null){
            if(x3.getText()==x7.getText() && x7.getText()==x11.getText() && x7.getText()==x15.getText()){
                System.out.println("Winner Is "+x3.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x3.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x3.getText();
            }
        }
        if(root.lookup("#x4")!=null && root.lookup("#x8")!=null && root.lookup("#x12")!=null && root.lookup("#x16")!=null){
            if(x4.getText()==x8.getText() && x8.getText()==x12.getText() && x8.getText()==x16.getText()){
                System.out.println("Winner Is "+x4.getText());
                Alert a = new Alert(AlertType.INFORMATION);
                a.setTitle("Game Ended");
                a.setContentText("Winner Is "+x4.getText());
                a.setOnCloseRequest(e->{
                System.exit(0);
                });
                a.showAndWait();
                return x4.getText();
            }
        }
        return null;
    }
    public void AiTurn(Node root,Scene scene,int IsRandom){
        GridPane g=(GridPane) root.lookup("#g");
        String[][] BoardState=new String[4][4];
        int count=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(root.lookup("#x"+count)!=null){
                    Label txt=(Label) root.lookup("#x"+count);
                    if(txt.getText()=="X"){
                        BoardState[i][j]="X";
                    }
                    else{
                        BoardState[i][j]="O";
                    }
                }
                else{
                    BoardState[i][j]=" ";
                }
                    count++;
            }
        }
        int[] IdealMove;
        ArrayList<Node> Buttons=new ArrayList<Node>();
        for(int i=1;i<17;i++){
        Buttons.add(root.lookup("#b"+i));
        }
        int lengthOfButtons=0;
        for(Node Button : Buttons){
            if(Button!=null){
                lengthOfButtons++;
            }
        }
        if(lengthOfButtons>12){
            System.out.println("Random Move");
            IdealMove=RandomMove(BoardState,root);
        }
        else{
            System.out.println("AI Move");
            IdealMove=BestMove(BoardState,root);
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==IdealMove[0] && j==IdealMove[1]){
        BoardState[i][j]="O";
                }
            System.out.print(BoardState[i][j]+" | ");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(BoardState[i][j]=="O"){
                    if(i==0 && j==0){
                    g.getChildren().remove(root.lookup("#b1"));
                    Label x1=new Label("O");
                    x1.setId("x1");
                    x1.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                        x1.setAlignment(Pos.CENTER);
                        x1.setFont(new Font("Arial", 50));
                    g.add(x1, 0, 0);
                    IsDraw(root);
                    IsWinner(root);  
                    }
                    if(i==0 && j==1){
                        g.getChildren().remove(root.lookup("#b2"));
                        Label x2=new Label("O");
                        x2.setId("x2");
                        x2.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                            x2.setAlignment(Pos.CENTER);
                            x2.setFont(new Font("Arial", 50));
                        g.add(x2, 1, 0);
                        IsDraw(root);
                        IsWinner(root);
                    }
                    if(i==0 && j==2){
                        g.getChildren().remove(root.lookup("#b3"));
                        Label x3=new Label("O");
                        x3.setId("x3");
                        x3.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                            x3.setAlignment(Pos.CENTER);
                            x3.setFont(new Font("Arial", 50));
                        g.add(x3, 2, 0);
                        IsDraw(root);
                        IsWinner(root);
                    }
                    if(i==0 && j==3){
                        g.getChildren().remove(root.lookup("#b4"));
                        Label x4=new Label("O");
                        x4.setId("x4");
                        x4.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                            x4.setAlignment(Pos.CENTER);
                            x4.setFont(new Font("Arial", 50));
                        g.add(x4, 3, 0);
                        IsDraw(root);
                        IsWinner(root);
                    }
                    if(i==1 && j==0){
                        g.getChildren().remove(root.lookup("#b5"));
                        Label x5=new Label("O");
                        x5.setId("x5");
                        x5.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                            x5.setAlignment(Pos.CENTER);
                            x5.setFont(new Font("Arial", 50));
                        g.add(x5, 0, 1);
                        IsDraw(root);
                        IsWinner(root);
                    }
                    if(i==1 && j==1){
                        g.getChildren().remove(root.lookup("#b6"));
                        Label x6=new Label("O");
                        x6.setId("x6");
                        x6.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                            x6.setAlignment(Pos.CENTER);
                            x6.setFont(new Font("Arial", 50));
                        g.add(x6, 1,1);
                        IsDraw(root);
                        IsWinner(root);
                    }
                    if(i==1 && j==2){
                    g.getChildren().remove(root.lookup("#b7"));
                    Label x7=new Label("O");
                    x7.setId("x7");
                    x7.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                        x7.setAlignment(Pos.CENTER);
                        x7.setFont(new Font("Arial", 50));
                    g.add(x7, 2, 1);
                    IsDraw(root);
                    IsWinner(root);    
                    }
                    if(i==1 && j==3){
                    g.getChildren().remove(root.lookup("#b8"));
                    Label x8=new Label("O");
                    x8.setId("x8");
                    x8.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                        x8.setAlignment(Pos.CENTER);
                        x8.setFont(new Font("Arial", 50));
                    g.add(x8, 3, 1);
                    IsDraw(root);
                    IsWinner(root);    
                    }
                    if(i==2 && j==0){
                    g.getChildren().remove(root.lookup("#b9"));
                    Label x9=new Label("O");
                    x9.setId("x9");
                    x9.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                        x9.setAlignment(Pos.CENTER);
                        x9.setFont(new Font("Arial", 50));
                    g.add(x9, 0, 2);
                    IsDraw(root);
                    IsWinner(root);
                    }
                    if(i==2 && j==1){
                    g.getChildren().remove(root.lookup("#b10"));
                    Label x10=new Label("O");
                    x10.setId("x10");
                    x10.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                        x10.setAlignment(Pos.CENTER);
                        x10.setFont(new Font("Arial", 50));
                    g.add(x10, 1, 2);
                    IsDraw(root);
                    IsWinner(root);
                    }
                    if(i==2 && j==2){
                    g.getChildren().remove(root.lookup("#b11"));
                    Label x11=new Label("O");
                    x11.setId("x11");
                    x11.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                        x11.setAlignment(Pos.CENTER);
                        x11.setFont(new Font("Arial", 50));
                    g.add(x11, 2, 2);
                    IsDraw(root);
                    IsWinner(root);
                    }
                    if(i==2 && j==3){
                    g.getChildren().remove(root.lookup("#b12"));
                    Label x12=new Label("O");
                    x12.setId("x12");
                    x12.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                        x12.setAlignment(Pos.CENTER);
                        x12.setFont(new Font("Arial", 50));
                    g.add(x12, 3, 2);
                    IsDraw(root);
                    IsWinner(root);
                    }
                    if(i==3 && j==0){
                    g.getChildren().remove(root.lookup("#b13"));
                    Label x13=new Label("O");
                    x13.setId("x13");
                    x13.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                        x13.setAlignment(Pos.CENTER);
                        x13.setFont(new Font("Arial", 50));
                    g.add(x13, 0, 3);
                    IsDraw(root);
                    IsWinner(root);
                    }
                    if(i==3 && j==1){
                    g.getChildren().remove(root.lookup("#b14"));
                    Label x14=new Label("O");
                    x14.setId("x14");
                    x14.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                        x14.setAlignment(Pos.CENTER);
                        x14.setFont(new Font("Arial", 50));
                    g.add(x14, 1, 3);
                    IsDraw(root);
                    IsWinner(root);
                    }
                    if(i==3 && j==2){
                    g.getChildren().remove(root.lookup("#b15"));
                    Label x15=new Label("O");
                    x15.setId("x15");
                    x15.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                        x15.setAlignment(Pos.CENTER);
                        x15.setFont(new Font("Arial", 50));
                    g.add(x15, 2, 3);
                    IsDraw(root);
                    IsWinner(root);
                    }
                    if(i==3 && j==3){
                    g.getChildren().remove(root.lookup("#b16"));
                    Label x16=new Label("O");
                    x16.setId("x16");
                    x16.setPrefSize(scene.getWidth()/4, scene.getHeight()/4);
                        x16.setAlignment(Pos.CENTER);
                        x16.setFont(new Font("Arial", 50));
                    g.add(x16, 3, 3);
                    IsDraw(root);
                    IsWinner(root);
                    }
                }
            }
        }
    }
    int[] RandomMove(String[][] Board,Node root){
        int move[]=new int[2];
        for(;;){
        int x=(int) ((Math.random() * (3 - 0)) + 0);
        int y=(int) ((Math.random() * (3 - 0)) + 0);
        if(Board[x][y]==" "){
            move[0]=x;
            move[1]=y;
            System.out.println(x+" "+y);
            break;
        }
        }
        return move;
    }
    int[] BestMove(String[][] Board,Node root){
        int BestScore=(int)-Infinity;
        int[] Move=new int[2];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(" "==Board[i][j]){
                    Board[i][j]="O";
            int Score=MinMax(Board,root,false,0);
            Board[i][j]=" ";
            if(Score==10){
                Move[0]=i;
                Move[1]=j;
                return Move;
            }
            if(Score>BestScore){
                BestScore=Score;
                Move[0]=i;
                Move[1]=j;
            }
                }
            }
        }
        return Move;
    }
    int MinMax(String[][] Board,Node root,Boolean IsMaximizing,int depth){
        String result=checkWinner(Board);
        if(result!=null){
            Scores s=new Scores();
            switch (result) {
                case "X":
                    return s.X;
                case "O":
                    return s.O;
                case "tie":
                    return s.Tie;
            }
        }
        int bestScore;
        if(IsMaximizing){
            bestScore=(int)-Infinity;
            for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(" "==Board[i][j]){
                    Board[i][j]="O";
            int Score=MinMax(Board,root,false,depth+1);
            
            Board[i][j]=" ";
            if(Score==10){
                return Score;
            }
            bestScore=Integer.max(bestScore, Score);
                }
            }
            }
            return bestScore;
        }
        else{
            bestScore=(int)Infinity;
            for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(" "==Board[i][j]){
                    Board[i][j]="X";
            int Score=MinMax(Board,root,true,depth+1);
            
            Board[i][j]=" ";
            if(Score==-10){
                return Score;
            }
            bestScore=Integer.min(bestScore, Score);
                }
            }
            }
            
    }
   return bestScore;
}
    String checkWinner(String[][] Board){
        String Winner="";
        for (int i = 0; i < 4; i++) {
    if(Board[i][0]==Board[i][1] && Board[i][1]==Board[i][2] && Board[i][2]==Board[i][3]) {
      Winner = Board[i][0];
    }
  }
        for (int j = 0; j < 4; j++) {
    if(Board[0][j]==Board[1][j] && Board[0][j]==Board[2][j] && Board[0][j]==Board[3][j]) {
      Winner = Board[0][j];
    }
  }
        if (Board[0][0]==Board[1][1] && Board[1][1]==Board[2][2] && Board[1][1]==Board[3][3]) {
    Winner = Board[0][0];
  }
  if (Board[3][0]==Board[2][1] && Board[2][1]==Board[1][2] && Board[2][1]==Board[0][3]) {
    Winner = Board[3][0];
  }
  int openSpots = 0;
  for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
      if (Board[i][j]==" ") {
        openSpots++;
      }
    }
  }
        if(Winner=="" && openSpots==0){
            return "tie";
        }
        else{
            return Winner;
        }
    }
}

