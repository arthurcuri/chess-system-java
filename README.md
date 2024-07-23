# Chess System in Java

![Chess Board](https://via.placeholder.com/728x90.png?text=Chess+System+in+Java)

## Description

This repository contains the implementation of a chess system in Java, developed as part of a Udemy course. The system includes all the essential functionalities for playing a complete game of chess, including move validation, check detection, and special moves such as castling and en passant.

## Features

- **Complete Chess Game**: Play a full game of chess against another player.
- **Move Validation**: Ensure all moves are legal according to the rules of chess.
- **Special Moves**: Support for castling, en passant, and pawn promotion.
- **Check Detection**: Identify when a king is in check.
- **Graphical Interface**: Simple command-line interface for easy interaction.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor of your choice

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/arthurcuri/chess-system-java.git
    ```

2. Navigate to the project directory:

    ```bash
    cd chess-system-java
    ```

3. Compile the Java files:

    ```bash
    javac application/*.java boardgame/*.java chess/*.java chess/pieces/*.java
    ```

4. Run the application:

    ```bash
    java application/Program
    ```

## Usage

After running the application, you will be greeted with a command-line interface where you can input moves using standard chess notation (e.g., e2e4 for moving a piece from e2 to e4). The board will be displayed after each move.

## Project Structure

- `application/`: Contains the main application classes.
  - `Program.java`: Entry point of the application.
  - `UI.java`: User interface class for displaying the board and handling user input.

- `boardgame/`: Contains the classes related to the general board game structure.
  - `Board.java`: Represents the chess board.
  - `BoardException.java`: Handles exceptions related to the board.
  - `Piece.java`: Abstract class for pieces on the board.
  - `Position.java`: Represents a position on the board.

- `chess/`: Contains the classes specific to chess.
  - `ChessException.java`: Handles exceptions specific to chess.
  - `ChessMatch.java`: Manages the chess match, including the state of the game and the rules.
  - `ChessPiece.java`: Represents a chess piece.
  - `ChessPosition.java`: Represents a position on the chess board.
  - `Color.java`: Enum for piece colors (e.g., WHITE, BLACK).

  - `pieces/`: Contains classes for each type of chess piece.
    - `Bishop.java`
    - `King.java`
    - `Knight.java`
    - `Pawn.java`
    - `Queen.java`
    - `Rook.java`

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests for any improvements or bug fixes.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a pull request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

Arthur Curi Kramberger - [LinkedIn](https://www.linkedin.com/in/arthur-kramberger/) - [Instagram](https://www.instagram.com/arthur_kramberger)

GitHub: [arthurcuri](https://github.com/arthurcuri)
