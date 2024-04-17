import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.io.*;


class Point {

    //Fields
    private int x;
    private int y;
    private boolean empty;

    //Constructors
    public Point() {}

    public Point(int x, int y, boolean empty) {
        this.x = x;
        this.y = y;
        this.empty = empty;
    }

    //Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //Methods
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
    public void translate(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public String toString() {
        return x + ", " + y;
    }

    public boolean isEmpty() {
        return empty;
    }
}

public class Graph {

    //Dimensions
    public static final int WIDTH = 515;
    public static final int HEIGHT = 600;
    public static final int Y_SHIFT = 30;
    public static final int X_AXIS = HEIGHT/2 - Y_SHIFT;
    public static final int Y_AXIS = WIDTH/2;
    public static final int DOT_SIZE = 8;
    
   
    //Coloring
    public static final Color LINE_COLOR = new Color(0, 0, 128);
    public static final Color BACKGROUND_COLOR = Color.WHITE;
    public static final Color POINT_COLOR = Color.BLUE;

    //Points
    public static ArrayList<Point> points;

    //Components
    public static JFrame saveFrame;
    public static JTextField fileNameField;

    public static void main(String[] args) {

        points = new ArrayList<Point>();

        // Create a new JFrame container
        JFrame frame = new JFrame("Save My Points!");

        //Initialize Save Frame
        saveFrameInit();

        // Set the size of the frame
        frame.setSize(WIDTH, HEIGHT);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Disable window resizing
        frame.setResizable(false);

        // Create a JPanel to serve as the content pane
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(LINE_COLOR);
                drawAxes(g);
                drawTickMarks(g);
                drawPoints(g); 
            }
        };
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setBackground(BACKGROUND_COLOR);

        // Create the top panel with three buttons
        JPanel topPanel = new JPanel();
        
        // Create the labels
        JLabel labelX = new JLabel("X:");
        JLabel labelY = new JLabel("Y:");

        // Create the text fields
        JTextField textFieldX = new JTextField(3);
        JTextField textFieldY = new JTextField(3);

        // Create the add point button
        JButton addPoint = new JButton("Add Point");

        //-----------------------------------------------------------------------------------
        //create the add EMPTY point button
        JButton addEmptyPoint = new JButton("Add Empty Point");
        //-----------------------------------------------------------------------------------

        // Create save to database button
        JButton save = new JButton("Save");

        // Add the labels, text fields, and button to the top panel
        topPanel.add(addPoint);
        topPanel.add(addEmptyPoint);
        topPanel.add(labelX);
        topPanel.add(textFieldX);
        topPanel.add(labelY);
        topPanel.add(textFieldY);
        topPanel.add(Box.createRigidArea(new Dimension(80, 0)));
        topPanel.add(save);

        // Set the layout of the frame to BorderLayout
        frame.setLayout(new BorderLayout());

        // Add the top panel to the frame's north position
        frame.add(topPanel, BorderLayout.NORTH);

        // Add the bottom panel to the frame's center position
        frame.add(panel, BorderLayout.CENTER);

        // Add action listener to the button
        addPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get x and y
                int x = Integer.parseInt(textFieldX.getText());
                int y = Integer.parseInt(textFieldY.getText());
                Point p = new Point(x,y,false);
                points.add(p);
                textFieldX.setText("");
                textFieldY.setText("");
                panel.repaint();
            }
        });

        addEmptyPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get x and y
                int x = Integer.parseInt(textFieldX.getText());
                int y = Integer.parseInt(textFieldY.getText());
                Point p = new Point(x,y,true);
                points.add(p);
                textFieldX.setText("");
                textFieldY.setText("");
                panel.repaint();
            }
        });

        // Add action listener to the button
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Create a new JFrame for pop up
                saveFrame.setVisible(true);

            }
        });

        // Make the frame visible
        frame.setVisible(true);      
        
    }

    //Makes and returns Pop Up save option frame
    public static void saveFrameInit() {
        // Create a new JFrame for pop up
        saveFrame = new JFrame("Enter Filename");
        saveFrame.setSize(400, 150);
        saveFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //User entry file name
        fileNameField = new JTextField(10);
        //fileNameField.setText("Enter File Name");
        //fileNameField.setForeground(Color.GRAY);
        JButton browseButton = new JButton("Choose folder...");

        fileNameField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Clear the text and set the foreground color to black when the field gains focus
                if (fileNameField.getText().equals("Enter filename...")) {
                    fileNameField.setText("");
                    fileNameField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Restore the default text and gray foreground color when the field loses focus without any input
                if (fileNameField.getText().isEmpty()) {
                    fileNameField.setText("Enter text here...");
                    fileNameField.setForeground(Color.GRAY);
                }
            }
        });

        // Choose location to save data
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        // Add action listener to the browse button
        browseButton.addActionListener(new ActionListener() {
        
            @Override
            public void actionPerformed(ActionEvent e){
                int choice = fileChooser.showOpenDialog(saveFrame);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    File selectedFolder = fileChooser.getSelectedFile();
                    String folderPath = selectedFolder.getAbsolutePath();
                    System.out.println("Selected folder: " + folderPath);
                    String fileName = folderPath + "/" + fileNameField.getText();
                    writePointsToFile(fileName);
                    fileNameField.setText("Enter File Name");
                    saveFrame.setVisible(false);
                }
            }
        });


        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.add(fileNameField);
        panel.add(browseButton);

        // Add the panel to the content pane of the second frame
        saveFrame.getContentPane().add(panel);

        // Set the layout of the second frame to flow layout
        saveFrame.setLayout(new FlowLayout());
    
    }

    //---------------------------------------------------------------------------------------------
    //Method to draw points that user has added to array list
    public static void drawPoints(Graphics g) {
        g.setColor(POINT_COLOR);
        for (Point p : points) {
            int x = (int)(p.getX()*2.5 + Y_AXIS - 4);
            int y = (int)(p.getY()*-2.5+X_AXIS - 4);
            if(p.isEmpty()) {
                g.drawOval(x, y, DOT_SIZE, DOT_SIZE);
            } else { g.fillOval(x, y, DOT_SIZE, DOT_SIZE); }
        }
    }
    //--------------------------------------------------------------------------------------------

    //Save the user points to a file, write each point on one line
    //Using the Point toString method
    public static void writePointsToFile(String fileName) {
        try {
            PrintWriter printer = new PrintWriter(fileName);
            for(Point p : points) {
                printer.println(p);
            }
            printer.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    // Method to draw the x and y axes
    public static void drawAxes(Graphics g) {
        g.drawLine(0, X_AXIS, WIDTH, X_AXIS); // x-axis
        g.drawLine(Y_AXIS, 0, Y_AXIS, HEIGHT); // y-axis
    }

    // Method to draw tick marks on the axes
    public static void drawTickMarks(Graphics g) {
        Font tickLabelFont = new Font("Arial", Font.PLAIN, 8);
        g.setFont(tickLabelFont);

        //Init tick mark dimensions
        int tickSpacing = 50;
        int tickNumIncrement = 20;
        int tickHeight = 5;
        int labelOffset = 4;
        int labelXPos = Y_AXIS + 10;
        int labelYPos = X_AXIS + 20;

        // Draw tick marks and labels on the x-axis
        int value = tickNumIncrement;
        int count = 1;
        int tickTop = X_AXIS + tickHeight;
        int tickBottom = X_AXIS - tickHeight;
        int rightLocation = tickLocationIncrease(count, Y_AXIS, tickSpacing);
        int leftLocation = tickLocationDecrease(count, Y_AXIS, tickSpacing);
        while(rightLocation < WIDTH) {
            //draw above zero
            g.drawLine(rightLocation, tickTop, rightLocation, tickBottom);
            g.drawString(Integer.toString(value), rightLocation - labelOffset, labelYPos);

            //draw below zero
            g.drawLine(leftLocation, tickTop, leftLocation, tickBottom);
            g.drawString(Integer.toString(value*-1), leftLocation - labelOffset, labelYPos);

            count++;
            value += tickNumIncrement;
            rightLocation = tickLocationIncrease(count, Y_AXIS, tickSpacing);
            leftLocation = tickLocationDecrease(count, Y_AXIS, tickSpacing);
        }

        // Draw tick marks and labels on the y-axis
        value = tickNumIncrement;
        count = 1;
        int tickLeft = Y_AXIS + tickHeight;
        int tickRight = Y_AXIS - tickHeight;
        int topLocation = tickLocationDecrease(count, X_AXIS, tickSpacing);
        int bottomLocation = tickLocationIncrease(count, X_AXIS, tickSpacing);
        while(bottomLocation < HEIGHT) {
            //draw top ticks
            g.drawLine(tickLeft, topLocation, tickRight, topLocation);
            g.drawString(Integer.toString(value), labelXPos, topLocation + labelOffset);

            //draw bottom ticks
            g.drawLine(tickLeft, bottomLocation, tickRight, bottomLocation);
            g.drawString(Integer.toString(value*-1), labelXPos, bottomLocation + labelOffset);

            count++;
            value += tickNumIncrement;
            topLocation = tickLocationDecrease(count, X_AXIS, tickSpacing);
            bottomLocation = tickLocationIncrease(count, X_AXIS, tickSpacing);
        }        

    }
  
    public static int tickLocationIncrease(int count, int mid, int space) {
        return mid + count*space;
    }

    public static int tickLocationDecrease(int count, int mid, int space) {
        return mid - count*space;
    }
}
